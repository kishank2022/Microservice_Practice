package com.javaInterview.question.dailyQuestions.coreJava;

import java.time.Instant;
import java.time.LocalDateTime;

public class DateTime_48 {
	// Question - I have to use a date-time which is common in all the area over the world, so we use Instant 
	public static void main(String[] args) {
		// Question 48 - Let us assume, I am a Admin and i have to schedule a meeting at 09.00 pm nad i am in India,
		// and I want that everyone should see the same time 09.00 pm all over the world 
		// so for that we will use Instant class in java not LocalDateTime in java
		// Instant me universal time store hota hai 
		System.out.println(Instant.now()); // 2025-11-06T16:59:37.238406200Z
		System.out.println(LocalDateTime.now()); // 2025-11-06T22:29:37.379830800
		/*
		 LocalDateTime = A date-time without timezone, i.e if hamne test ke liye time 9.00 am bola hai India ke hisab se,
		  but global me sab yh time same nhi hoga, so for that we use Instant  
		 Instant - Instant is a class, jo ki global ka date and time bata ta hai 
	*/
		
		
	}
	
	
	// last me jo variable arguments ko store karne ke liye banaya hai ( isko int...num3 ) hamesha last me likho bich me nhi 
	public static void sum1(int n1, int n2, int...num3) {
		int sum1 = n1+n2;
		for(int n : num3) {
			sum1 = sum1 + n; 
		}
		System.out.println("Sum1:"+sum1);
	}
	
	// Variable Arguments in java 
	// Question 50- Vargs in java 
	public static void main_1(String[] args) {
		sum1(10,20,30,40,50);
	}
	
}

