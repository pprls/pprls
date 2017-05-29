package org.pprls.registry;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.h2.tools.Server;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.pprls.core.EntityDescriptor;
import org.pprls.core.dto.RegistryRecordDto;
import org.pprls.registry.domain.*;
import org.pprls.registry.domain.service.OutgoingRegistryHistory;
import org.pprls.registry.domain.service.RegistrationService;
import org.pprls.registry.service.FileService;
import org.pprls.registry.service.MessageService;
import org.pprls.registry.service.audit.repositories.AuditingOutgoingRepository;
import org.pprls.registry.service.repositories.OutgoingRepository;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@EntityScan("org.pprls.registry.domain")
@EnableRabbit
@EnableElasticsearchRepositories(basePackages = "org/pprls/registry/service/audit/repositories/")
//@ContextConfiguration(classes=ElasticConfiguration.class)
public class OutgoingRegisterTest {

	@Mock
	private RegistrationService registrationService;
	@Autowired
	private FileService fileService;
	@Autowired
	private AuditingOutgoingRepository audtitingRepository;
	@Autowired
	private OutgoingRepository registryRepository;
	// @Mock
	@Autowired
	private MessageService messageService;

	private LocalDateTime datetime = LocalDateTime.of(2017, 4, 27, 9, 28);
	private Year year = Year.get(datetime.getYear());
	private short regnum = 6;
	
	@BeforeClass
	public static void initTest(){
	    try {
			Server webServer = Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082");
			webServer.start();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Before
	public void setup() {

		MockitoAnnotations.initMocks(this);

		when(registrationService.getNumberForYear(Year.YEAR_EPOCH))
				.thenReturn(new RegistryNumber(regnum, datetime, year));

	}
	
	@After
	public void tearDown() {
		registryRepository.deleteAll();
		audtitingRepository.deleteAll();
	}

	@Test
	public void issueOutgoing() {

		EntityDescriptor newHandler = Builder.INSTANCE.createEntityDescriptor();
		Set<EntityDescriptor> issuers = new TreeSet<>();
		Outgoing outgoing = Builder.INSTANCE.createOutgoing(issuers, newHandler);

		Set<EntityDescriptor> editors = new TreeSet<>();
		outgoing.addEditors(editors);

		List<Correspondent> correspondants = new ArrayList<>();
		Correspondent correspondent = Builder.INSTANCE.createCorrespondent(CorrespondentType.RECIPIENT);
		EntityDescriptor newEntityDescriptor = Builder.INSTANCE.createEntityDescriptor();
		correspondent.setEntityDescriptor(newEntityDescriptor);
		correspondants.add(correspondent);
		outgoing.addCorrespondents(correspondants);

		outgoing.setSubject("Some subject");
		outgoing.setAda("some Ada");
		outgoing.setClassification(Classification.PUBLIC);
		outgoing.setComments("My Comments");
		outgoing.setTag("ΔΠ 2016 ΚΑΤΑΓΓΕΛΙΑ");
		outgoing.setType(DocumentType.DOCUMENT);
		outgoing.setAttachedFilesDescription("The description of the attached files");

		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);

		outgoing.setRegistryNumber(number);
		List<String> filenames = new ArrayList<>();

		// from: location on disk to read from
		// to: location to write to
		for (String filename : filenames) {
			outgoing.getFilepaths().add(fileService.upload(filename, outgoing.mapToFilepath(filename)));
		}

		registryRepository.save(outgoing);

		List<Outgoing> resultOutgoings = registryRepository.findByRegistryNumber(number);

		assertEquals(1, resultOutgoings.size());
		assertEquals(regnum, resultOutgoings.get(0).getRegistryNumber().getRegistryNumber());
		assertEquals(year, resultOutgoings.get(0).getRegistryNumber().getYear());
		assertEquals(datetime, resultOutgoings.get(0).getRegistryNumber().getDate());

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

	}

	@Test
	public void cancelOutgoing() {
		
		EntityDescriptor newHandler = Builder.INSTANCE.createEntityDescriptor();
		Set<EntityDescriptor> issuers = new TreeSet<>();
		Outgoing outgoing = Builder.INSTANCE.createOutgoing(issuers, newHandler);

		Set<EntityDescriptor> editors = new TreeSet<>();
		outgoing.addEditors(editors);

		List<Correspondent> correspondants = new ArrayList<>();
		Correspondent correspondent = Builder.INSTANCE.createCorrespondent(CorrespondentType.RECIPIENT);
		EntityDescriptor newEntityDescriptor = Builder.INSTANCE.createEntityDescriptor();
		correspondent.setEntityDescriptor(newEntityDescriptor);
		correspondants.add(correspondent);
		outgoing.addCorrespondents(correspondants);

		outgoing.setSubject("Some subject");
		outgoing.setAda("some Ada");
		outgoing.setClassification(Classification.PUBLIC);
		outgoing.setComments("My Comments");
		outgoing.setTag("ΔΠ 2016 ΚΑΤΑΓΓΕΛΙΑ");
		outgoing.setType(DocumentType.DOCUMENT);
		outgoing.setAttachedFilesDescription("The description of the attached files");

		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);

		outgoing.setRegistryNumber(number);
		List<String> filenames = new ArrayList<>();

		// from: location on disk to read from
		// to: location to write to
		for (String filename : filenames) {
			outgoing.getFilepaths().add(fileService.upload(filename, outgoing.mapToFilepath(filename)));
		}

		registryRepository.save(outgoing);

		EntityDescriptor handler = new EntityDescriptor();
		outgoing.cancel(handler, "Cancel the bloody thing");
		registryRepository.save(outgoing);

		List<Outgoing> resultOutgoings = registryRepository.findByRegistryNumber(number);
		assertEquals(1, resultOutgoings.size());
		outgoing = resultOutgoings.get(0);
		assertEquals(RegistryState.CANCELLED, outgoing.getCurrentStatus().getState());

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

	}

