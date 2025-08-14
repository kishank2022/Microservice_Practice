package com.microservice.user.userServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.user.dto.Rating;
import com.microservice.user.entity.User;
import com.microservice.user.exception.UserNotFoundException;
import com.microservice.user.repository.UserRepository;
import com.microservice.user.userService.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
//	private RestTemplate restTemplate = new RestTemplate();  // if hamne bean nhi banaya tho ham aise restTemolate banege 
	
	// ab hamne bean bana diya hai tho ham @Autowire RestTemplate use karsakte hai 
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public User createUser(User user) {
		String id = UUID.randomUUID().toString();
		user.setUserId(id);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		User user = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User is not present!!!!"));
		
		String url1 = "http://localhost:8087/api/rating/user/"+userId;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Void> entity = new HttpEntity<>(headers);
		try {
			List<Rating> ratingList1 = restTemplate.getForObject(url1, ArrayList.class);
			List<Rating> ratingList = (List<Rating>) restTemplate.exchange(url1, HttpMethod.GET, entity, ArrayList.class);
			System.out.println("responseString>>"+ratingList);
			user.setRatings(ratingList);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return user;
		
	}

}
