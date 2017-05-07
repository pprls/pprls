package org.pprls.document.service.repository;

import java.util.List;
import java.util.UUID;

import org.pprls.document.domain.Document;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<Document, UUID> {
	
	Document findById(UUID id);

	List<Document> findAllByRegistryRecordId(UUID id);

}