	@Test
	public void revertOutgoing() {
		
		EntityDescriptor newHandler = Builder.INSTANCE.createEntityDescriptor();
		Set<EntityDescriptor> issuers = new TreeSet<>();
		Outgoing outgoing = Builder.INSTANCE.createOutgoing(issuers, newHandler);

		Set<EntityDescriptor> editors = new TreeSet<>();
		outgoing.addEditors(editors);

		List<Correspondent> correspondants = new ArrayList<>();
		Correspondent correspondent = Builder.INSTANCE.createCorrespondent(CorrespondentType.RECIPIENT);
		EntityDescriptor newEntityDescriptor = Builder.INSTANCE.createEntityDescriptor();
		correspondent.setEntityDescriptor(newEntityDescriptor);
		correspondants.add(correspondent);
		outgoing.addCorrespondents(correspondants);

		outgoing.setSubject("Some subject");
		outgoing.setAda("some Ada");
		outgoing.setClassification(Classification.PUBLIC);
		outgoing.setComments("My Comments");
		outgoing.setTag("ΔΠ 2016 ΚΑΤΑΓΓΕΛΙΑ");
		outgoing.setType(DocumentType.DOCUMENT);
		outgoing.setAttachedFilesDescription("The description of the attached files");

		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);

		outgoing.setRegistryNumber(number);
		List<String> filenames = new ArrayList<>();

		// from: location on disk to read from
		// to: location to write to
		for (String filename : filenames) {
			outgoing.getFilepaths().add(fileService.upload(filename, outgoing.mapToFilepath(filename)));
		}
        // ACTIVE
		outgoing = registryRepository.save(outgoing);
		
		EntityDescriptor handler = new EntityDescriptor();
		outgoing.cancel(handler, "Cancel the bloody thing");
		// CANCEL
		outgoing = registryRepository.save(outgoing);

		List<OutgoingRegistryHistory> lastRecord = audtitingRepository.findByOutgoingIdOrderByTimeStampAsc(outgoing.getId());
		// ACTIVE
		assertTrue(!lastRecord.isEmpty());
		outgoing.revertTo(lastRecord.get(0).getOutgoing());
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
				.setHeader("Event", "RevertOutgoing").build();
		messageService.send(message);

