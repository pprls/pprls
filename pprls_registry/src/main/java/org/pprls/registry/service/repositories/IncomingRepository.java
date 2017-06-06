package org.pprls.registry.service.repositories;

import org.pprls.registry.domain.Incoming;
import org.pprls.registry.domain.RegistryNumber;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface IncomingRepository extends CrudRepository<Incoming, UUID> {

	 List<Incoming> findByRegistryNumber(RegistryNumber registryNumber);

}
