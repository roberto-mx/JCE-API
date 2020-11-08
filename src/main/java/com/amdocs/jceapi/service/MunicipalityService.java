package com.amdocs.jceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.jceapi.domain.Municipality;

@Service
public class MunicipalityService  {

	@Autowired
	private MunicipalityService repository;

	public List<Municipality> findMunicipalityById(Long Id) {
		return repository.findMunicipalityById(Id);
	}

}
