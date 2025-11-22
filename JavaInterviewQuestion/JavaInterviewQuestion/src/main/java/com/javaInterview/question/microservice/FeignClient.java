package com.javaInterview.question.microservice;

public class FeignClient {

}


/*

FeignException.NotFound  === 404 === url Not Found Exception 

---------------------------Feign Client ----------------------------------
		Feign is a declarative REST client — write an interface, Spring generates implementation.
		Integrates with Eureka (service discovery) and Ribbon (load balancing) — so you can call by service name.
		Supports @RequestHeader, @RequestParam, @PathVariable, @RequestBody, @RequestPart.
		Use ErrorDecoder for mapping remote errors; use RequestInterceptor for headers.
		Use resilience4j/circuit breakers for reliability; fallbacks for degraded behavior.
		Configure timeouts and logging per client in application.yml.
		
		
		Advance Topics - 
		1) Passing Headers (e.g., Authorization)
			Feign method: 
				@GetMapping("/users/{id}")
				UserDto getUserById(@PathVariable("id") Long id, @RequestHeader("Authorization") String token);
			In Java:
				userClient.getUserById(1L, "Bearer eyJ...");
				
		2) Query params & Collections
			In Java:
				@GetMapping("/users")
				List<UserDto> getUsersByIds(@RequestParam("id") List<Long> ids);
			Feign will send ?id=1&id=2&id=3 by default.
			
		3) Multipart / File Upload
			Provider:
				@PostMapping(value="/users/{id}/avatar", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
				public ResponseEntity<Void> upload(@PathVariable Long id, @RequestPart("file") MultipartFile file) { ... }
			Feign client:
				@PostMapping(value = "/users/{id}/avatar", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
				void uploadAvatar(@PathVariable("id") Long id, @RequestPart("file") MultipartFile file);
				
		4) Error handling
			Feign throws FeignException subclasses for errorCodes starting fro 4.. or 5..
			You can implement ErrorDecoder:
				@Component
				public class MyErrorDecoder implements ErrorDecoder {
				    public Exception decode(String methodKey, Response response) {
				        if (response.status() == 404) return new NotFoundException(...);
				        return new Exception("Generic");    }		}
				 yha hamne ErrorDecoder ko implement kiya and bola ki 
				 
		5) Timeouts & Logging
			Configure application.yml:
				feign:
				  client:
				    config:
				      default:
				        connectTimeout: 5000
				        readTimeout: 10000
				        loggerLevel: full
		
		6) Fallbacks / Circuit breaker
			Feign can specify a fallback class in @FeignClient (historically with Hystrix), or use fallbackFactory to capture the cause.
			@Component
			class UserClientFallback implements UserClient {
			    public UserDto getUserById(Long id){ return new UserDto(-1L,"unknown","n/a"); }
			    // implement other methods
			}
			
			@FeignClient(name="user-service", fallback = UserClientFallback.class)
			public interface UserClient { ... }
				












*/