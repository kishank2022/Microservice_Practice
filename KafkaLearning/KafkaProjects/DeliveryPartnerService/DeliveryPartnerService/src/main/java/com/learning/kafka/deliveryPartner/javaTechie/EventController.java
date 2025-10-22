package com.learning.kafka.deliveryPartner.javaTechie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java-techie/producer-app/")
public class EventController {
	
	@Autowired
	private KafkaMessagePublisher publisher;
	
	@Autowired
	private KafkaCustomerPublisher publisher1;
	
	@GetMapping("/publish/{message}")
	public ResponseEntity<?> publishMessage(@PathVariable String message)
	{
		String response = "Message not published!";
		System.out.println("input message "+message);
		try {
			for(int i = 0; i<=100; i++) {
				publisher.sendMessage(message+" "+i);
			}
			return ResponseEntity.ok("message "+message+" published successfully!!");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/publish/customer")
	public CustomerDto sendEvents( @RequestBody CustomerDto customerDto) {
		CustomerDto customer = publisher1.sendMessage(customerDto);
		return customer;
	}

}
