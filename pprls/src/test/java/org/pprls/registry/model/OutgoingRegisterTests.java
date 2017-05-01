package org.pprls.registry.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.pprls.core.DocumentStatus;
import org.pprls.core.DocumentType;
import org.pprls.registry.domain.Builder;
import org.pprls.registry.domain.Classification;
import org.pprls.registry.domain.Correspondent;
import org.pprls.registry.domain.CorrespondentType;
import org.pprls.registry.domain.EntityDescriptor;
import org.pprls.registry.domain.Outgoing;
import org.pprls.registry.domain.RegistryNumber;
import org.pprls.registry.domain.Year;
import org.pprls.registry.domain.service.RegistrationService;
import org.pprls.registry.dto.OutgoingDto;
import org.pprls.registry.service.FileService;
import org.pprls.registry.service.MessageService;
import org.pprls.registry.service.repository.OutgoingRepository;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;

@RunWith(SpringRunner.class)
@SpringBootTest
@EntityScan("org.pprls.registry.domain")
@EnableRabbit
public class OutgoingRegisterTests {

	@Mock
	private RegistrationService registrationService;
	@Autowired
	private FileService fileService;
	@Autowired
	private OutgoingRepository registrtyRepository;
	@Mock
	private MessageService messageService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void issueOutgoing() {

		List<EntityDescriptor> issuers = new ArrayList<>();
		Outgoing outgoing = Builder.INSTANCE.createOutgoing(issuers);

		List<EntityDescriptor> editors = new ArrayList<>();
		outgoing.addEditors(editors);

		List<Correspondent> correspondants = new ArrayList<>();
		Correspondent correspondent = Builder.INSTANCE.createCorrespondent(CorrespondentType.RECIPIENT);
		EntityDescriptor newEntityDescriptor = Builder.INSTANCE.createEntityDescriptor();
		correspondent.setEntityDescriptor(newEntityDescriptor);
		correspondants.add(correspondent);
		outgoing.addCorrespondants(correspondants);

		outgoing.setSubject("Some subject");
		outgoing.setAda("some Ada");
		outgoing.setClassification(Classification.PUBLIC);
		outgoing.setComments("My Comments");
		outgoing.setTag("ΔΠ 2016 ΚΑΤΑΓΓΕΛΙΑ");
		outgoing.setType(DocumentType.DOCUMENT);
		outgoing.setAttachedFilesDescription("The description of the attached files");

		LocalDateTime datetime = LocalDateTime.of(2017, 04, 27, 9, 28);
		Year year = Year.get(datetime.getYear());
		short regnum = 6;
		when(registrationService.getNumberForYear(Year.YEAR_EPOCH))
				.thenReturn(new RegistryNumber(regnum, datetime, year));
		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);

		outgoing.setRegistryNumber(number);
		List<String> filenames = new ArrayList<>();

		// from: location on disk to read from
		// to: location to write to
		for (String filename : filenames) {
			outgoing.getFilepaths().add(fileService.upload(filename, outgoing.mapToFilepath(filename)));
		}

		registrtyRepository.save(outgoing);

		List<Outgoing> resultOutgoings = registrtyRepository.findByRegistryNumber(number);

		assertEquals(1, resultOutgoings.size());
		assertEquals(regnum, resultOutgoings.get(0).getRegistryNumber().getRegistryNumber());
		assertEquals(year, resultOutgoings.get(0).getRegistryNumber().getYear());
		assertEquals(datetime, resultOutgoings.get(0).getRegistryNumber().getDate());

