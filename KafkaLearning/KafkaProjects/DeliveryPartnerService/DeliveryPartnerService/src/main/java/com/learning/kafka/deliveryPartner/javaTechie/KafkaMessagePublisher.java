package com.learning.kafka.deliveryPartner.javaTechie;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.learning.kafka.deliveryPartner.constants.AppConstants;

@Service
public class KafkaMessagePublisher {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public void sendMessage(String message) {
		
		// here we have not created the topic manually 
		// we have created the topic using Spring Boot, so we have only 1 partitions 
//		CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send(AppConstants.JAVA_TECHIE_TOPIC_NAME, message);
		
		
		// now we have created a topic with 4 partitions topicName - java-techie-topic-2
		// manually using the below command in powerShell
		/*
		 PS D:\kaf\kafka4> .\bin\windows\kafka-topics.bat --create --topic java-techie-topic-2 --bootstrap-server localhost:9092 --partitions 4 --replication-factor 1
			2025-10-02T09:07:26.748838Z main ERROR Reconfiguration failed: No configuration found for '266474c2' at 'null' in 'null'
			Created topic java-techie-topic-2.
		 */
		//CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send("java-techie-topic-2", message);
		
		// we have cretaed a topic in configuration class and we are using that topic name using sping boot configuration // KafkaProducerConfig.java
		CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send("java-techie-5", message);
		
		future.whenComplete((result, exception) -> {
			
			System.out.println("Partition No.>>>"+result.getRecordMetadata().partition());
			
			if(exception == null) {
				System.out.println("send>>"+ message+">>>>"+result.getRecordMetadata().offset());
			}else {
				System.out.println("Not Sent message>>>>"+exception.getMessage());
			}
		});
	}
	
	
	/*
		Step 1 - pom.xml 
		add [Sprig for Apache Kafka] dependency in pom.xml file 
		<artifactId>spring-kafka</artifactId>
		Add spring web dependency also 
		now we have created the kafka producer service 
		
		application.properties me 
		spring.kafka.producer.bootstrap-servers=localhost:9092
		we can define multiple server also using .yml file 
		
		
		
		Step 2 - 
		PS D:\kaf\kafka4> .\bin\windows\kafka-storage.bat format --standalone -t kafka1 -c .\config\server.properties
		This will create a cluster and a  logs folder inside ( D:\kaf\kafka4\kraft-combined-logs path)
		After creating the cluster run the below command to start the kafka server  
		PS D:\kaf\kafka4> .\bin\windows\kafka-server-start.bat .\config\server.properties
		
		
		Step 3 - 
		kafka topic ham java ke code ya manually bhi create kar skate hai 
		kafkaTemplate.send(topicName, messgae);
		code likha 
		
	
	*/
}
