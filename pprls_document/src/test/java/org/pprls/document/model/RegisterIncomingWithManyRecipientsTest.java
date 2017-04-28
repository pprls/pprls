package org.pprls.document.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pprls.document.document.domain.Correspondant;
import org.pprls.document.document.domain.Incoming;
import org.pprls.document.document.domain.PostalMethod;
import org.pprls.document.document.domain.RegistryNumber;
import org.pprls.document.document.domain.service.RegistrationService;
import org.pprls.document.domain.Classification;
import org.pprls.document.domain.DocumentType;
import org.pprls.document.domain.Year;
import org.pprls.document.service.FileService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegisterIncomingWithManyRecipientsTest {
	private RegistrationService registrationService;
	private FileService fileService;
	
	@Test
	public void registerIncoming() {
		
		String rr = registrationService.toString();
	rr= rr+1;
		
//		Incoming incoming = OutgoingBuilderFactory.INSTANCE.createIncomingBuilder().build();
//
//		List<Correspontand> correspondants = new ArrayList<>();
//		incoming.getRecipients().addAll(correspondants);
//	
//		incoming.setSubject("Some subject");
//		incoming.setAda("Some Ada");
//		incoming.setClassification(Classification.INTERNAL);
//		incoming.setComments("My Commnets");
//		//incoming.setTag(Tag)
//		incoming.setType(DocumentType.DOCUMENT);
//		incoming.setAttachedFilesDescription("The description of the attached files");
//		List<String> filenames = new ArrayList<>();
//		
//		RegistryNumber number  = registrationService.getNumberForYear(Year.YEAR_2017);
//		
//		incoming.setRegistrynumber(number);
//        //from: location on disk to read from
//	  	//to: location to write to
//	  	for (String filename: filenames) {
//	  		incoming.getFilepaths().add(fileService.upload(filename, incoming.mapToFilepath(filename)));		
//	  	}
//		
//		incoming.setRegistrynumber(number);
//		
//		List<Correspontand> recipients = new ArrayList<>();
//		
//		incoming.getRecipients().addAll(recipients);
//		
//		//for each Recipient create event to generate Document...
	}

}
