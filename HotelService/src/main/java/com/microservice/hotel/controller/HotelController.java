package com.microservice.hotel.controller;

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
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.microservice.hotel.entity.Hotel;
import com.microservice.hotel.service.HotelService;

@RestControllerAdvice
@RequestMapping("/hotel/api")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/saveHotel")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		Hotel saveHotel = this.hotelService.createHotel(hotel);
		return new ResponseEntity<Hotel>(saveHotel, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllHotel")
	public ResponseEntity<List<Hotel>> getAllHotel(){
		List<Hotel> hotelList = this.hotelService.getAllHotels();
		return new ResponseEntity<List<Hotel>>(hotelList, HttpStatus.OK);
	}
	
	@GetMapping("/getHotel/{hotelId}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable("hotelId") String hotelId){
		Hotel hotel = this.hotelService.getHotel(hotelId);
		return ResponseEntity.status(HttpStatus.OK).body(hotel);
	}
	
}
