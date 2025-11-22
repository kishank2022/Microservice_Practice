package com.javaInterview.question.microservice;

public class FaultToleranceInMicroservice {

}

/*

	Fault tolerance means the system continues to function even when one or more microservices fail.
	In Spring Boot, we achieve this using Resilience4j which provides patterns like Circuit Breaker, Retry, Timeout, RateLimiter, and Fallback.
	These prevent cascading failures and ensure high availability.
	For example, if the Payment Gateway is down, the circuit breaker opens and returns a fallback response instead of making the user wait.
	This is very important in banking because services like transactions, OTP, balance check, and KYC cannot afford downtime.

-----------------------------------      Circuit Breaker  -----------------------------------      
	1) Circuit Breaker - 
	Circuit Breaker protects microservices from calling a failing service repeatedly.
	It has 3 states — Closed, Open, Half-Open.
	When a downstream service fails, the circuit opens and returns a fallback response immediately.
	In Spring Boot, we implement this using Resilience4j’s @CircuitBreaker annotation.
	This is very useful in banking transactions where external services like UPI, KYC, SMS gateway can become slow or unavailable.
	Circuit Breaker prevents cascading failures and keeps the system stable.
	
	Circuit Breaker States-
	1. CLOSED - Requests flow normally. If failure % exceeds threshold → OPEN.
	2. OPEN - No call to actual service. Directly returns fallback. Protects the system
	3. HALF-OPEN - Test one request after wait time. If success → CLOSE. If fail → OPEN again.
	
	Code - 
	1) pom.xml file - <artifactId>resilience4j-spring-boot3</artifactId>
	
	2) application.yml - 
	
	resilience4j:
	  circuitbreaker:
	    instances:
	      upiService:
	        failureRateThreshold: 50             
	        waitDurationInOpenState: 10s		 
	        ringBufferSizeInClosedState: 5       
	        ringBufferSizeInHalfOpenState: 3
	        
	failureRateThreshold: 50 -- if mene 10 call kiya and usme se 6 call fail huaa, i.e moreThan or equalTo 50 % call fail huaa tho 
	CB open sate me aaega, this is the percentage. 
	
	waitDurationInOpenState: 10s  -- When the circuit breaker enters OPEN state, it stays OPEN for 10 seconds. 
	This property defines how long the Circuit Breaker should stay OPEN before allowing test calls in HALF-OPEN state.
	During this time: All calls will fail immediately. No request will be sent to the downstream service. 
	
	ringBufferSizeInClosedState: 5  -- When the circuit breaker is CLOSED, it records the outcome of the last 5 calls. 
	Example - Buffer size = 5 calls. Calls = [Success, Failure, Failure, Success, Failure]. Failures = 3 → 3/5 = 60% → CB opens
	
	ringBufferSizeInHalfOpenState: 3  -- When the CB is HALF-OPEN, it allows 3 trial calls. If the 3 calls succeed → CB goes to CLOSED.
	If 1 fails → CB becomes OPEN again. In HALF-OPEN state, ringBufferSizeInHalfOpenState defines how many test calls 
	determine whether the circuit closes or opens again.
	        
	3) Controller - 
		@RestController
		public class PaymentController {
		
		    @Autowired
		    PaymentService paymentService;
		
		    @GetMapping("/pay")
		    @CircuitBreaker(name = "upiService", fallbackMethod = "upiFallback")
		    public String makePayment() {
		        return paymentService.callUPIGateway();
		    }		
		    public String upiFallback(Exception ex) {
		        return "UPI Server Down. Please try after some time.";
		    }
		}
	



-------------------------------------    Retry Resilience 4J --------------------------------------------------------------------------------------------

	Retry in Resilience4j automatically re-executes a failed call to handle transient faults. 
	If all retries fail, a fallback method is executed. This improves the resilience of microservices by handling temporary network issues,
	timeouts, or downstream service restarts. We usually combine Retry with Circuit Breaker for maximum stability.
	
	Retry should NOT be used for permanent failures like validation errors, authentication/authorization failures, business rule failures,
	or database constraint violations. We must also avoid retrying operations that are not idempotent, such as payments or order creation,
	because retries can create duplicate transactions. Retry is only for transient faults. 
	For long outages or rate limits, Circuit Breaker are better choices.
	
	
	Retry Workflow (3 Steps) - 
	
	1️) Call fails (ex: TimeoutException)
	2️) Retry automatically waits a configured time
	3️) Calls again - 
	If success → return result
	If still fails → repeat until max attempts
	If all attempts fail → execute fallback method.
	
	
	application.yaml file - Resilience4j Retry Configuration (YAML)
	resilience4j:
	  retry:
	    instances:
	      paymentRetry:
	        maxAttempts: 3
	        waitDuration: 2s
	        retryExceptions:
	          - java.io.IOException
	          - java.util.concurrent.TimeoutException
	
	1. maxAttempts: 3, Total number of attempts = 3 (1 original call + 2 retries)
	2. waitDuration: 2s, Wait 2 seconds between each retry.
	3. retryExceptions, Retry only for these exception types.
	
	@Service
	public class PaymentService {
	    @Autowired
	    RestTemplate restTemplate;
	    
	    @Retry(name = "paymentRetry", fallbackMethod = "paymentFallback")
	    public String callPaymentGateway() {
	        String url = "http://localhost:8081/pay";
	        System.out.println("Calling Payment Service...");
	        return restTemplate.getForObject(url, String.class);
	    }
	    // Fallback method
	    public String paymentFallback(Exception ex) {
	        return "Payment Service temporarily unavailable. Please try again later.";
	    }
	}




-------------------------------------- Rate Limiter --------------------------------------------------------
	
	Rate Limiting is used to control the number of requests a client or service can make in a given time window.
	Why it’s needed-	
	To prevent overload on a service. To avoid DDOS-like traffic. To protect downstream APIs (like bank/payment APIs).	
	To ensure fair usage among users. To reduce infrastructure cost.
	
	Rate limiter protects microservices from overload, ensures fair usage, improves security, stabilizes system performance,
	and prevents cascading failures by controlling the request flow entering a service.
	
	pom.xml 
    <artifactId>resilience4j-ratelimiter</artifactId>
    
    application.yaml file :- 
    resilience4j:
	  ratelimiter:
	    instances:
	      userServiceLimiter:
	        limitForPeriod: 5          # Number of requests allowed
	        limitRefreshPeriod: 1s     # Time window
	        timeoutDuration: 500ms     # How long to wait before rejecting

	@RestController
	public class UserController {
	
	    @RateLimiter(name = "userServiceLimiter", fallbackMethod = "rateLimiterFallback")
	    @GetMapping("/getUsers")
	    public String getUsers() {
	        return "Users Fetched Successfully";
	    }
	
	    public String rateLimiterFallback(Throwable ex) {
	        return "Too Many Requests - Please try again after some time";
	    }
	}

















*/