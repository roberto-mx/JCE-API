package com.amdocs.jceapi.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jceapi.domain.Empleo;

@RepositoryRestResource(path = "Empleos", collectionResourceRel = "Empleo")
public interface EmpleoRepository extends PagingAndSortingRepository<Empleo, Long> {

	public List<Empleo> findEmpleosByEmpleo2category(@Param("categoriaId") Long categoriaId);
}
