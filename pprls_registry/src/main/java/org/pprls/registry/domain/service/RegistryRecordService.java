/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.pprls.core.EntityDescriptor;
import org.pprls.core.dto.RegistryRecordDto;
import org.pprls.registry.domain.*;
import org.pprls.registry.service.FileService;
import org.pprls.registry.service.MessageService;
import org.pprls.registry.service.audit.repositories.AuditingOutgoingRepository;
import org.pprls.registry.service.repositories.OutgoingRepository;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Domain service that provides new registration numbers
 */
@Service
public class RegistryRecordService {

	@Autowired
	private RegistrationService registrationService;
	@Autowired
	private FileService fileService;
	@Autowired
	private OutgoingRepository registryRepository;
	@Autowired
	private AuditingOutgoingRepository auditingRepository;

	@Autowired
	private MessageService messageService;

	/**
     * The constructor
     */
    @Autowired
    public RegistryRecordService() {
    }

	@Transactional
	public Outgoing create(Outgoing outgoing){
		
		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);

		outgoing.setRegistryNumber(number);
		List<String> filenames = new ArrayList<>();

		// from: location on disk to read from
		// to: location to write to
		for (String filename : filenames) {
			outgoing.getFilepaths().add(fileService.upload(filename, outgoing.mapToFilepath(filename)));
		}

        outgoing = registryRepository.save(outgoing);

		RegistryRecordDto outDto = new RegistryRecordDto(outgoing.getId(), outgoing.getEntityDescriptors());
		String jsonString = "";
		try {
			jsonString = outDto.toJSON();
		} catch (JsonProcessingException e) {
			fail(e.getLocalizedMessage());
		}
		Message message = MessageBuilder.withBody(jsonString.getBytes())
				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(outgoing.getId().toString())
				.setHeader("Event", "CreateOutgoing").build();
		messageService.send(message);

		return outgoing;
	}

	public Outgoing update(Outgoing outgoing){
        outgoing = registryRepository.save(outgoing);

		RegistryRecordDto outDto = new RegistryRecordDto(outgoing.getId(), outgoing.getEntityDescriptors());
		String jsonString = "";
		try {
			jsonString = outDto.toJSON();
		} catch (JsonProcessingException e) {
			fail(e.getLocalizedMessage());
		}
		Message message = MessageBuilder.withBody(jsonString.getBytes())
				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(outgoing.getId().toString())
				.setHeader("Event", "UpdateOutgoing").build();
		messageService.send(message);

		return outgoing;
	}

	public Outgoing cancel(Outgoing outgoing, EntityDescriptor handler){
		outgoing.cancel(handler, "Cancel the bloody thing");
        outgoing = registryRepository.save(outgoing);

		RegistryRecordDto outDto = new RegistryRecordDto(outgoing.getId(), outgoing.getEntityDescriptors());
		String jsonString = "";
		try {
			jsonString = outDto.toJSON();
		} catch (JsonProcessingException e) {
			fail(e.getLocalizedMessage());
		}
		Message message = MessageBuilder.withBody(jsonString.getBytes())
				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(outgoing.getId().toString())
				.setHeader("Event", "CancelOutgoing").build();
		messageService.send(message);

		return outgoing;
	}

	@Transactional
	public Outgoing reissue(Outgoing outgoing, EntityDescriptor handler){
		Outgoing replacementOutgoing = outgoing.reissue(handler);
        replacementOutgoing = registryRepository.save(replacementOutgoing);
        outgoing = registryRepository.save(outgoing);

		RegistryRecordDto outDto = new RegistryRecordDto(replacementOutgoing.getId(), replacementOutgoing.getEntityDescriptors());
		String jsonString = "";
		try {
			jsonString = outDto.toJSON();
		} catch (JsonProcessingException e) {
			fail(e.getLocalizedMessage());
		}
		Message message = MessageBuilder.withBody(jsonString.getBytes())
				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(outgoing.getId().toString())
				.setHeader("Event", "ReissueOutgoing").build();
		messageService.send(message);
		return replacementOutgoing;
	}

	@Transactional
	public Outgoing revert(Outgoing outgoing, EntityDescriptor handler){
		Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC, "timeStamp"));
		Stream<OutgoingHistory> stream = auditingRepository.findByOutgoingId(outgoing.getId(), new PageRequest(0, 2, sort))
				.getContent()
				.stream();
		Iterator<OutgoingHistory> iterator = stream.iterator();
		OutgoingHistory lastRecord = null;
		while(iterator.hasNext()){
			lastRecord = iterator.next();
			System.out.println(lastRecord.getOutgoing().getCurrentStatus().getState().getLiteral());
		}


		assertEquals(RegistryState.ACTIVE_VALUE, lastRecord.getOutgoing().getCurrentStatus().getState().getValue());
		lastRecord.getOutgoing().getCurrentStatus().setHandler(handler); //replace handel with the person how is down the revert
		outgoing.revertTo(lastRecord.getOutgoing());
		outgoing = registryRepository.save(outgoing);

		RegistryRecordDto outDto = new RegistryRecordDto(outgoing.getId(), outgoing.getEntityDescriptors());
		String jsonString = "";
		try {
			jsonString = outDto.toJSON();
		} catch (JsonProcessingException e) {
			fail(e.getLocalizedMessage());
		}
		Message message = MessageBuilder.withBody(jsonString.getBytes())
				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(outgoing.getId().toString())
				.setHeader("Event", "RevertToOutgoing").build();
		messageService.send(message);
		return outgoing;
	}

    /**
     * Setters to be used by @InjectMocks
     */
    public void setRegistrationService(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
} 
