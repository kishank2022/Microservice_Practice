package com.learning.kafka.deliveryPartner.javaTechie;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class KafkaCustomerPublisher {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	public void sendMessage(CustomerDto customer) {


		CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send("java-techie-5", customer);
		future.whenComplete((result, exception) -> {
			System.out.println("Partition No.>>>" + result.getRecordMetadata().partition());
			if (exception == null) {
				System.out.println("send>>" + message + ">>>>" + result.getRecordMetadata().offset());
			} else {
				System.out.println("Not Sent message>>>>" + exception.getMessage());
			}
		});
	}
}
