package org.pprls.registry.domain.audit;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

import org.pprls.registry.domain.RegistryHistory;
import org.pprls.registry.domain.RegistryRecord;
import org.pprls.registry.service.audit.repositories.AuditingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AuditingRegistryListener { 

	@Autowired
	private AuditingRepository repository;
	
	@PostUpdate
	@PostPersist
	private void postPersistOperations(RegistryRecord registryRecord) {
			AutowireHelper.autowire(this, this.repository);
			RegistryHistory recordHistory = new RegistryHistory(registryRecord);
			repository.save(recordHistory);
	}
}
