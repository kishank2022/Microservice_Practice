package com.microservice.hotel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "micro_hotel")
public class Hotel {

	@Id
	@Column(name="hotel_id")
	private String hotelId;
	
	@Column(name = "hotel_name", length = 100)
	private String hotelName;

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(String hotelId, String hotelName) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + "]";
	}
	
	
	
	
	
}
