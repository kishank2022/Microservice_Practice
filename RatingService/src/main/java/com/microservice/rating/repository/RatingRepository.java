package com.microservice.rating.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.rating.entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String> {

	public List<Rating> findByUserId(String userId);
	public List<Rating> findByHotelId(String hotelId);
	public List<Rating> findByRatingId(String ratingId);
	public List<Rating> findByRating(int rating);
	
}