		List<Outgoing> resultOutgoings = registryRepository.findByRegistryNumber(number);
		outgoing = resultOutgoings.get(0);
		assertEquals(RegistryState.ACTIVE, outgoing.getCurrentStatus().getState());

	}

	@Test
	public void editOutgoingAndAddInternalRecipient() {
		
		EntityDescriptor newHandler = Builder.INSTANCE.createEntityDescriptor();
		Set<EntityDescriptor> issuers = new TreeSet<>();
		Outgoing outgoing = Builder.INSTANCE.createOutgoing(issuers, newHandler);

		Set<EntityDescriptor> editors = new TreeSet<>();
		outgoing.addEditors(editors);

		List<Correspondent> correspondants = new ArrayList<>();
		Correspondent correspondent = Builder.INSTANCE.createCorrespondent(CorrespondentType.RECIPIENT);
		EntityDescriptor newEntityDescriptor = Builder.INSTANCE.createEntityDescriptor();
		correspondent.setEntityDescriptor(newEntityDescriptor);
		correspondants.add(correspondent);
		outgoing.addCorrespondents(correspondants);

		outgoing.setSubject("Some subject");
		outgoing.setAda("some Ada");
		outgoing.setClassification(Classification.PUBLIC);
		outgoing.setComments("My Comments");
		outgoing.setTag("ΔΠ 2016 ΚΑΤΑΓΓΕΛΙΑ");
		outgoing.setType(DocumentType.DOCUMENT);
		outgoing.setAttachedFilesDescription("The description of the attached files");

		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);

		outgoing.setRegistryNumber(number);
		List<String> filenames = new ArrayList<>();

		// from: location on disk to read from
		// to: location to write to
		for (String filename : filenames) {
			outgoing.getFilepaths().add(fileService.upload(filename, outgoing.mapToFilepath(filename)));
		}

		registryRepository.save(outgoing);

		Correspondent internal = Builder.INSTANCE.createCorrespondent(CorrespondentType.INTERNAL);
		outgoing.getCorrespondents().add(internal);

		registryRepository.save(outgoing);

		RegistryRecordDto outDto = new RegistryRecordDto(outgoing.getId(), outgoing.getEntityDescriptors());
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

		List<Outgoing> resultOutgoings = registryRepository.findByRegistryNumber(number);
		assertEquals(2, resultOutgoings.get(0).getCorrespondents().size());
	}

	@Test
	public void editOutgoingChangeSubject() {
		
		EntityDescriptor newHandler = Builder.INSTANCE.createEntityDescriptor();
		Set<EntityDescriptor> issuers = new TreeSet<>();
		Outgoing outgoing = Builder.INSTANCE.createOutgoing(issuers, newHandler);

		Set<EntityDescriptor> editors = new TreeSet<>();
		outgoing.addEditors(editors);

		List<Correspondent> correspondants = new ArrayList<>();
		Correspondent correspondent = Builder.INSTANCE.createCorrespondent(CorrespondentType.RECIPIENT);
		EntityDescriptor newEntityDescriptor = Builder.INSTANCE.createEntityDescriptor();
		correspondent.setEntityDescriptor(newEntityDescriptor);
		correspondants.add(correspondent);
		outgoing.addCorrespondents(correspondants);

		outgoing.setSubject("Some subject");
		outgoing.setAda("some Ada");
		outgoing.setClassification(Classification.PUBLIC);
		outgoing.setComments("My Comments");
		outgoing.setTag("ΔΠ 2016 ΚΑΤΑΓΓΕΛΙΑ");
		outgoing.setType(DocumentType.DOCUMENT);
		outgoing.setAttachedFilesDescription("The description of the attached files");

		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);

		outgoing.setRegistryNumber(number);
		List<String> filenames = new ArrayList<>();

		// from: location on disk to read from
		// to: location to write to
		for (String filename : filenames) {
			outgoing.getFilepaths().add(fileService.upload(filename, outgoing.mapToFilepath(filename)));
		}

		registryRepository.save(outgoing);
		
		outgoing.setSubject("New subject");

		registryRepository.save(outgoing);

		RegistryRecordDto outDto = new RegistryRecordDto(outgoing.getId(), outgoing.getEntityDescriptors());
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

		List<Outgoing> resultOutgoings = registryRepository.findByRegistryNumber(number);
		assertEquals("New subject", resultOutgoings.get(0).getSubject());
	}

	@Test
	public void editOutgoingAndRemoveInternalRecipient() {
		
		EntityDescriptor newHandler = Builder.INSTANCE.createEntityDescriptor();
		Set<EntityDescriptor> issuers = new TreeSet<>();
		Outgoing outgoing = Builder.INSTANCE.createOutgoing(issuers, newHandler);

		Set<EntityDescriptor> editors = new TreeSet<>();
		outgoing.addEditors(editors);

		List<Correspondent> correspondants = new ArrayList<>();
		Correspondent correspondent = Builder.INSTANCE.createCorrespondent(CorrespondentType.RECIPIENT);
		EntityDescriptor newEntityDescriptor = Builder.INSTANCE.createEntityDescriptor();
		correspondent.setEntityDescriptor(newEntityDescriptor);
		correspondants.add(correspondent);
		outgoing.addCorrespondents(correspondants);

		outgoing.setSubject("Some subject");
		outgoing.setAda("some Ada");
		outgoing.setClassification(Classification.PUBLIC);
		outgoing.setComments("My Comments");
		outgoing.setTag("ΔΠ 2016 ΚΑΤΑΓΓΕΛΙΑ");
		outgoing.setType(DocumentType.DOCUMENT);
		outgoing.setAttachedFilesDescription("The description of the attached files");

		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);

		outgoing.setRegistryNumber(number);
		List<String> filenames = new ArrayList<>();

		// from: location on disk to read from
		// to: location to write to
		for (String filename : filenames) {
			outgoing.getFilepaths().add(fileService.upload(filename, outgoing.mapToFilepath(filename)));
		}

		registryRepository.save(outgoing);
		
		for (Correspondent corespondent : outgoing.getCorrespondents()) {
			if (corespondent.getCorrespondentType() == CorrespondentType.INTERNAL) {
				outgoing.getCorrespondents().remove(corespondent);
				break;
			}
		}

		registryRepository.save(outgoing);

		RegistryRecordDto outDto = new RegistryRecordDto(outgoing.getId(), outgoing.getEntityDescriptors());
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

		List<Outgoing> resultOutgoings = registryRepository.findByRegistryNumber(number);
		assertEquals(1, resultOutgoings.size());
		assertEquals(1, resultOutgoings.get(0).getCorrespondents().size());
	}

	@Test
	public void reissueOutgoing() {
		
		EntityDescriptor newHandler = Builder.INSTANCE.createEntityDescriptor();
		Set<EntityDescriptor> issuers = new TreeSet<>();
		Outgoing outgoing = Builder.INSTANCE.createOutgoing(issuers, newHandler);

		Set<EntityDescriptor> editors = new TreeSet<>();
		outgoing.addEditors(editors);

		List<Correspondent> correspondants = new ArrayList<>();
		Correspondent correspondent = Builder.INSTANCE.createCorrespondent(CorrespondentType.RECIPIENT);
		EntityDescriptor newEntityDescriptor = Builder.INSTANCE.createEntityDescriptor();
		correspondent.setEntityDescriptor(newEntityDescriptor);
		correspondants.add(correspondent);
		outgoing.addCorrespondents(correspondants);

		outgoing.setSubject("Some subject");
		outgoing.setAda("some Ada");
		outgoing.setClassification(Classification.PUBLIC);
		outgoing.setComments("My Comments");
		outgoing.setTag("ΔΠ 2016 ΚΑΤΑΓΓΕΛΙΑ");
		outgoing.setType(DocumentType.DOCUMENT);
		outgoing.setAttachedFilesDescription("The description of the attached files");

		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);

		outgoing.setRegistryNumber(number);
		List<String> filenames = new ArrayList<>();

		// from: location on disk to read from
		// to: location to write to
		for (String filename : filenames) {
			outgoing.getFilepaths().add(fileService.upload(filename, outgoing.mapToFilepath(filename)));
		}

		registryRepository.save(outgoing);
		
		outgoing.reissue();
		registryRepository.save(outgoing);

		RegistryRecordDto outDto = new RegistryRecordDto(outgoing.getId(), outgoing.getEntityDescriptors());
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

		List<Outgoing> resultOutgoings = registryRepository.findByRegistryNumber(number);
		assertEquals(2, resultOutgoings.size());

		outgoing = resultOutgoings.get(0);
		assertNotNull(outgoing.getReissued());
		//outgoing = resultOutgoings.get(1);
		// assert from the other side

		fail("test is not complete");

	}
}
