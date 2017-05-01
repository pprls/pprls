package org.pprls.registry.web;

import java.util.ArrayList;
import java.util.List;

import org.pprls.registry.domain.service.RegistrationService;
import org.pprls.registry.service.FileService;
import org.pprls.registry.service.repository.OutgoingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
	
	private static final Logger log = LoggerFactory.getLogger(Login.class);
	
	@Autowired
	private RegistrationService registrationService;
	@Autowired
	private FileService fileService;
	@Autowired
	private OutgoingRepository repository;
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from PPRLS!";
    }
	
	@RequestMapping("/login")
    public String login() {
        return "Now you must login";
    }
	
	@RequestMapping("/issue")
    public String issue() {

		
//		List<EmployeeDescriptor> issuers = new ArrayList<>();
//		Outgoing outgoing = (Outgoing) OutgoingBuilderFactory.INSTANCE.build(issuers);
//		Outgoing outgoing = new Outgoing();

//		List<EmployeeDescriptor> editors = new ArrayList<>();
//		outgoing.addEditors(editors);

//		List<Recipient> correspondants = new ArrayList<>();
//		outgoing.addCorrespondants(correspondants);

	//	outgoing.setFirstName("Some subject");
//		outgoing.setAda("some Ada");
//		outgoing.setClassification(Classification.PUBLIC);
//		outgoing.setComments("My Commnets");
//		// outgoing.setTag(List<Tag>);
//		outgoing.setType(DocumentType.DOCUMENT);
//		outgoing.setAttachedFilesDescription("The description of the attached files");

		//RegistryNumber number = registrationService.getNumberForYear(Year.YEAR_2017);

//		outgoing.setRegistrynumber(number);
		List<String> filenames = new ArrayList<>();

		// from: location on disk to read from
		// to: location to write to
//		for (String filename : filenames) {
//			outgoing.getFilepaths().add(fileService.upload(filename, outgoing.mapToFilepath(filename)));
//		}
		
	//	repository.save(outgoing);
		
        return "Now you issued an outgoing";
    }
	
	@RequestMapping("/getOutgoing")
    public String issue(String subject) {
//		log.info("outgoing found with findBySubject('Some subject'):");
//		log.info("--------------------------------------------");
//		for (RegistryRecord outgoing : repository.findBySubject("Some subject")) {
//			log.info(outgoing.toString());
//		}
        return "Now you issued an outgoing";
    }


}
