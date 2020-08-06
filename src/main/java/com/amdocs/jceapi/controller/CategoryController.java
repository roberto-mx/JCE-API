package com.amdocs.jceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.jceapi.domain.Category;
import com.amdocs.jceapi.repository.CategoryRepository;

@RestController
public class CategoryController {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@GetMapping("/Categoria")
    public ResponseEntity<?> getEmployeesByCategory() {
		List<Category> categories;
			categories = (List<Category>) this.categoryRepository.findAll();

        return new ResponseEntity<List<Category>>(categories, new HttpHeaders(), HttpStatus.OK);
    }

}
