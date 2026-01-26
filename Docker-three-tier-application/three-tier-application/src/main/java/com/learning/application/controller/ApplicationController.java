package com.learning.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.application.service.ApplicationService;

@RestController
@RequestMapping("/api/app/v1/")
public class ApplicationController {
	
	private ApplicationService application_service; 
	
	public ApplicationController(ApplicationService application_service) {
		this.application_service = application_service;
	}
	
	@GetMapping
	public ResponseEntity<String> getName(@RequestParam("name") String name) {
		if(name.isEmpty() || name == null) {
			return new ResponseEntity<>("Enter a valid name!", HttpStatus.OK);
		}
		System.out.println("My name is "+ name +" Kushwaha!!");
		name = application_service.saveName(name);
		return new ResponseEntity<>(name, HttpStatus.OK);
	}
}
