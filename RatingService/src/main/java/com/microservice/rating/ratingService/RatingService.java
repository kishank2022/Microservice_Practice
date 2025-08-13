package com.microservice.rating.ratingService;

import java.util.List;

import com.microservice.rating.entity.Rating;

public interface RatingService {

	public Rating saveRating(Rating rating);
	
	public Rating getRatingByRatingId(String ratingId);
	
	public List<Rating> getAllRating();
	
	public List<Rating> getAllRatingByUserId(String userId);
	
	public List<Rating> getAllRatingByHotelId(String hotelId);
	
	public List<Rating> getAllByRating(int rating);
	
}
