package org.pprls.registry.service.audit.repositories;

import org.pprls.registry.domain.IncomingHistory;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.UUID;

public interface AuditingIncomingRepository extends ElasticsearchRepository<IncomingHistory, UUID> {

	IncomingHistory findTopByIncoming_IdOrderByTimeStampDesc(UUID id);

}