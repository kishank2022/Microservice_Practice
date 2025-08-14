package com.microservice.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfiguration {

	// cretaing rest template bean 
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
