package com.example.learn.jwtAuthentication;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.learn.jwtAuthentication.entity.Role;
import com.example.learn.jwtAuthentication.entity.User;
import com.example.learn.jwtAuthentication.repository.UserRepository;

@SpringBootApplication
public class JwtAuthentication1Application implements CommandLineRunner {
	
	public UserRepository userRepository;
	
	public JwtAuthentication1Application(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		System.out.println("JwtAuthentication1Application started !!!");
		SpringApplication.run(JwtAuthentication1Application.class, args);
	}

	// // Step 17 - Created default user with role admin in main method class
	
	public void run(String... args) {
		List<User> adminAccount = userRepository.findByRole(Role.ADMIN);
		if(adminAccount.size() < 1) {
			User user = new User();
			user.setUserName("admin");
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));
			user.setUserEmail("admin@gmail.com");
//			user.setRole(Role.ADMIN);
			user.setRole(Role.USER);
			userRepository.save(user);
		}
	}
}
