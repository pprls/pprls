package org.pprls.registry.service.repositories;

import org.pprls.registry.domain.Outgoing;
import org.pprls.registry.domain.RegistryNumber;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface OutgoingRepository extends CrudRepository<Outgoing, UUID> {
	
	 List<Outgoing> findByRegistryNumber(RegistryNumber registryNumber);
	
}
