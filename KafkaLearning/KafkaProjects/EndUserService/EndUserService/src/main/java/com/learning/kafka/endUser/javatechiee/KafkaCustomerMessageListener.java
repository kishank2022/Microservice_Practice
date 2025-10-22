package com.learning.kafka.endUser.javatechiee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.learning.kafka.endUser.constants.AppConstants;
import com.learning.kafka.endUser.dto.CustomerDto;

@Service
public class KafkaCustomerMessageListener {

	Logger log = LoggerFactory.getLogger(KafkaCustomerMessageListener.class);
	
	@KafkaListener(topics = "java_customer_topic_1" , groupId = AppConstants.CUSTOMER_GROUP_ID_1,
						containerFactory = "customerDtoKafkaListenerContainerFactory")
	public void consumeMessage(CustomerDto customerDto) {
		try {
		log.info("customerDto consume "+ customerDto.toString()+" |||");
		}catch(Exception e) {
			e.printStackTrace();
			log.info(e.getMessage());
		}
	}
}
