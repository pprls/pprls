package org.pprls.registry;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;
//import static org.mockito.Mockito.when;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.pprls.core.DocumentStatus;
//import org.pprls.core.DocumentType;
//import org.pprls.registry.domain.Builder;
//import org.pprls.registry.domain.Classification;
//import org.pprls.registry.domain.Correspondent;
//import org.pprls.registry.domain.CorrespondentType;
//import org.pprls.registry.domain.EntityDescriptor;
//import org.pprls.registry.domain.Incoming;
//import org.pprls.registry.domain.Outgoing;
//import org.pprls.registry.domain.RegistryNumber;
//import org.pprls.registry.domain.Year;
//import org.pprls.registry.domain.service.RegistrationService;
//import org.pprls.registry.dto.IncomingDto;
//import org.pprls.registry.dto.IncomingDto;
//import org.pprls.registry.service.FileService;
//import org.pprls.registry.service.MessageService;
//import org.pprls.registry.service.repository.IncomingRepository;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.core.MessageBuilder;
//import org.springframework.amqp.core.MessageProperties;
//import org.springframework.amqp.rabbit.annotation.EnableRabbit;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.fasterxml.jackson.core.JsonProcessingException;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@EntityScan("org.pprls.registry.domain")
//@EnableRabbit
//public class IncomingRegisterTests {
//
//	@Mock
//	private RegistrationService registrationService;
//	@Autowired
//	private FileService fileService;
//	@Autowired
//	private IncomingRepository registrtyRepository;
//	@Mock
//	private MessageService messageService;
//
//	@Before
//	public void setup() {
//		MockitoAnnotations.initMocks(this);
//	}
//
//	@Test
//	public void registerIncoming() {
//		Correspondent sender = Builder.INSTANCE.createCorrespondent(CorrespondentType.SENDER);
//		Incoming incoming = Builder.INSTANCE.createIncoming(sender);
//
//		incoming.setSubject("Some subject");
//		incoming.setAda("some Ada");
//		incoming.setClassification(Classification.PUBLIC);
//		incoming.setComments("My Comments");
//		incoming.setTag("ΔΠ 2016 ΚΑΤΑΓΓΕΛΙΑ");
//		incoming.setType(DocumentType.DOCUMENT);
//		incoming.setAttachedFilesDescription("The description of the attached files");
//
//		LocalDateTime datetime = LocalDateTime.of(2017, 04, 27, 9, 28);
//		Year year = Year.get(datetime.getYear());
//		short regnum = 6;
//		when(registrationService.getNumberForYear(Year.YEAR_EPOCH))
//				.thenReturn(new RegistryNumber(regnum, datetime, year));
//		RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_EPOCH);
//
//		incoming.setRegistryNumber(number);
//		List<String> filenames = new ArrayList<>();
//
//		// from: location on disk to read from
//		// to: location to write to
//		for (String filename : filenames) {
//			incoming.getFilepaths().add(fileService.upload(filename, incoming.mapToFilepath(filename)));
//		}
//
//		registrtyRepository.save(incoming);
//
//		List<Incoming> resultIncomings = registrtyRepository.findByRegistryNumber(number);
//
//		assertEquals(1, resultIncomings.size());
//		assertEquals(regnum, resultIncomings.get(0).getRegistryNumber().getRegistryNumber());
//		assertEquals(year, resultIncomings.get(0).getRegistryNumber().getYear());
//		assertEquals(datetime, resultIncomings.get(0).getRegistryNumber().getDate());
//
//		IncomingDto inDto = new IncomingDto(incoming);
//		String jsonString = "";
//		try {
//			jsonString = inDto.toJSON();
//		} catch (JsonProcessingException e) {
//			fail(e.getLocalizedMessage());
//		}
//		Message message = MessageBuilder.withBody(jsonString.getBytes())
//				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(incoming.getId().toString())
//				.setHeader("Event", "CreateIncoming").build();
//		messageService.send(message);
//	}
//	
//	@Test
//	public void cancelIncoming() {
//		LocalDateTime datetime = LocalDateTime.of(2017, 04, 27, 9, 28);
//		Year year = Year.get(datetime.getYear());
//		short regnum = 6;
//		RegistryNumber number = new RegistryNumber(regnum, datetime, year);
//
//		List<Incoming> resultIncomins = registrtyRepository.findByRegistryNumber(number);
//
//		assertEquals(1, resultIncomins.size());
//		Incoming incoming = resultIncomins.get(0);
//		EntityDescriptor handler = new EntityDescriptor();
//		incoming.cancel(handler, "Cancel the bloody thing");
//		registrtyRepository.save(incoming);
//
//		resultIncomins = registrtyRepository.findByRegistryNumber(number);
//		assertEquals(1, resultIncomins.size());
//		incoming = resultIncomins.get(0);
//	//	assertEquals(DocumentStatus.CANCELLED, incoming.getState());
//
//		IncomingDto inDto = new IncomingDto(incoming);
//		String jsonString = "";
//		try {
//			jsonString = inDto.toJSON();
//		} catch (JsonProcessingException e) {
//			fail(e.getLocalizedMessage());
//		}
//		Message message = MessageBuilder.withBody(jsonString.getBytes())
//				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(incoming.getId().toString())
//				.setHeader("Event", "CancelIncomingg").build();
//		messageService.send(message);
//
//	}
//
//	@Test
//	public void revertOutgoing() {
//		LocalDateTime datetime = LocalDateTime.of(2017, 04, 27, 9, 28);
//		Year year = Year.get(datetime.getYear());
//		short regnum = 6;
//		RegistryNumber number = new RegistryNumber(regnum, datetime, year);
//
//		List<Incoming> resultIncomings = registrtyRepository.findByRegistryNumber(number);
//
//		assertEquals(1, resultIncomings.size());
//		assertEquals(regnum, resultIncomings.get(0).getRegistryNumber().getRegistryNumber());
//		assertEquals(year, resultIncomings.get(0).getRegistryNumber().getYear());
//		assertEquals(datetime, resultIncomings.get(0).getRegistryNumber().getDate());
//
//		Incoming incoming = resultIncomings.get(0);
//		EntityDescriptor handler = new EntityDescriptor();
//		incoming.revert(handler, "Reverting because we changed our mind");
//		registrtyRepository.save(incoming);
//
//		IncomingDto inDto = new IncomingDto(incoming);
//		String jsonString = "";
//		try {
//			jsonString = inDto.toJSON();
//		} catch (JsonProcessingException e) {
//			fail(e.getLocalizedMessage());
//		}
//		Message message = MessageBuilder.withBody(jsonString.getBytes())
//				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(incoming.getId().toString())
//				.setHeader("Event", "RevertIncoming").build();
//		messageService.send(message);
//
//		resultIncomings = registrtyRepository.findByRegistryNumber(number);
//		incoming = resultIncomings.get(0);
//	//	assertEquals(DocumentStatus.START, incoming.getState());
//
//	}
//	
//	@Test
//	public void changeSubjectOfIncoming() {
//		
//		LocalDateTime datetime = LocalDateTime.of(2017, 04, 27, 9, 28);
//		Year year = Year.get(datetime.getYear());
//		short regnum = 6;
//		RegistryNumber number = new RegistryNumber(regnum, datetime, year);
//		
//		List<Incoming> resultIncomings = registrtyRepository.findByRegistryNumber(number);
//		Incoming incoming = resultIncomings.get(0);
//		incoming.setSubject("New subject");
//		
//		IncomingDto inDto = new IncomingDto(incoming);
//		String jsonString = "";
//		try {
//			jsonString = inDto.toJSON();
//		} catch (JsonProcessingException e) {
//			fail(e.getLocalizedMessage());
//		}
//		Message message = MessageBuilder.withBody(jsonString.getBytes())
//				.setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN).setMessageId(incoming.getId().toString())
//				.setHeader("Event", "ChangeIncoming").build();
//		messageService.send(message);
//		
//		resultIncomings = registrtyRepository.findByRegistryNumber(number);
//		incoming = resultIncomings.get(0);
//		assertEquals("New subject", incoming.getSubject());
//	}
//
//}
