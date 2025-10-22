package com.learning.kafka.endUser.javatechiee;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.learning.kafka.endUser.constants.AppConstants;


@Configuration
public class KafkaCustomerConfiguration {

//	@Bean
//	public Map<String, Object> consumerConfig() {
//		Map<String, Object> properties = new HashMap<>();
//		properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//		properties.put(ConsumerConfig.GROUP_ID_CONFIG, AppConstants.GROUP_ID2);
//		properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
//		properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//		properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//		properties.put(JsonDeserializer.TRUSTED_PACKAGES, "com.learning.kafka.endUser.dto,com.learning.kafka.deliveryPartner.javaTechie");
//		 properties.put(JsonDeserializer.VALUE_DEFAULT_TYPE, "com.learning.kafka.endUser.dto.CustomerDto");
//		return properties;
//	}
	
//	@Bean
//	public ConsumerFactory<String, Object> consumerFactory(){
//		return new DefaultKafkaConsumerFactory<>(consumerConfig());
//	}
//	
//	@Bean
//	public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, Object>> kafkaListenerContainerFactory(){
//		ConcurrentKafkaListenerContainerFactory<String, Object> factory = new ConcurrentKafkaListenerContainerFactory<>();
//		factory.setConsumerFactory(consumerFactory());
//		return factory;
//	}

}
