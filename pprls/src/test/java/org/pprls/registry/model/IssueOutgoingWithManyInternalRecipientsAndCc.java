package org.pprls.registry.model;

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
import org.pprls.document.domain.DocumentType;
import org.pprls.registry.domain.Builder;
import org.pprls.registry.domain.Classification;
import org.pprls.registry.domain.Correspondent;
import org.pprls.registry.domain.EntityDescriptor;
import org.pprls.registry.domain.Outgoing;
import org.pprls.registry.domain.RegistryNumber;
import org.pprls.registry.domain.Year;
import org.pprls.registry.domain.service.RegistrationService;
import org.pprls.registry.dto.OutgoingDto;
import org.pprls.registry.service.FileService;
import org.pprls.registry.service.MessageService;
import org.pprls.registry.service.repository.RegistryRepository;
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
@EntityScan("org.pprls.registry.registry.domain")
@EnableRabbit
public class IssueOutgoingWithManyInternalRecipientsAndCc {
	
	@Mock
	private RegistrationService registrationService;
	@Autowired
	private FileService fileService;
	@Autowired
	private RegistryRepository registrtyRepository;
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

		List<Correspondent> correspondants = new ArrayList<>();
		Correspondent correspondant = Builder.INSTANCE.createCorrespondent();
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
		
		OutgoingDto outDto = new OutgoingDto(outgoing);
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
