package org.pprls.registry.service.audit.repositories;

import java.util.UUID;

import org.pprls.registry.domain.RegistryRecord;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AuditingRepository extends ElasticsearchRepository<RegistryRecord, UUID> {

	public RegistryRecord getOneById(UUID id);

}