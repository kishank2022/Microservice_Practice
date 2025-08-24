package com.learning.kafka.endUser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.learning.kafka.endUser.constants.AppConstants;

@Configuration
public class KafkaConsumerConfiguration {

	@KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId = AppConstants.GROUP_ID)
	public void updatedLocation(String value) {
		System.out.println(value);
	}
	
}
