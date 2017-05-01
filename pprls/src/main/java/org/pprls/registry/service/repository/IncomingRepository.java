package org.pprls.registry.service.repository;

import java.util.List;
import java.util.UUID;

import org.pprls.registry.domain.Incoming;
import org.pprls.registry.domain.RegistryNumber;
import org.springframework.data.repository.CrudRepository;

public interface IncomingRepository extends CrudRepository<Incoming, UUID> {
	
	 List<Incoming> findByRegistryNumber(RegistryNumber registryNumber);

}
