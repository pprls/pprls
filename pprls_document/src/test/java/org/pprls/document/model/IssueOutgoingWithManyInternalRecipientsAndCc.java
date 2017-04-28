package org.pprls.document.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import java.io.ObjectOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.pprls.document.document.domain.Correspondant;
import org.pprls.document.document.domain.Outgoing;
import org.pprls.document.document.domain.RegistryNumber;
import org.pprls.document.document.domain.service.RegistrationService;
import org.pprls.document.domain.Builder;
import org.pprls.document.domain.Classification;
import org.pprls.document.domain.DocumentType;
import org.pprls.document.domain.EntityDescriptor;
import org.pprls.document.domain.Year;
import org.pprls.document.dto.RegistryRecordDto;
import org.pprls.document.service.FileService;
import org.pprls.document.service.MessageService;
import org.pprls.document.service.repository.DocumentRepository;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@EntityScan("org.pprls.document.document.domain")
@EnableRabbit
public class IssueOutgoingWithManyInternalRecipientsAndCc {
	
	@Mock
	private RegistrationService registrationService;
	@Autowired
	private FileService fileService;
	@Autowired
	private DocumentRepository registrtyRepository;
	@Mock
	private MessageService messageService;

	
	@Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

	@Test
	public void test() {
		
		List<EntityDescriptor> issuers = new ArrayList<>();
		Outgoing outgoing = Builder.INSTANCE.createOutgoing(issuers);
		
		List<EntityDescriptor> editors = new ArrayList<>();
		outgoing.addEditors(editors);

		List<Correspondant> correspondants = new ArrayList<>();
		Correspondant correspondant = Builder.INSTANCE.createCorrespondant();
		EntityDescriptor newEntityDescriptor = Builder.INSTANCE.createEntityDescriptor();
		correspondant.setEntityDescriptor(newEntityDescriptor);
		correspondants.add(correspondant);
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
		when(registrationService.getNumberForYear(Year.YEAR_EPOCH)).thenReturn(new RegistryNumber(regnum, datetime, year));
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
		
		RegistryRecordDto outDto = new RegistryRecordDto(outgoing);
		String jsonString = "";
		try {
			jsonString = outDto.toJSON();
		} catch (JsonProcessingException e) {
			fail(e.getLocalizedMessage());
		}
		Message message = MessageBuilder.withBody(jsonString.getBytes())
			    .setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN)
			    .setMessageId(outgoing.getId().toString())
			    .setHeader("RegistryRecord", "Outgoing")
			    .build();
		messageService.send(message);

	}
}
