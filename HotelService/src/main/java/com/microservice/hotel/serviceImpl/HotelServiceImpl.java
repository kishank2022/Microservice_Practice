package com.microservice.hotel.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.hotel.entity.Hotel;
import com.microservice.hotel.exceptions.ResourceNotFoundException;
import com.microservice.hotel.repository.HotelRepository;
import com.microservice.hotel.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setHotelId(hotelId);
		Hotel saveHotel = this.hotelRepository.save(hotel);
		return saveHotel;
	}

	@Override
	public List<Hotel> getAllHotels() {
		List<Hotel> hotelList = this.hotelRepository.findAll();
		return hotelList;
	}

	@Override
	public Hotel getHotel(String hotelId) {
		Hotel hotel = this.hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found!!"));
		return null;
	}

}
