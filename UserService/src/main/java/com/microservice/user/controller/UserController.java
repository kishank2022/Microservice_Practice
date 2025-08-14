package com.microservice.user.controller;

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

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
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
	public ResponseEntity<User> getSingleUser(@PathVariable("userId") String userId){
		User user = this.userService.getUser(userId); // here we will get the information of single user 
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
