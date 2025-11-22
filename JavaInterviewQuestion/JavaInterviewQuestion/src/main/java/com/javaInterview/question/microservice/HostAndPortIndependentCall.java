package com.javaInterview.question.microservice;

public class HostAndPortIndependentCall {

}


/*

	-> Microservices communicate without host/port in Spring Boot - 
		By using Eureka Service Discovery with Feign Client. Each microservice registers itself with Eureka, and other services,
		call it using the service name, not the host. Eureka dynamically provides the real host and port, 
		and Feign automatically load-balances the calls.
		
	-> Internal working - 
		1️. OrderService calls Feign →
		2️. Feign asks Eureka →
		3️. Eureka returns all active instances of USER-SERVICE:
			192.168.1.10:8081
			192.168.1.11:8081
			192.168.1.12:8082
		4️. Feign + Ribbon load balancer automatically picks one
		5️. API call goes without you writing ANY host manually
		
	-> Code 
	Step 1. pom.xml - For Eureka Client -
		<dependency>
		    <groupId>org.springframework.cloud</groupId>
		    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>
		
		<dependency>
		    <groupId>org.springframework.cloud</groupId>
		    <artifactId>spring-cloud-starter-openfeign</artifactId>
		</dependency>
		
	Step 2. Set application name
	
	 		-> user-service → application.yml
	 		spring:
			  application:
			    name: USER-SERVICE
			eureka:
			  client:
			    register-with-eureka: true
			    fetch-registry: true
			    service-url:
			      defaultZone: http://localhost:8761/eureka/

			-> order-service → application.yml
			spring:
			  application:
			    name: ORDER-SERVICE
			eureka:
			  client:
			    register-with-eureka: true
			    
	Step 3. Enable Feign Client
			-> In Order Service Project
			@SpringBootApplication
			@EnableFeignClients
			public class OrderServiceApplication {}

	Step 4: Write Feign Client (NO HOST REQUIRED)
			-> In Order-Service Project
			@FeignClient(name = "USER-SERVICE")
			public interface UserClient {
			    @GetMapping("/users/{id}")   // yh same endpoint User-Service Project me hona chahiye.
			    User getUser(@PathVariable int id);
			}
			
			
	Step 5: Use it inside Service Layer
			-> In Order-Service Project
			
				@Service
				public class OrderService {
				    @Autowired
				    private UserClient userClient;
				    
				    public OrderDTO createOrder(int userId) {
				        User user = userClient.getUser(userId);  // Eureka resolves URL automatically
				        return new OrderDTO(101, "Laptop", user.getName());
				    }
				}










*/
