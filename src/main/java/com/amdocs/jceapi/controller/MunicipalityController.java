package com.amdocs.jceapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.amdocs.jceapi.domain.Municipality;
import com.amdocs.jceapi.repository.MunicipalityRepository;
import com.amdocs.jceapi.service.MunicipalityService;

public class MunicipalityController {

	@Autowired
	private MunicipalityService service;
	
	@Autowired
	private MunicipalityRepository repository;
	
	
	@GetMapping("/Municipality/{idMunicipality}")
    public ResponseEntity<?> getMunicipalityById(@PathVariable String idName) {
		Municipality municipality;
		try {
			Long id = Long.parseLong(idName);
			municipality = (Municipality) repository.findMunicipalityById(id);
		} catch (NumberFormatException ex) {
			System.err.println("Invalid Municipality id: " + idName);
			return new ResponseEntity<String>("Invalid Municipality id: " + idName, new HttpHeaders(), HttpStatus.BAD_REQUEST);
		}

        return new ResponseEntity<Municipality>(municipality, new HttpHeaders(), HttpStatus.OK);
    }
}
