package com.javaInterview.question.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*


	Eureka Client - A Eureka Client = A microservice that registers with Eureka Server and discovers other services dynamically.
	It is a microservice that registers itself with the Eureka Server (so that other services can find it).
	Discovers other services by querying the Eureka Server instead of using hardcoded URLs.
	Eureka Client ensures loose coupling between microservices.
	
	
	



	@SpringBootApplication
	@EnableEurekaClient   // This makes it a Eureka Client
	public class EurekaClientMicroservice {
	
		public static void main(String[] args) {
	        SpringApplication.run(EurekaClientMicroservice.class, args);
	    }
	}

-- application.properties
	server:
	  port: 8081	
	spring:
	  application:
	    name: USER-SERVICE   # Service ID to register with Eureka
	eureka:
	  client:
	    service-url:
	      defaultZone: http://localhost:8761/eureka/
	    register-with-eureka: true
	    fetch-registry: true
	    
	   
	-------- Using Service Discovery (Feign Example)---
	Instead of calling http://localhost:8081/users, we can call by service name.
	@FeignClient(name = "USER-SERVICE")
	public interface UserClient {
	    @GetMapping("/users")
	    String getUsers();
	}
	// Spring Cloud + Eureka will automatically resolve USER-SERVICE to its IP:PORT.
	
	 ❓ What is a Eureka Client?
	👉 A microservice that registers itself with Eureka Server and discovers other services dynamically.
	
	❓ How does Eureka Client communicate with Eureka Server?
	👉 Through REST API + heartbeats at regular intervals (default: every 30 seconds).
	
	❓ Difference between @EnableEurekaClient and @EnableDiscoveryClient?
	👉 @EnableEurekaClient → only for Eureka.
	👉 @EnableDiscoveryClient → works with multiple service registries (Eureka, Consul, Zookeeper).





*/