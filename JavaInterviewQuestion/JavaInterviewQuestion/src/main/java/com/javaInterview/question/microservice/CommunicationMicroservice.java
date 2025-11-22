package com.javaInterview.question.microservice;

public class CommunicationMicroservice {

}

/*
	There are two types of communication in Microservices:
	1. Synchronous- Direct request–response (real-time) Eg - REST API, gRPC
	2. Asynchronous - Event-driven (non-blocking)  Eg. RabbitMQ, Kafka
	
	
	Calling another services 
	-------------------------------Synchronous------------------------------
	1:-Using RestTemplate
	 	private final RestTemplate restTemplate = new RestTemplate();
		User user = restTemplate.getForObject("http://localhost:8081/users/" + userId, User.class);

	2:- Using Feign Client
	pom.xml - 
		<dependency>
	    <groupId>org.springframework.cloud</groupId>
	    <artifactId>spring-cloud-starter-openfeign</artifactId>
		</dependency>
	Enable Feign:
		@SpringBootApplication
		@EnableFeignClients
		public class OrderServiceApplication { }
	Feign Interface:
		@FeignClient(name = "user-service", url = "http://localhost:8081/users")
		public interface UserClient {
		    @GetMapping("/{id}")
		    User getUserById(@PathVariable int id);
		}
	OrderService using Feign:
		@Service
		public class OrderService {
		    @Autowired
		    private UserClient userClient;
		
		    public Order createOrder(int userId, String product) {
		        User user = userClient.getUserById(userId);
		        return new Order(201, product, user.getName());   }	}
		
	-----------------------------------Asynchronous-----------------------------
	Sometimes one service must notify another without waiting for a response.
	
	
	
	
	
	---------------- Service Discovery & Load Balancing (Eureka)------------------
	When you have many services, you use a Service Registry like Netflix Eureka.
	Each service registers itself to Eureka. Others discover it dynamically (no need for fixed URLs).
	In Feign - 
	@FeignClient(name = "user-service") // no need for URL
	public interface UserClient { ... }
	
	
	---------------- API Gateway (Spring Cloud Gateway / Zuul) -----------------
	API Gateway (Spring Cloud Gateway / Zuul)
	
	
	
	-----------------------Circuit Breaker (Resilience4j)----------------------
	Used when one service depends on another — protects against failures.
	If UserService is down, fallback provides a default response instead of crashing.
	
		@FeignClient(name = "user-service", fallback = UserFallback.class)
		public interface UserClient {
		    @GetMapping("/{id}")
		    User getUserById(@PathVariable int id);
		}
		
		@Component
		class UserFallback implements UserClient {
		    public User getUserById(int id) {
		        return new User(id, "Default User", "N/A");
		    }
		}
	
	
	
	
		
		
		




*/