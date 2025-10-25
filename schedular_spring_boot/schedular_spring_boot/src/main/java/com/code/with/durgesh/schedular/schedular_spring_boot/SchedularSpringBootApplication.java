package com.code.with.durgesh.schedular.schedular_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedularSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedularSpringBootApplication.class, args);
	}

}
