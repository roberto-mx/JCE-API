package com.amdocs.jceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.amdocs.jceapi.domain.Empleo;
import com.amdocs.jceapi.service.EmpleoService;

@Controller
//@RequestMapping("otros")
public class EmpleoController {

	@Autowired
	private EmpleoService service;
	
	@GetMapping("/Empleos/list")
    public ResponseEntity<List<Empleo>> getAllEmployees(
                        @RequestParam(defaultValue = "0") Integer pageNo, 
                        @RequestParam(defaultValue = "10") Integer pageSize,
                        @RequestParam(defaultValue = "id") String sortBy) {
        List<Empleo> list = service.getAllEmpleos(pageNo, pageSize, sortBy);
 
        return new ResponseEntity<List<Empleo>>(list, new HttpHeaders(), HttpStatus.OK); 
    }
	
	@GetMapping("/Categorias/{categoryId}/Empleos")
    public ResponseEntity<?> getEmployeesByCategory(@PathVariable String categoryId) {
		List<Empleo> empleos;
		try {
			Long category = Long.parseLong(categoryId);
			empleos = service.findEmpleoByCategory(category);
		} catch (NumberFormatException ex) {
			System.err.println("Invalid category id: " + categoryId);
			return new ResponseEntity<String>("Invalid category id: " + categoryId, new HttpHeaders(), HttpStatus.BAD_REQUEST);
		}

        return new ResponseEntity<List<Empleo>>(empleos, new HttpHeaders(), HttpStatus.OK);
    }
}
