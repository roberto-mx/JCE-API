package com.amdocs.jceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.jceapi.domain.Municipality;
import com.amdocs.jceapi.domain.Provider;


@Service
public class MunicipalityService  {
	
	@Autowired
	private MunicipalityService repository;
	
	public List<Provider> findMunicipalityById(Long Id) {
		Municipality objMunicipality = new Municipality();
		objMunicipality.setID(Id);
		return repository.findMunicipalityById(Id);
	}

}
