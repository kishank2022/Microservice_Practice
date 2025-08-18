package com.microservice.gateway.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfiguration {

	@Bean
    public RestClient.Builder restClientBuilder() {
        return RestClient.builder();
    }
}
