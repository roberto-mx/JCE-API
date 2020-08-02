package com.amdocs.jceapi.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jceapi.domain.Provider;

@RepositoryRestResource(path = "Providers", collectionResourceRel = "Providers")
public interface ProviderRepository extends PagingAndSortingRepository<Provider, Long> {

	public List<Provider> findProvidersBySkills(@Param("skillId") Long providerId);
}
