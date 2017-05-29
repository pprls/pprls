package org.pprls.registry.domain.audit;

import org.pprls.registry.domain.Outgoing;
import org.pprls.registry.domain.RegistryHistory;
import org.pprls.registry.domain.RegistryRecord;
import org.pprls.registry.domain.service.OutgoingRegistryHistory;
import org.pprls.registry.service.audit.repositories.AuditingOutgoingRepository;
import org.pprls.registry.service.audit.repositories.AuditingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

public class AuditingOutgoingListener {

	@Autowired
	private AuditingOutgoingRepository repository;
	
	@PostUpdate
	@PostPersist
	private void postPersistOperations(Outgoing registryRecord) {
			AutowireHelper.autowire(this, this.repository);
			OutgoingRegistryHistory recordHistory = new OutgoingRegistryHistory(registryRecord);
			repository.save(recordHistory);
	}
}