		OutgoingDto outDto = new OutgoingDto(outgoing);
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

	}

	@Test
	public void cancelOutgoing() {
		LocalDateTime datetime = LocalDateTime.of(2017, 04, 27, 9, 28);
		Year year = Year.get(datetime.getYear());
		short regnum = 6;
		RegistryNumber number = new RegistryNumber(regnum, datetime, year);

		List<Outgoing> resultOutgoings = registrtyRepository.findByRegistryNumber(number);

		assertEquals(1, resultOutgoings.size());
		Outgoing outgoing = resultOutgoings.get(0);
		EntityDescriptor handler = new EntityDescriptor();
		outgoing.cancel(handler, "Cancel the bloody thing");
		registrtyRepository.save(outgoing);

		resultOutgoings = registrtyRepository.findByRegistryNumber(number);
		assertEquals(1, resultOutgoings.size());
		outgoing = resultOutgoings.get(0);
		assertEquals(DocumentStatus.CANCELLED, outgoing.getState());

		OutgoingDto outDto = new OutgoingDto(outgoing);
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

	}

	@Test
	public void revertOutgoing() {
		LocalDateTime datetime = LocalDateTime.of(2017, 04, 27, 9, 28);
		Year year = Year.get(datetime.getYear());
		short regnum = 6;
		RegistryNumber number = new RegistryNumber(regnum, datetime, year);

		List<Outgoing> resultOutgoings = registrtyRepository.findByRegistryNumber(number);

		assertEquals(1, resultOutgoings.size());
		assertEquals(regnum, resultOutgoings.get(0).getRegistryNumber().getRegistryNumber());
		assertEquals(year, resultOutgoings.get(0).getRegistryNumber().getYear());
		assertEquals(datetime, resultOutgoings.get(0).getRegistryNumber().getDate());

		Outgoing outgoing = resultOutgoings.get(0);
		EntityDescriptor handler = new EntityDescriptor();
		outgoing.revert(handler, "Reverting because we changed our mind");
		registrtyRepository.save(outgoing);

		OutgoingDto outDto = new OutgoingDto(outgoing);
		String jsonString = "";
		try {
			jsonString = outDto.toJSON();
		} catch (JsonProcessingException e) {
			fail(e.getLocalizedMessage());
		}
		Message message = MessageBuilder.withBody(jsonString.getBytes())
				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(outgoing.getId().toString())
				.setHeader("Event", "RevertOutgoing").build();
		messageService.send(message);

		resultOutgoings = registrtyRepository.findByRegistryNumber(number);
		outgoing = resultOutgoings.get(0);
		assertEquals(DocumentStatus.START, outgoing.getState());

	}

	@Test
	public void editOutgoingAndAddInternalRecipient() {
		LocalDateTime datetime = LocalDateTime.of(2017, 04, 27, 9, 28);
		Year year = Year.get(datetime.getYear());
		short regnum = 6;
		RegistryNumber number = new RegistryNumber(regnum, datetime, year);

		List<Outgoing> resultOutgoings = registrtyRepository.findByRegistryNumber(number);

		assertEquals(1, resultOutgoings.size());
		assertEquals(regnum, resultOutgoings.get(0).getRegistryNumber().getRegistryNumber());
		assertEquals(year, resultOutgoings.get(0).getRegistryNumber().getYear());
		assertEquals(datetime, resultOutgoings.get(0).getRegistryNumber().getDate());

		Correspondent internal = Builder.INSTANCE.createCorrespondent(CorrespondentType.INTERNAL);
		Outgoing outgoing = resultOutgoings.get(0);
		outgoing.getCorrespondents().add(internal);

		registrtyRepository.save(outgoing);

		OutgoingDto outDto = new OutgoingDto(outgoing);
		String jsonString = "";
		try {
			jsonString = outDto.toJSON();
		} catch (JsonProcessingException e) {
			fail(e.getLocalizedMessage());
		}
		Message message = MessageBuilder.withBody(jsonString.getBytes())
				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(outgoing.getId().toString())
				.setHeader("Event", "AddCorrespondendToOutgoing").build();
		messageService.send(message);

		resultOutgoings = registrtyRepository.findByRegistryNumber(number);
		assertEquals(2, resultOutgoings.get(0).getCorrespondents().size());
	}

	@Test
	public void editOutgoingChangeSubject() {
		LocalDateTime datetime = LocalDateTime.of(2017, 04, 27, 9, 28);
		Year year = Year.get(datetime.getYear());
		short regnum = 6;
		RegistryNumber number = new RegistryNumber(regnum, datetime, year);

		List<Outgoing> resultOutgoings = registrtyRepository.findByRegistryNumber(number);
		assertEquals(1, resultOutgoings.size());

		Outgoing outgoing = resultOutgoings.get(0);
		assertEquals("Some subject", resultOutgoings.get(0).getSubject());
		outgoing.setSubject("New subject");

		registrtyRepository.save(outgoing);

		OutgoingDto outDto = new OutgoingDto(outgoing);
		String jsonString = "";
		try {
			jsonString = outDto.toJSON();
		} catch (JsonProcessingException e) {
			fail(e.getLocalizedMessage());
		}
		Message message = MessageBuilder.withBody(jsonString.getBytes())
				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(outgoing.getId().toString())
				.setHeader("Event", "ChangeOutgoing").build();
		messageService.send(message);

		resultOutgoings = registrtyRepository.findByRegistryNumber(number);
		assertEquals("New subject", resultOutgoings.get(0).getSubject());
	}

	@Test
	public void editOutgoingAndRemoveInternalRecipient() {
		LocalDateTime datetime = LocalDateTime.of(2017, 04, 27, 9, 28);
		Year year = Year.get(datetime.getYear());
		short regnum = 6;
		RegistryNumber number = new RegistryNumber(regnum, datetime, year);

		List<Outgoing> resultOutgoings = registrtyRepository.findByRegistryNumber(number);
		assertEquals(1, resultOutgoings.size());
		assertEquals(2, resultOutgoings.get(0).getCorrespondents().size());

		Outgoing outgoing = resultOutgoings.get(0);
		for (Correspondent corespondent : outgoing.getCorrespondents()) {
			if (corespondent.getCorrespondentType() == CorrespondentType.INTERNAL) {
				outgoing.getCorrespondents().remove(corespondent);
				break;
			}
		}

		registrtyRepository.save(outgoing);

		OutgoingDto outDto = new OutgoingDto(outgoing);
		String jsonString = "";
		try {
			jsonString = outDto.toJSON();
		} catch (JsonProcessingException e) {
			fail(e.getLocalizedMessage());
		}
		Message message = MessageBuilder.withBody(jsonString.getBytes())
				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(outgoing.getId().toString())
				.setHeader("Event", "RemoveCorrespondentOutgoing").build();
		messageService.send(message);

		resultOutgoings = registrtyRepository.findByRegistryNumber(number);
		assertEquals(1, resultOutgoings.size());
		assertEquals(1, resultOutgoings.get(0).getCorrespondents().size());
	}

	@Test
	public void reissueOutgoing() {
		LocalDateTime datetime = LocalDateTime.of(2017, 04, 27, 9, 28);
		Year year = Year.get(datetime.getYear());
		short regnum = 6;
		RegistryNumber number = new RegistryNumber(regnum, datetime, year);

		List<Outgoing> resultOutgoings = registrtyRepository.findByRegistryNumber(number);
		assertEquals(1, resultOutgoings.size());
		assertEquals(2, resultOutgoings.get(0).getCorrespondents().size());

		Outgoing outgoing = resultOutgoings.get(0);
		outgoing.reissue();

		OutgoingDto outDto = new OutgoingDto(outgoing);
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

		resultOutgoings = registrtyRepository.findByRegistryNumber(number);
		assertEquals(2, resultOutgoings.size());

		outgoing = resultOutgoings.get(0);
		assertNotNull(outgoing.getReissued());
		outgoing = resultOutgoings.get(1);
		// assert from the other side

		fail("test is not complete");

	}
}
