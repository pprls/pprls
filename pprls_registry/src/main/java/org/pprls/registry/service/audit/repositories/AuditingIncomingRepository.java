package org.pprls.registry.service.audit.repositories;

import java.util.List;
import java.util.UUID;

import org.pprls.registry.domain.OutgoingHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AuditingRepository extends ElasticsearchRepository<OutgoingHistory, UUID> {

	public List<OutgoingHistory> findByRegistryRecord_Id(UUID id);

	public Page<OutgoingHistory> findAll();

	public OutgoingHistory findByRegistryRecord_CurrentStatus_State(String state);

}