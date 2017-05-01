package org.pprls.registry.service.repository;

import java.util.List;
import java.util.UUID;

import org.pprls.registry.domain.Outgoing;
import org.pprls.registry.domain.RegistryNumber;
import org.springframework.data.repository.CrudRepository;

public interface OutgoingRepository extends CrudRepository<Outgoing, UUID> {
	
	 List<Outgoing> findByRegistryNumber(RegistryNumber registryNumber);

}
