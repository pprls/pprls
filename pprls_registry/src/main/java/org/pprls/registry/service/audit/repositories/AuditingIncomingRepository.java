package org.pprls.registry.service.audit.repositories;

import org.pprls.registry.domain.IncomingHistory;
import org.pprls.registry.domain.OutgoingHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.UUID;

public interface AuditingIncomingRepository extends ElasticsearchRepository<IncomingHistory, UUID> {
	Page<IncomingHistory> findByIncomingId(UUID id, Pageable param);
}