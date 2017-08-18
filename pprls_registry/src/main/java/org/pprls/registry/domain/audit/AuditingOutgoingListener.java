package org.pprls.registry.domain.audit;

import org.pprls.registry.domain.Outgoing;
import org.pprls.registry.domain.OutgoingHistory;
import org.pprls.registry.service.audit.repositories.AuditingOutgoingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

public class AuditingOutgoingListener {

	@Autowired
	private AuditingOutgoingRepository repository;
	
	@PostUpdate
	@PostPersist
	private void postPersistOperations(Outgoing outgoing) {
			AutowireHelper.autowire(this, this.repository);
			OutgoingHistory recordHistory = new OutgoingHistory(outgoing);
			repository.save(recordHistory);
	}
}
