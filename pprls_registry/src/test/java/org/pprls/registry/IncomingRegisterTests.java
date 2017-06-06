package org.pprls.registry;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.h2.tools.Server;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.pprls.core.EntityDescriptor;
import org.pprls.core.Nobody;
import org.pprls.core.dto.RegistryRecordDto;
import org.pprls.registry.domain.*;
import org.pprls.registry.domain.service.RegistrationService;
import org.pprls.registry.service.FileService;
import org.pprls.registry.service.MessageService;
import org.pprls.registry.service.audit.repositories.AuditingOutgoingRepository;
import org.pprls.registry.service.repositories.OutgoingRepository;
import org.pprls.registry.service.repositories.IncomingRepository;
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
import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@EntityScan("org.pprls.registry.domain")
@EnableRabbit
@EnableElasticsearchRepositories(basePackages = "org/pprls/registry/service/audit/repositories/")
public class IncomingRegisterTests {

    @Mock
    private RegistrationService registrationService;
    @Autowired
    private FileService fileService;
    @Autowired
    private IncomingRepository registrtyRepository;
    @Autowired
    private AuditingOutgoingRepository audtitingRepository;
    @Autowired
    private OutgoingRepository registryRepository;
    @Autowired
    private MessageService messageService;

    private Instant instant = Instant.parse("2017-4-27 9:28");
    private Year year = Year.get(instant.get(ChronoField.YEAR));
    private short regnum = 6;


    @BeforeClass
    /* Start server to be able to access h2 database form the web. */
    public static void initTest() {
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
        when(registrationService.getNumberForYear(year))
                .thenReturn(new RegistryNumber(regnum, instant, year));

    }

    @After
    public void tearDown() {
        registryRepository.deleteAll();
        audtitingRepository.deleteAll();
    }


    @Test
    public void registerIncoming() {
        Correspondent sender = Builder.INSTANCE.createCorrespondent(CorrespondentType.SENDER);
        Incoming incoming = Builder.INSTANCE.createIncoming(sender);

        incoming.setSubject("Some subject");
        incoming.setAda("some Ada");
        incoming.setClassification(Classification.PUBLIC);
        incoming.setComments("My Comments");
        incoming.setTag("2016 ΚΑΤΑΓΓΕΛΙΑ");
        incoming.setType(DocumentType.DOCUMENT);
        incoming.setAttachedFilesDescription("The description of the attached files");

        when(registrationService.getNumberForYear(Year.YEAR_EPOCH))
                .thenReturn(new RegistryNumber(regnum, instant, year));
        RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);

        incoming.setRegistryNumber(number);
        List<String> filenames = new ArrayList<>();

        // from: location on disk to read from
        // to: location to write to
        for (String filename : filenames) {
            incoming.getFilepaths().add(fileService.upload(filename, incoming.mapToFilepath(filename)));
        }

        registrtyRepository.save(incoming);

        List<Incoming> resultIncomings = registrtyRepository.findByRegistryNumber(number);

        assertEquals(1, resultIncomings.size());
        assertEquals(regnum, resultIncomings.get(0).getRegistryNumber().getRegistryNumber());
        assertEquals(year, resultIncomings.get(0).getRegistryNumber().getYear());
        assertEquals(instant, resultIncomings.get(0).getRegistryNumber().getDate());

        Set<EntityDescriptor> entities = new HashSet<>();
        entities.add(new Nobody());
        RegistryRecordDto inDto = new RegistryRecordDto(incoming.getId(), entities);
        String jsonString = "";
        try {
            jsonString = inDto.toJSON();
        } catch (JsonProcessingException e) {
            Assert.fail(e.getLocalizedMessage());
        }
        Message message = MessageBuilder.withBody(jsonString.getBytes())
                .setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(incoming.getId().toString())
                .setHeader("Event", "CreateIncoming").build();
        messageService.send(message);
    }

	@Test
	public void cancelIncoming() {
		RegistryNumber number = new RegistryNumber(regnum, instant, year);

		List<Incoming> resultIncomins = registrtyRepository.findByRegistryNumber(number);

		assertEquals(1, resultIncomins.size());
		Incoming incoming = resultIncomins.get(0);
		EntityDescriptor handler = new EntityDescriptor();
		incoming.cancel(handler, "Cancel the bloody thing");
		registrtyRepository.save(incoming);

		resultIncomins = registrtyRepository.findByRegistryNumber(number);
		assertEquals(1, resultIncomins.size());
		incoming = resultIncomins.get(0);
		assertEquals(RegistryState.CANCELLED, incoming.getCurrentStatus().getState());

        Set<EntityDescriptor> entities = new HashSet<>();
        entities.add(new Nobody());
        RegistryRecordDto inDto = new RegistryRecordDto(incoming.getId(), entities);
        String jsonString = "";
        try {
            jsonString = inDto.toJSON();
        } catch (JsonProcessingException e) {
            Assert.fail(e.getLocalizedMessage());
        }
		Message message = MessageBuilder.withBody(jsonString.getBytes())
				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(incoming.getId().toString())
				.setHeader("Event", "CancelIncomingg").build();
		messageService.send(message);

	}

	@Test
	public void revertOutgoing() {
		RegistryNumber number = new RegistryNumber(regnum, instant, year);

		List<Incoming> resultIncomings = registrtyRepository.findByRegistryNumber(number);

		assertEquals(1, resultIncomings.size());
		assertEquals(regnum, resultIncomings.get(0).getRegistryNumber().getRegistryNumber());
		assertEquals(year, resultIncomings.get(0).getRegistryNumber().getYear());
		assertEquals(instant, resultIncomings.get(0).getRegistryNumber().getDate());

		Incoming incoming = resultIncomings.get(0);
		incoming.revert();
		registrtyRepository.save(incoming);

        Set<EntityDescriptor> entities = new HashSet<>();
        entities.add(new Nobody());
        RegistryRecordDto inDto = new RegistryRecordDto(incoming.getId(), entities);
        String jsonString = "";
        try {
            jsonString = inDto.toJSON();
        } catch (JsonProcessingException e) {
            Assert.fail(e.getLocalizedMessage());
        }
		Message message = MessageBuilder.withBody(jsonString.getBytes())
				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(incoming.getId().toString())
				.setHeader("Event", "RevertIncoming").build();
		messageService.send(message);

		resultIncomings = registrtyRepository.findByRegistryNumber(number);
		incoming = resultIncomings.get(0);
		assertEquals(RegistryState.ACTIVE, incoming.getCurrentStatus().getState());

	}

	@Test
	public void changeSubjectOfIncoming() {
		RegistryNumber number = new RegistryNumber(regnum, instant, year);

		List<Incoming> resultIncomings = registrtyRepository.findByRegistryNumber(number);
		Incoming incoming = resultIncomings.get(0);
		incoming.setSubject("New subject");

        Set<EntityDescriptor> entities = new HashSet<>();
        entities.add(new Nobody());
        RegistryRecordDto inDto = new RegistryRecordDto(incoming.getId(), entities);
        String jsonString = "";
        try {
            jsonString = inDto.toJSON();
        } catch (JsonProcessingException e) {
            Assert.fail(e.getLocalizedMessage());
        }
		Message message = MessageBuilder.withBody(jsonString.getBytes())
				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(incoming.getId().toString())
				.setHeader("Event", "ChangeIncoming").build();
		messageService.send(message);

		resultIncomings = registrtyRepository.findByRegistryNumber(number);
		incoming = resultIncomings.get(0);
		assertEquals("New subject", incoming.getSubject());
	}

}
