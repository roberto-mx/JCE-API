package com.amdocs.jceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.amdocs.jceapi.domain.Skill;
import com.amdocs.jceapi.service.SkillService;

@Controller
public class SkillController {

	@Autowired
	private SkillService service;
	
	@GetMapping("/Empleo/{empleoId}/Skills")
    public ResponseEntity<?> getEmployeesByCategory(@PathVariable String empleoId) {
		List<Skill> skills;
		try {
			Long empleo = Long.parseLong(empleoId);
			skills = service.findSkillsByEmpleo(empleo);
		} catch (NumberFormatException ex) {
			System.err.println("Invalid employee id: " + empleoId);
			return new ResponseEntity<String>("Invalid employee id: " + empleoId, new HttpHeaders(), HttpStatus.BAD_REQUEST);
		}

        return new ResponseEntity<List<Skill>>(skills, new HttpHeaders(), HttpStatus.OK);
    }
}
