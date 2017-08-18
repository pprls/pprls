package org.pprls.registry.service.audit.repositories;

import org.pprls.registry.domain.OutgoingHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.UUID;

public interface AuditingOutgoingRepository extends ElasticsearchRepository<OutgoingHistory, UUID> {
	Page<OutgoingHistory> findByOutgoingId(UUID id, Pageable param);
}