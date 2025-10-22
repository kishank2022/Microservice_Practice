package com.learning.kafka.deliveryPartner.javaTechie;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;



@Configuration
public class KafkaProducerConfig {

	/*
	@Bean
	public NewTopic createNewTopic() {
		// org.apache.kafka.clients.admin.NewTopic.NewTopic (String name, int numPartitions, short replicationFactor)
		// NewTopic("java-techie-3", 2, (short) 1) this will cretate a topic with name java-techie-3 with 2 partitions and 1 replication, 
		// now spring boot will not automatically create the topic it will use this topic configuration and cretae it on kafka server
		//return new NewTopic("java-techie-3", 2, (short) 1); 
		
		return new NewTopic("java-techie-5", 2, (short) 1); 
		
		
	}
	*/
	
	/*
	 	// this is a topic for customer(Dto/Object) example
	// created mew topic for Customer
	@Bean
	public NewTopic createNewCustomerTopic() {
		return new NewTopic("java_customer_topic_1", 3, (short) 1);
	}
	*/
	
	@Bean
	public NewTopic createNewTopic1() {
		return new NewTopic("java_customer_topic_1", 5, (short) 1);
	}
	
	@Bean
	public NewTopic createNewTopic() {
		return new NewTopic("java_topic_5", 5, (short) 1);
	}
	
	/*
	@Bean
	public Map<String, Object> producerConfig(){
		Map<String, Object> properties = new HashMap<>();
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		properties.put(JsonSerializer.ADD_TYPE_INFO_HEADERS, false);
		return properties;
	}
	
	@Bean
	public ProducerFactory<String, Object> producerFactory(){
		return new DefaultKafkaProducerFactory<>(producerConfig());
	}
	
	@Bean
	public KafkaTemplate<String, Object> kafkaTemplate(){
		return new KafkaTemplate<>(producerFactory());
	}
	*/
	
}
