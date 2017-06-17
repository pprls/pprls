package org.pprls.registry;

import org.h2.tools.Server;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.pprls.core.EntityDescriptor;
import org.pprls.registry.domain.*;
import org.pprls.registry.domain.service.RegistrationService;
import org.pprls.registry.domain.service.RegistryRecordService;
import org.pprls.registry.service.MessageService;
import org.pprls.registry.service.audit.repositories.AuditingOutgoingRepository;
import org.pprls.registry.service.repositories.OutgoingRepository;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
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
public class OutgoingRegisterTests {

	@Mock
	private MessageService messageService;
	@Mock
	private RegistrationService registrationService;
	@Autowired
	@InjectMocks
	private RegistryRecordService registryRecordService;
	@Autowired
	private AuditingOutgoingRepository auditingRepository;
	@Autowired
	private OutgoingRepository registryRepository;

	private Instant instant = Instant.parse("2017-04-27T09:28:00.00Z");
	private LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
	private Year year = Year.get(ldt.get(ChronoField.YEAR));
	private short regnum = 6;

	public OutgoingRegisterTests() {
	}

	@BeforeClass
	/* Start server to be able to access h2 database form the web. */
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
		when(registrationService.getNumberForYear(Year.YEAR_EPOCH)).thenReturn(new RegistryNumber(regnum, instant, year));
	}
	
	@After
	public void tearDown() {
		registryRepository.deleteAll();
		auditingRepository.deleteAll();
	}

	@Test
	public void createOutgoing() {

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
		outgoing.setTag("Απάντηση σε ΔΠ 2016 ΚΑΤΑΓΓΕΛΙΑ");
		outgoing.setType(DocumentType.DOCUMENT);
		outgoing.setAttachedFilesDescription("The description of the attached files");


        outgoing = registryRecordService.create(outgoing);
		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);
		List<Outgoing> resultOutgoings = registryRepository.findByRegistryNumber(number);

		assertEquals(1, resultOutgoings.size());
		assertEquals(regnum, resultOutgoings.get(0).getRegistryNumber().getRegistryNumber());
		assertEquals(year, resultOutgoings.get(0).getRegistryNumber().getYear());
		assertEquals(instant, resultOutgoings.get(0).getRegistryNumber().getDate());
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

        outgoing = registryRecordService.create(outgoing);
        outgoing = registryRecordService.cancel(outgoing, newHandler);

		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);
		List<Outgoing> resultOutgoings = registryRepository.findByRegistryNumber(number);
		assertEquals(1, resultOutgoings.size());
		assertEquals(RegistryState.CANCELLED, resultOutgoings.get(0).getCurrentStatus().getState());


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

        outgoing = registryRecordService.create(outgoing);
		EntityDescriptor handler = new EntityDescriptor();
        outgoing = registryRecordService.cancel(outgoing, newHandler);
        outgoing = registryRecordService.revert(outgoing,newHandler);

		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);
		List<Outgoing> resultOutgoings = registryRepository.findByRegistryNumber(number);
        assertEquals(1, resultOutgoings.size());
		assertEquals(RegistryState.ACTIVE, resultOutgoings.get(0).getCurrentStatus().getState());

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
		outgoing = registryRecordService.create(outgoing);
		Correspondent internal = Builder.INSTANCE.createCorrespondent(CorrespondentType.INTERNAL);
		outgoing.getCorrespondents().add(internal);
		outgoing = registryRecordService.update(outgoing);


		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);
		List<Outgoing> resultOutgoings = registryRepository.findByRegistryNumber(number);
		assertEquals(1, resultOutgoings.size());
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

		outgoing = registryRecordService.create(outgoing);
		outgoing.setSubject("New subject");
		outgoing = registryRecordService.update(outgoing);

		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);
		List<Outgoing> resultOutgoings = registryRepository.findByRegistryNumber(number);
		assertEquals(1, resultOutgoings.size());
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
		outgoing = registryRecordService.create(outgoing);
		for (Correspondent corespondent : outgoing.getCorrespondents()) {
			if (corespondent.getCorrespondentType() == CorrespondentType.INTERNAL) {
				outgoing.getCorrespondents().remove(corespondent);
				break;
			}
		}
		outgoing = registryRecordService.update(outgoing);

		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);
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

		outgoing = registryRecordService.create(outgoing);
		outgoing = registryRecordService.reissue(outgoing, newHandler);

		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);
		List<Outgoing> resultOutgoings = registryRepository.findByRegistryNumber(number);
		assertEquals(2, resultOutgoings.size());

		assertEquals(1, resultOutgoings.get(0).getNumberOfRepeats());
        assertEquals(resultOutgoings.get(0).getId(), resultOutgoings.get(1).getReissued());
	}

	public void setAudtitingRepository(AuditingOutgoingRepository auditingRepository) {
		this.auditingRepository = auditingRepository;
	}

	public void setRegistryRepository(OutgoingRepository registryRepository) {
		this.registryRepository = registryRepository;
	}
}
