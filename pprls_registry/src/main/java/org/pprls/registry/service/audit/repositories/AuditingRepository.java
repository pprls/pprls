package org.pprls.registry.service.audit.repositories;

import java.util.UUID;

import org.pprls.registry.domain.RegistryHistory;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AuditingRepository extends ElasticsearchRepository<RegistryHistory, UUID> {

	public RegistryHistory getOneByRegistryRecordIdOrderByTimeStampDesc(UUID id);

}