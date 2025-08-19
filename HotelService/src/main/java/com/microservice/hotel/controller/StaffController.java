package com.microservice.hotel.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.hotel.entity.Hotel;

@RestController
@RequestMapping("/hotel/staff")
public class StaffController {

	@GetMapping("/names")
	public ResponseEntity<List<String>> getStaffNames(){
		
		List<String> list1 = Arrays.asList("Kaka1", "Kaka2", "Kaka3");
		return new ResponseEntity<List<String>>(list1, HttpStatus.OK);
	}
}
