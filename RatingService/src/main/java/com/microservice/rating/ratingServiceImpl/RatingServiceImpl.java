package com.microservice.rating.ratingServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.rating.entity.Rating;
import com.microservice.rating.exception.ResourceNotFoundException;
import com.microservice.rating.ratingService.RatingService;
import com.microservice.rating.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating saveRating(Rating rating) {
		Rating saveRating = this.ratingRepository.save(rating);
		return saveRating;
	}

	@Override
	public List<Rating> getAllRating() {
		List<Rating> list1 = this.ratingRepository.findAll();
		return list1;
	}
	
	@Override
	public Rating getRatingByRatingId(String ratingId) {
		Rating rating = this.ratingRepository.findById(ratingId).orElseThrow(() -> new ResourceNotFoundException("Resource noit available!!"));
		return rating;
	}

	@Override
	public List<Rating> getAllRatingByUserId(String userId) {
		List<Rating> list1 = this.ratingRepository.findByUserId(userId);
		return list1;
	}



	@Override
	public List<Rating> getAllRatingByHotelId(String hotelId) {
		List<Rating> list1 = this.ratingRepository.findByHotelId(hotelId);
		return list1;
	}
	
	@Override
	public List<Rating> getAllByRating(int rating){
		List<Rating> list1 = this.ratingRepository.findByRating(rating);
		return list1;
	}

}
