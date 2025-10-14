package com.learning.kafka.deliveryPartner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.learning.kafka.deliveryPartner.constants.AppConstants;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public boolean updateLocation(String location) {
		kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
		return true;
	}
	
	/*
	 Step 2 create kafkaService and kafka template create karo and autowired karo 
	 KafkaTemplate(org.springframework.kafka.core.KafkaTemplate) kafka tempalte ka .send(topicName, data) 
	 .send 2 parameter leta hai 1st topic name and second kya data bhejna hai hamko 
	 step3 controller se service layer ko call karke data bhej do  
	 Ste4 consumer side me hai 
	 
	 step 4 - consumer ke application.properties file me yh likho and pom.cml me vhi dependency add karo jo producer me add ki hai <groupId>org.springframework.kafka</groupId>
	 application.properties file in consumer application
	 	spring.kafka.consumer.bootstrap-servers=localhost:9092
		spring.kafka.consumer.group-id=group-1
		spring.kafka.consumer.auto-offset-reset=earliest
		spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
		spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer
	
	Step 5 - endUser vale project me ek configuraton class banao and usme yh likho 
		@Configuration
		public class KafkaConsumerConfiguration {		
			@KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId = AppConstants.GROUP_ID)
			public void updatedLocation(String value) {				System.out.println(value);			} 	}
		
		@KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId = AppConstants.GROUP_ID)
		yh annonation me topic name and groupId provide karna hai 
		
	 
	 */
	
	
	
	
	
}
