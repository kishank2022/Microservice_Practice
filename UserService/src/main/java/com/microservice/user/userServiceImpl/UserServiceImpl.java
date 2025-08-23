package com.microservice.user.userServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.user.dto.Hotel;
import com.microservice.user.dto.Rating;
import com.microservice.user.entity.User;
import com.microservice.user.exception.UserNotFoundException;
import com.microservice.user.externalService.HotelService;
import com.microservice.user.repository.UserRepository;
import com.microservice.user.userService.UserService;
import com.netflix.discovery.converters.Auto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private HotelService hotelService;
	
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
		user.setRatings(ratingList(user.getUserId()));
		return user;
	}
	
	public List<Rating> ratingList(String userId){
		List<Rating> ratings = new ArrayList<>();
		try {
//			abhi yha pe ham serverIp and port no. likhe hai isko hatne ke lie 
//			ham direct serviceka name bhi use karsakte hai 
			
//			String url1 = "http://localhost:8087/api/rating/user/"+userId;
			
			String url1 = "http://RATINGSERVICE/api/rating/user/"+userId;
//			ab hamko port ki tension nhi koi bhi port pe run ho ham tho service name se hi call karege
			
			
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<Void> entity = new HttpEntity<>(headers);
			ResponseEntity<List<Rating>> ratingList =  restTemplate.exchange(url1, HttpMethod.GET, entity, new ParameterizedTypeReference<List<Rating>>() {});
			System.out.println("responseString>>"+ratingList);
			List<Rating> rating1 = ratingList.getBody();
			rating1 = rating1.stream().map(rating -> {
				rating.setHotel(getHotelById(rating.getHotelId()));
				return rating;
			}).collect(Collectors.toList());
			return rating1;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw e;
		}
	}

	public Hotel getHotelById(String hotelId) {
		//localhost:8086/hotel/api/getHotel/121a5889-852c-49c1-91d9-1e3a5e270f8c
		
//		String url2 = "http://localhost:8086/hotel/api/getHotel/"+hotelId;
		
		String url2 = "http://HOTELSERVICE/hotel/api/getHotel/"+hotelId;
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Void> entity = new HttpEntity<>(headers);
		try {
//			ResponseEntity<Hotel> hotel =  restTemplate.exchange(url2, HttpMethod.GET, entity, Hotel.class);
			ResponseEntity<Hotel> hotel = restTemplate.getForEntity(url2, Hotel.class);
			System.out.println("responseString>> hotel is fetched by using RestTemplate"+hotel.getBody());			
			getHotelById1(hotelId);
			return hotel.getBody();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return new Hotel();
	}
	
	public Hotel getHotelById1(String hotelId) {
		ResponseEntity<Hotel> hotel = this.hotelService.getHotel(hotelId);
		System.out.println("hotel>> is fetched using hotelService"+hotel);
		return hotel.getBody();
	}
	
}
