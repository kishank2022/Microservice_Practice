package com.javaInterview.question.microservice;

public class ConfigServerMicroservice {

}

/*
	

	Config Server in Microservice - 
	
	Spring Cloud Config Server is a centralized configuration management system.
	Instead of keeping properties inside each microservice, we store them in a Git repository.
	The config server exposes these properties over REST endpoints, and all microservices fetch their configuration during startup.
	With @RefreshScope, we can even update values at runtime without restarting services.
	This brings consistency, versioning, security, and centralized control — which is essential in banking applications, 
	where things like transaction limits, API keys, and routing endpoints constantly change.
	
	Config Server setup - 
	1)pom.xml - <artifactId>spring-cloud-config-server</artifactId>
	
	2)
	@EnableConfigServer
	public class ConfigServerApplication {
	    public static void main(String[] args) {
	        SpringApplication.run(ConfigServerApplication.class, args);
	    }
	    
	3) application.yml for config server 
	
	
	Client Microservice Setup - 
	1) pom.xml - <artifactId>spring-cloud-starter-config</artifactId>
	2) bootstrap.yml - 
		spring:
		  application:
		    name: employee-service
		  cloud:
		    config:
		      uri: http://localhost:8888
		      
	3) Suppose You Store in Git Repo → employee-service-dev.yml
	message: "Hello from employee-service dev environment"
	
	4) to read data from properties file 
	@Value("${message}")
    private String message;
    
    
    @RefreshScope - @RefreshScope for Dynamic Refresh
    @RefreshScope
	@RestController
	public class TestController {..}
																																	
	Banking Domain Real-Life Example - 
	transaction:
	  maxLimit: 50000	
	kyc:
	  updateRequired: true
	  
	 Banking applications frequently change: Transaction limits, KYC rules, Interest rates, API endpoints, Authentication keys, Feature flags (ON/OFF)






*/
