package com.learning.kafka.deliveryPartner.controller;

import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.kafka.deliveryPartner.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	private KafkaService kafkaService;
	
	@PostMapping("/update")
	public ResponseEntity<?> updateLocation(){
		this.kafkaService.updateLocation(UUID.randomUUID().toString());
		return new ResponseEntity<>(Map.of("message", "location updated successfully"), HttpStatus.OK);
	}
	
}
