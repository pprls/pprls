package gr.opekepe.paperless.test.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.pprls.application.services.services.FileService;
import org.pprls.application.services.services.ServicesFactory;
import org.pprls.registration.Classification;
import org.pprls.registration.DocumentType;
import org.pprls.registration.EmployeeDescriptor;
import org.pprls.registration.Incoming;
import org.pprls.registration.Outgoing;
import org.pprls.registration.Recipient;
import org.pprls.registration.RecipientType;
import org.pprls.registration.RegistrationFactory;
import org.pprls.registration.RegistrationService;

public class ReissueOutgoingWithInternalRecipientsAndCc {
	private RegistrationService registrationService;
	private FileService fileService;
	
	@Before
	public void setUp()
	{
		registrationService = RegistrationFactory.INSTANCE.createRegistrationService();
		fileService = ServicesFactory.INSTANCE.createFileService();
	}

	@Test
	public void test() {
		Outgoing outgoing = BuildersFactory.INSTANCE.createOutgoingBuilder().build();

		List<EmployeeDescriptor> editors = new ArrayList<>();
		outgoing.getEditor().addAll(editors);
		
		List<Recipient> recipients = new ArrayList<>();
		outgoing.getRecipients().addAll(recipients);
		
		outgoing.setI
		
		outgoing.setSubject("Some subject");
	    outgoing.setAda("some Ada");
	    outgoing.setClassification(Classification.PUBLIC);
	    outgoing.setComments("My Commnets");
	    //  outgoing.setTag(List<Tag>);
	    outgoing.setType(DocumentType.DOCUMENT);
	    outgoing.setAttachedFilesDescription("The description of the attached files");
	    List<String> filenames = new ArrayList<>();
        //from: location on disk to read from
	  	//to: location to write to
	  	for (String filename: filenames) {
	  		outgoing.getFilepaths().add(fileService.upload(filename, incoming.mapToFilepath(filename)));		
	  	}

	}

}
