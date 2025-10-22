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

	public CustomerDto sendMessage(CustomerDto customer) {

		try {
			CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send("java_customer_topic_1", customer);
			future.whenComplete((result, exception) -> {
				System.out.println("Partition No.>>>" + result.getRecordMetadata().partition());
				if (exception == null) {
					System.out.println("send>>" + customer.toString() + ">>>>" + result.getRecordMetadata().offset());
				} else {
					System.out.println("Not Sent  message>>>>" + exception.getMessage());
				}
			});
			return customer;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occured " + e.getMessage());
			return new CustomerDto();
		}
	}
}
