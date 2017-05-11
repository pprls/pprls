package org.pprls.document;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pprls.core.EntityDescriptor;
import org.pprls.core.dto.RegistryRecordDto;
import org.pprls.document.domain.Document;
import org.pprls.document.service.repository.DocumentRepository;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@EntityScan("org.pprls.document.domain")
@EnableRabbit
public class AssignTask {

	@Autowired
	private DocumentRepository documentRepository;

	@Test
	public void assign() {
		try {
			// receive message
			String message = "{\"id\":\"5586ecca-7fb3-4d3c-a229-541a96c7fe7f\",\"entityDescriptors\":[{\"unitPath\":\"\",\"fullName\":\"\",\"entityId\":0,\"registrationNumber\":0}]};";
			// convert message to DTO
			ObjectMapper objectMapper = new ObjectMapper();
			RegistryRecordDto dto = objectMapper.readValue(message, RegistryRecordDto.class);

			// assign to correnspondents
			for (EntityDescriptor entityDescriptor : dto.getEntityDescriptors()) {
				// create document
				Document newDocument = new Document(dto.getId(), entityDescriptor);
				documentRepository.save(newDocument);
				
				Document readDocument = documentRepository.findById(newDocument.getId());
				EntityDescriptor readEntiyDescriptor = readDocument.getCurrentStatus().getOwner();
				assertEquals(entityDescriptor, readEntiyDescriptor);
			}
			
			List<Document> readDocuments = documentRepository.findAllByRegistryRecordId(dto.getId());
			assertEquals(readDocuments.size(), dto.getEntityDescriptors().size());
		} catch (IOException e) {
			fail(e.getLocalizedMessage());
		}
	}

}
