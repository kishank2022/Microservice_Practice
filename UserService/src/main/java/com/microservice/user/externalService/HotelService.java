package com.microservice.user.externalService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.user.dto.Hotel;

@FeignClient(name = "HOTELSERVICE")
public interface HotelService {

	// String url2 = "http://HOTELSERVICE/hotel/api/getHotel/"+hotelId;
	
	@GetMapping("/hotel/api/getHotel/{hotelId}")
	ResponseEntity<Hotel> getHotel(@PathVariable("hotelId") String hotelId);
}
