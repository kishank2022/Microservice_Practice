package com.microservice.rating.entity;

import com.microservice.rating.dto.Hotel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "micro_rating")
public class Rating {

	@Id
	@Column(name="rating_id")
	private String ratingId;
	
	private int rating;
	
	private String hotelId;
	
	private String userId;
	
	private String feedback;
	
	@Transient
	private Hotel hotel;
	
	

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Rating(String ratingId, int rating, String hotelId, String userId, String feedback) {
		super();
		this.ratingId = ratingId;
		this.rating = rating;
		this.hotelId = hotelId;
		this.userId = userId;
		this.feedback = feedback;
	}

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rating [ratingId=" + ratingId + ", rating=" + rating + ", hotelId=" + hotelId + ", userId=" + userId
				+ ", feedback=" + feedback + "]";
	}

	public String getRatingId() {
		return ratingId;
	}

	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
}
