package com.learning.kafka.deliveryPartner.javaTechie;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {

	@Bean
	public NewTopic createNewTopic() {
		// org.apache.kafka.clients.admin.NewTopic.NewTopic (String name, int numPartitions, short replicationFactor)
		// NewTopic("java-techie-3", 2, (short) 1) this will cretate a topic with name java-techie-3 with 2 partitions and 1 replication, 
		// now spring boot will not automatically create the topic it will use this topic configuration and cretae it on kafka server
		//return new NewTopic("java-techie-3", 2, (short) 1); 
		
		return new NewTopic("java-techie-5", 2, (short) 1); 
		
		
	}
	
}
