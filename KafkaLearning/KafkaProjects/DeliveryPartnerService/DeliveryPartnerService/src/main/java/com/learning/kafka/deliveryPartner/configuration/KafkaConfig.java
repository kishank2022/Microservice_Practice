package com.learning.kafka.deliveryPartner.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.learning.kafka.deliveryPartner.constants.AppConstants;

@Configuration
public class KafkaConfig {

	@Bean
	public NewTopic createTopic() {
		return TopicBuilder
				.name(AppConstants.LOCATION_TOPIC_NAME)
				.build();
	}
	
	/*
	 Step 1 create kiya hai configuration class and usme new topic create kiya hai 
	 return type NewTopic hai jo ( org.apache.kafka.clients.admin.NewTopic) 
	 Step 2 - kafka service create karo 
	 */
}
