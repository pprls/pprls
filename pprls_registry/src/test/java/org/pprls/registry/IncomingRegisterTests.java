package org.pprls.registry;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.h2.tools.Server;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.pprls.core.EntityDescriptor;
import org.pprls.core.Nobody;
import org.pprls.core.dto.RegistryRecordDto;
import org.pprls.registry.domain.*;
import org.pprls.registry.domain.service.RegistrationService;
import org.pprls.registry.domain.service.RegistryRecordService;
import org.pprls.registry.service.FileService;
import org.pprls.registry.service.MessageService;
import org.pprls.registry.service.audit.repositories.AuditingIncomingRepository;
import org.pprls.registry.service.audit.repositories.AuditingOutgoingRepository;
import org.pprls.registry.service.repositories.IncomingRepository;
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
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@EntityScan("org.pprls.registry.domain")
@EnableRabbit
@EnableElasticsearchRepositories(basePackages = "org/pprls/registry/service/audit/repositories/")
public class IncomingRegisterTests {

    @Mock
    private MessageService messageService;
    @Mock
    private RegistrationService registrationService;
    @Autowired
    @InjectMocks
    private RegistryRecordService registryRecordService;
    @Autowired
    private AuditingIncomingRepository auditingRepository;
    @Autowired
    private IncomingRepository registryRepository;

    private Instant instant = Instant.parse("2017-04-27T09:28:00.00Z");
    private LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    private Year year = Year.get(ldt.get(ChronoField.YEAR));
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
        auditingRepository.deleteAll();
    }


    @Test
    public void createIncoming() {
        Correspondent sender = Builder.INSTANCE.createCorrespondent(CorrespondentType.SENDER);
        Incoming incoming = Builder.INSTANCE.createIncoming(sender);

        incoming.setSubject("Some subject");
        incoming.setAda("some Ada");
        incoming.setClassification(Classification.PUBLIC);
        incoming.setComments("My Comments");
        incoming.setTag("2016 ΚΑΤΑΓΓΕΛΙΑ");
        incoming.setType(DocumentType.DOCUMENT);
        incoming.setAttachedFilesDescription("The description of the attached files");

        incoming = registryRecordService.create(incoming);
        RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);
        List<Incoming> resultIncomings = registryRepository.findByRegistryNumber(number);

        assertEquals(1, resultIncomings.size());
        assertEquals(regnum, resultIncomings.get(0).getRegistryNumber().getRegistryNumber());
        assertEquals(year, resultIncomings.get(0).getRegistryNumber().getYear());
        assertEquals(instant, resultIncomings.get(0).getRegistryNumber().getDate());
    }


    @Test
    public void cancelIncoming() {
        Correspondent recipient = Builder.INSTANCE.createCorrespondent(CorrespondentType.RECIPIENT);
        Incoming incoming = Builder.INSTANCE.createIncoming(recipient);

        incoming.setSubject("Some subject");
        incoming.setAda("some Ada");
        incoming.setClassification(Classification.PUBLIC);
        incoming.setComments("My Comments");
        incoming.setTag("2016 ΚΑΤΑΓΓΕΛΙΑ");
        incoming.setType(DocumentType.DOCUMENT);
        incoming.setAttachedFilesDescription("The description of the attached files");

        incoming = registryRecordService.create(incoming);
        EntityDescriptor handler = Builder.INSTANCE.createEntityDescriptor();
        incoming = registryRecordService.cancel(incoming, handler);

        RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);
        List<Incoming> resultIncomings = registryRepository.findByRegistryNumber(number);
        assertEquals(1, resultIncomings.size());
        assertEquals(RegistryState.CANCELLED, resultIncomings.get(0).getCurrentStatus().getState());
    }
}
