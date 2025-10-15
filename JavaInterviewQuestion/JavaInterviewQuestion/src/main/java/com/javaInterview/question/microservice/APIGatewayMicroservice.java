package com.javaInterview.question.microservice;

/*

	
	API Gateway - API Gateway is a single entry point that provides routing, load balancing, security, and monitoring for microservices. 
	Load Balancer only distributes requests. API Gateway = Load Balancer + Routing + Security + Monitoring + Transformation.
	
	pom.xml file - 
	<artifactId>spring-cloud-starter-gateway</artifactId>
	<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
	Add this two dependencies
	
	application.yml file -
	server:
	  port: 8080	
	spring:
	  application:
	    name: API-GATEWAY
	eureka:
	  client:
	    service-url:
	      defaultZone: http://localhost:8761/eureka/
	spring:
	  cloud:
	    gateway:
	      routes:
	        - id: customer-service
	          uri: lb://CUSTOMER-SERVICE
	          predicates:
	            - Path=/customers/**
	        - id: order-service
	          uri: lb://ORDER-SERVICE
	          predicates:
	            - Path=/orders/**
	            
	-----------
	lb://CUSTOMER-SERVICE means load balance requests across all CUSTOMER-SERVICE instances registered in Eureka.
	http://localhost:8080/customers/1 → forwarded to CUSTOMER-SERVICE
	http://localhost:8080/orders/10 → forwarded to ORDER-SERVICE
	All calls go to API Gateway → it routes requests internally. | One entry point → clean, secure, efficient.
	
	            
	            

	            
	            

public class APIGatewayMicroservice {

	

	
	
}







*/