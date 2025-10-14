package com.learning.kafka.endUser.javatechiee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.learning.kafka.endUser.constants.AppConstants;

@Service
public class KafkaMessageListener {

	Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);
	
	@KafkaListener(topics = "java-techie-5" , groupId = AppConstants.GROUP_ID5)
	public void consumeMessage(String message) {
		log.info("consumer0 consume "+ message+" |||");
	}
	
	@KafkaListener(topics = "java-techie-5" , groupId = AppConstants.GROUP_ID5)
	public void consumeMessage1(String message) {
		log.info("consumer1 consume "+ message+" |||");
	}
	
	@KafkaListener(topics = "java-techie-5" , groupId = AppConstants.GROUP_ID5)
	public void consumeMessage2(String message) {
		log.info("consumer2 consume "+ message+" |||");
	}
	
	@KafkaListener(topics = "java-techie-5" , groupId = AppConstants.GROUP_ID5)
	public void consumeMessage3(String message) {
		log.info("consumer3 consume "+ message+" |||");
	}
	
	
	/*
	 
	 	Step 1 - 
	 	pom.xml me 
	 	<groupId>org.springframework.kafka</groupId> <artifactId>spring-kafka</artifactId>
	 	<artifactId>spring-boot-starter-web</artifactId>
	 	add this two dependencies 
	 	
	 	application.properties 
	 	spring.kafka.consumer.bootstrap-servers=localhost:9092
		define kafka host and server
		
		Step 2 - 
		KafkaMessageListener.consumeMessage(parameter me vhi datatype likho jo kafka producer send kar ra hai )
		@KafkaListener(topics = "java-techie-3") === topic ka name mention karo jiska event hamko read karna hai 
		@KafkaListener(topics = "java-techie-3" , groupId = AppConstants.GROUP_ID2)
		in this one kafka server can only mapped to only one groupId 		
		it is mandatory to define groupId in service and in application.properties file
	 	
	 
	 */
	
}
