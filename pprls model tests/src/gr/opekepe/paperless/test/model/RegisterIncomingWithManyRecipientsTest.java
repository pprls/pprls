package gr.opekepe.paperless.test.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.pprls.application.services.services.FileService;
import org.pprls.application.services.services.ServicesFactory;
import org.pprls.registration.Classification;
import org.pprls.registration.Incoming;
import org.pprls.registration.PostalMethod;
import org.pprls.registration.Recipient;
import org.pprls.registration.RegistrationFactory;
import org.pprls.registration.RegistrationService;
import org.pprls.registration.RegistryNumber;

public class RegisterIncomingWithManyRecipientsTest {
	private RegistrationService registrationService;
	private FileService fileService;
	
	@Before
	public void setUp()
	{
		registrationService = RegistrationFactory.INSTANCE.createRegistrationService();
		fileService = ServicesFactory.INSTANCE.createFileService();
	}
	@Test
	public void registerIncoming() {
		Incoming incoming = BuildersFactory.INSTANCE.createIncomingBuilder().build();

		incoming.setSubject("Some subject");
		incoming.createPostageInfo(Calendar.getInstance().getTime(), PostalMethod.COURIER, "voucherNumber");

		incoming.createSender("00000000", 
								"name", 
								"address", 
								"1/1", Calendar.getInstance().getTime());
		
		incoming.setAda("Some Ada");
		
		incoming.setClassification(Classification.INTERNAL);
		//incoming.setTag(Tag)
		List<String> filenames = new ArrayList<>();
		
		
		RegistryNumber number  = registrationService.getNumberForYear(Year.YEAR_2017);
		
		incoming.setRegistrynumber(number);
		//from: location on disk to read from
		//to: location to write to
		for (String filename: filenames) {
			incoming.getFilepaths().add(fileService.upload(filename, incoming.mapToFilepath(filename)));
			
		}
		
		List<Recipient> recipients = new ArrayList<>();
		
		incoming.getRecipients().addAll(recipients);
		
		//for each Recipient create event to generate Document...
	}

}
