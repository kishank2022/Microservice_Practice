package com.learning.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreeTierApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreeTierApplication.class, args);
		System.out.println("ThreeTierApplication is about to start !!!!");
	}

}
