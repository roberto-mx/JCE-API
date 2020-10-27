package com.amdocs.jceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdocs.jceapi.domain.Provider;
import com.amdocs.jceapi.service.ProviderService;

@Controller
@RequestMapping("/Provider")
public class ProviderController {

	@Autowired
	private ProviderService service;
	
	@GetMapping("/{idProvider}")
    public ResponseEntity<?> getProviderById(@PathVariable String idProvider) {
		Provider providers;
		try {
			Long id = Long.parseLong(idProvider);
			providers = service.getProvideById(id);
		} catch (NumberFormatException ex) {
			System.err.println("Invalid provider id: " + idProvider);
			return new ResponseEntity<String>("Invalid provider id: " + idProvider, new HttpHeaders(), HttpStatus.BAD_REQUEST);
		}

        return new ResponseEntity<Provider>(providers, new HttpHeaders(), HttpStatus.OK);
    }
	
	@GetMapping("/skill/{skillId}")
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
	
	@PutMapping(value = "/profilePicture", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateProfilePicture(@RequestBody Provider provider) {
		try {
			provider = service.getProvideById(provider.getProviderId());
			provider.setProfilePicture(provider.getProfilePicture());
			service.saveOrUpdate(provider);
		}catch (NumberFormatException ex) {
			System.err.println("Error trying to update the provider : " + provider.getProviderId() +" error message: "+ ex);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body("Provider updated. " + provider.getProviderId());
	}

}
