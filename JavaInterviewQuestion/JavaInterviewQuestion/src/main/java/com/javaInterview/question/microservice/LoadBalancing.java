package com.javaInterview.question.microservice;
/*
	 Load Balancing - Load balancing is the process of distributing incoming network traffic (requests) 
	 across multiple servers (or service instances).
	 Improves performance by routing requests to the least busy/nearest instance.
 	 Prevents a single server from being overloaded.
 	 

 Types of LoadBalancing - 1. Client-Side Load Balancing, 2. Server-Side Load Balancing, 3. Service Registry + Load Balancing
 Service Registry - Services register themselves in a registry (like Eureka, Consul, Zookeeper).
 Client/Gateway queries the registry and balances load across available instances.
 
	Step 1 - pom.xml
	Add this 2 dependencies 
		1. <artifactId>spring-cloud-starter-loadbalancer</artifactId>
		2. <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
	
	Step 2 - Configure Service Registry (Eureka Server)
		let us assume our eureka server runs on http://localhost:8761
		
		In application.yml of Payment Service:
		spring:
		  application:
		    name: payment-service ( yh hamare service ka name )
		eureka:
		  client:
		    service-url:
		      defaultZone: http://localhost:8761/eureka/ (yha me apne service ko register karuga)
	
	Step 3 - Use LoadBalanced RestTemplate in Order Service
	Us configuration class me, jha ham restTemplate configure karge vha ham @LoadBalanced likh ke enable karege
	@Bean
    @LoadBalanced  // Enables client-side load balancing
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    Step 4 - Calling Payment Service with Load Balancing
    //abhi ham dusra API call karege tab ham IP/Port ke badle ham service ka name likh ke usko consume karege.
    @GetMapping("/order/pay")
    public String makePayment() {
        // service name instead of hardcoding localhost:port
        String response = restTemplate.getForObject("http://payment-service/pay", String.class);
        return "Order placed, " + response;
    }
 
*/
public class LoadBalancing {

}
