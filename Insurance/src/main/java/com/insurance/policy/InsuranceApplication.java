package com.insurance.policy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class InsuranceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceApplication.class, args);
	}

}
