package com.javaInterview.question.microservice;

public class EurekaServerMicroservice {

}
/*
	------ Eureka Server 
	
	It is a Service Registry provided by Netflix OSS (part of Spring Cloud Netflix).
	Eureka Server is a central place where all services register themselves and other services can discover them
	without hardcoding IP/port.
	Eureka Server = Service Registry that enables service discovery and load balancing in microservices.
	-> What happens if Eureka Server goes down?
	Clients still use the last cached registry. But for long downtime, discovery fails.
	
	@SpringBootApplication
	@EnableEurekaServer  // Makes this app act as a Eureka Server
	public class EurekaServerApplication {
	    public static void main(String[] args) {
	        SpringApplication.run(EurekaServerApplication.class, args);
	    }
	}
	
	application.yml
	server:
	  port: 8761	
	eureka:
	  client:
	    register-with-eureka: false   # Server doesn’t register itself
	    fetch-registry: false
	 
	----- Eureka Client  -- UserService
	@SpringBootApplication
	@EnableEurekaClient  // Registers this service with Eureka
	public class UserServiceApplication {
	    public static void main(String[] args) {
	        SpringApplication.run(UserServiceApplication.class, args);
	    }
	}
	
	application.yml 
	server:
	  port: 8081	
	spring:
	  application:
	    name: USER-SERVICE   # Service name to register
	eureka:
	  client:
	    service-url:
	      defaultZone: http://localhost:8761/eureka/
	      
	      
	---- Eureka Client 
	@SpringBootApplication
	@EnableEurekaClient
	public class OrderServiceApplication {
	    public static void main(String[] args) {
	        SpringApplication.run(OrderServiceApplication.class, args);
	    }
	}
	@RestController
	class OrderController {
	    @GetMapping("/orders")
	    public String getOrders() {
	        return "Fetching Orders from OrderService";
	    }
	}

	application.yml file 
	server:
	  port: 8082	
	spring:
	  application:
	    name: ORDER-SERVICE
	eureka:
	  client:
	    service-url:
	      defaultZone: http://localhost:8761/eureka/







*/
