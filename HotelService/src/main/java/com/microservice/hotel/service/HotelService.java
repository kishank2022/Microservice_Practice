package com.microservice.hotel.service;

import java.util.List;

import com.microservice.hotel.entity.Hotel;

public interface HotelService {

	public Hotel createHotel(Hotel hotel);
	
	public List<Hotel> getAllHotels();
	
	public Hotel getHotel(String hotelId);
}
