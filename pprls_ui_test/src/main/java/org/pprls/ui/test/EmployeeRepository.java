package org.pprls.ui.test;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "item", path = "item")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

	List<Item> findByLast(@Param("last") String last);

}