package com.learning.kafka.endUser.javatechiee;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.learning.kafka.endUser.dto.CustomerDto;

@EnableKafka
@Configuration
public class kafkaConfiguration {

	private static final String BOOTSTRAP_SERVERS = "localhost:9092";
	
	@Bean
    public ConsumerFactory<String, String> stringConsumerFactory() {
        Map<String, Object> props = new HashMap();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "group-string");
        return new DefaultKafkaConsumerFactory(props);
    }
	
	@Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> stringKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(stringConsumerFactory());
        return factory;
    }
	
	
	
	@Bean
    public ConsumerFactory<String, CustomerDto> customerDtoConsumerFactory() {
        JsonDeserializer<CustomerDto> deserializer = new JsonDeserializer<>(CustomerDto.class);
        deserializer.addTrustedPackages("com.learning.kafka.endUser.dto");

        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, deserializer);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "group-customer");

        return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(), deserializer);
    }
	
	@Bean
    public ConcurrentKafkaListenerContainerFactory<String, CustomerDto> customerDtoKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, CustomerDto> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(customerDtoConsumerFactory());
        return factory;
    }
}
