package org.pprls.registry.service.audit.repositories;

import org.pprls.registry.domain.RegistryHistory;
import org.pprls.registry.domain.service.OutgoingRegistryHistory;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;
import java.util.UUID;

public interface AuditingOutgoingRepository extends ElasticsearchRepository<OutgoingRegistryHistory, UUID> {

	 OutgoingRegistryHistory getOneByOutgoingIdOrderByTimeStampDesc(UUID id);
	 List<OutgoingRegistryHistory> findByOutgoingIdOrderByTimeStampAsc(UUID id);


}