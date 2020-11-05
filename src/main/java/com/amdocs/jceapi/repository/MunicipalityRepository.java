package com.amdocs.jceapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.jceapi.domain.Municipality;


@Repository
public interface MunicipalityRepository extends CrudRepository<Municipality, Long> {
	
	public List<Municipality> findMunicipalityById(Long ID);

}
