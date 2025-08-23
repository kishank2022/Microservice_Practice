package com.microservice.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.user.entity.User;
import com.microservice.user.userService.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/api/user/")
public class UserController {

	@Autowired
	private UserService userService;
	
	int retryCount = 1;
	
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		User savedUser1 = this.userService.createUser(user);
		return new ResponseEntity<User>(savedUser1, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllUser")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> list1 = this.userService.getAllUser();
		return new ResponseEntity<List<User>>(list1, HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/get/{userId}")
//	@CircuitBreaker(name = "ratingHotelBreakerCircuitBreakerName", fallbackMethod = "ratingHotelFallbackMethodName")
//	@Retry(name = "ratingHotelRetryName", fallbackMethod = "ratingHotelRetryMethodName")
	@RateLimiter(name = "ratingHotelRateLimiterName", fallbackMethod = "ratingHotelRetryMethodName")
	public ResponseEntity<User> getSingleUser(@PathVariable("userId") String userId){
		System.out.println("retryCount:"+retryCount);
		retryCount = retryCount+1;
		User user = this.userService.getUser(userId); // here we will get the information of single user 
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	/*
	@CircuitBreaker(name = "ratingHotelBreakerCircuitBreakerName", fallbackMethod = "ratingHotelFallbackMethodName")
	@Retry(name = "ratingHotelRetryName", fallbackMethod = "ratingHotelRetryMethodName")
	Best practice: Use only one fallback method and let both annotations share it. Eg. ratingHotelFallbackMethodName.
	Execution Flow (when both are applied)-
	First, @Retry will attempt retries (let’s say 3 times). If all retries fail, then @CircuitBreaker logic applies. Once the failure threshold. 
	of the Circuit Breaker is crossed, it opens the circuit and directly calls the fallback method without hitting the external service.
	
	*/

	
	public ResponseEntity<User> ratingHotelRetryMethodName(String userId, Throwable exception){
		User user = new User();
		user.setUserId("123456");
		user.setUserName("dummy");
		user.setUserEmail("dummy@gmail.com");
		user.setRatings(new ArrayList<>());
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	// fallback method ka name, vhi hona chahiye jo hamne CB ke yha likha hai 
	// normal method and fallback method dono ka name same hona mangta 
	public ResponseEntity<User> ratingHotelFallbackMethodName(String userId, Throwable exception){
		User user = new User();
		user.setUserId("123456");
		user.setUserName("dummy");
		user.setUserEmail("dummy@gmail.com");
		user.setRatings(new ArrayList<>());
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
