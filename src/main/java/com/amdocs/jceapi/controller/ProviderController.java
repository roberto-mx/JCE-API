package com.amdocs.jceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.amdocs.jceapi.domain.Provider;
import com.amdocs.jceapi.repository.ProviderRepository;
import com.amdocs.jceapi.service.ProviderService;

@Controller
public class ProviderController {

	@Autowired
	private ProviderService service;
	
	@Autowired
	private ProviderRepository repository;
	
	@GetMapping("/Provider/{idProvider}")
    public ResponseEntity<?> getProviderById(@PathVariable String idProvider) {
		Provider providers;
		try {
			Long id = Long.parseLong(idProvider);
			providers = repository.findById(id).get();
		} catch (NumberFormatException ex) {
			System.err.println("Invalid skill id: " + idProvider);
			return new ResponseEntity<String>("Invalid skill id: " + idProvider, new HttpHeaders(), HttpStatus.BAD_REQUEST);
		}

        return new ResponseEntity<Provider>(providers, new HttpHeaders(), HttpStatus.OK);
    }
	
	@GetMapping("/Provider/skill/{skillId}")
    public ResponseEntity<?> getEmployeesByCategory(@PathVariable String skillId) {
		List<Provider> providers;
		try {
			Long id = Long.parseLong(skillId);
			providers = service.findProviderBySkill(id);
		} catch (NumberFormatException ex) {
			System.err.println("Invalid skill id: " + skillId);
			return new ResponseEntity<String>("Invalid skill id: " + skillId, new HttpHeaders(), HttpStatus.BAD_REQUEST);
		}

        return new ResponseEntity<List<Provider>>(providers, new HttpHeaders(), HttpStatus.OK);
    }
}
