package com.microservice.user.userService;

import java.util.List;

import com.microservice.user.entity.User;

public interface UserService {

	public User createUser(User user);
	
	public List<User> getAllUser();
	
	public User getUser(String userId);
	
	
}
