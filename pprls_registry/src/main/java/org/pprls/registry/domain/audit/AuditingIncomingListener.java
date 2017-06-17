package org.pprls.registry.domain.audit;

import org.pprls.registry.domain.Incoming;
import org.pprls.registry.domain.IncomingHistory;
import org.pprls.registry.service.audit.repositories.AuditingIncomingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

public class AuditingIncomingListener {

    @Autowired
    private AuditingIncomingRepository repository;

    @PostUpdate
    @PostPersist
    private void postPersistOperations(Incoming incoming) {
        AutowireHelper.autowire(this, this.repository);
        IncomingHistory incomingHistory = new IncomingHistory(incoming);
        repository.save(incomingHistory);
    }
}
