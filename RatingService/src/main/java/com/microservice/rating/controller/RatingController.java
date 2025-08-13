package com.microservice.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.rating.entity.Rating;
import com.microservice.rating.ratingService.RatingService;

@RestController
@RequestMapping("/api/rating/")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	@PostMapping("/createRating")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		Rating savedRating = this.ratingService.saveRating(rating);
		return new ResponseEntity<Rating>(savedRating, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllRating")
	public ResponseEntity<List<Rating>> getAllRatings(){
		List<Rating> list1 = this.ratingService.getAllRating();
		return new ResponseEntity<List<Rating>>(list1, HttpStatus.OK);
	}
	
	@GetMapping("/get/{ratingId}")
	public ResponseEntity<Rating> getRating(@PathVariable("ratingId") String ratingId){
		Rating rating = this.ratingService.getRatingByRatingId(ratingId);
		return new ResponseEntity<Rating>(rating, HttpStatus.OK);
	}
 	
	@GetMapping("/hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable("hotelId") String hotelId){
		List<Rating> list1 = this.ratingService.getAllRatingByHotelId(hotelId);
		return new ResponseEntity<List<Rating>>(list1, HttpStatus.OK);
	}
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable("userId") String userId){
		List<Rating> list1 = this.ratingService.getAllRatingByUserId(userId);
		return new ResponseEntity<List<Rating>>(list1, HttpStatus.OK);
	}
	
	@GetMapping("/rating/{rating}")
	public ResponseEntity<List<Rating>> getRatingByRating(@PathVariable("rating") int rating){
		List<Rating> list1 = this.ratingService.getAllByRating(rating);
		return new ResponseEntity<List<Rating>>(list1, HttpStatus.OK);
	}
	
}
