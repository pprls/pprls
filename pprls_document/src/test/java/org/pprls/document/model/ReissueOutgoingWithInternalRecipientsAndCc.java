package org.pprls.document.model;

import org.junit.Test;
import org.pprls.document.document.domain.service.RegistrationService;
import org.pprls.document.service.FileService;

public class ReissueOutgoingWithInternalRecipientsAndCc {
	private RegistrationService registrationService;
	private FileService fileService;
	

	@Test
	public void test() {
//		Outgoing outgoing = OutgoingBuilderFactory.INSTANCE.createOutgoingBuilder().build();
//
//		List<EntityDescriptor> editors = new ArrayList<>();
//		outgoing.addEditors(editors);
//		
//		List<EntityDescriptor> issuers = new ArrayList<>();
//		outgoing.addIssuers(issuers);
//		
//		List<Correspontand> correspondants = new ArrayList<>();
//		outgoing.getRecipients().addAll(correspondants);
//		
//		outgoing.setSubject("Some subject");
//	    outgoing.setAda("some Ada");
//	    outgoing.setClassification(Classification.PUBLIC);
//	    outgoing.setComments("My Commnets");
//	    //  outgoing.setTag(List<Tag>);
//	    outgoing.setType(DocumentType.DOCUMENT);
//	    outgoing.setAttachedFilesDescription("The description of the attached files");
//	    
//		RegistryNumber number  = registrationService.getNumberForYear(Year.YEAR_2017);
//	    
//	    outgoing.setRegistrynumber(number);
//	    List<String> filenames = new ArrayList<>();
//        //from: location on disk to read from
//	  	//to: location to write to
//	  	for (String filename: filenames) {
//	  		outgoing.getFilepaths().add(fileService.upload(filename, incoming.mapToFilepath(filename)));		
//	  	}
//
//	    //for each Recipient create event to generate Document...
	}

}
