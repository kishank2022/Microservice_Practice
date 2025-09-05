package com.example.learn.jwtAuthentication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.learn.jwtAuthentication.entity.Role;
import com.example.learn.jwtAuthentication.service.impl.UserService;

// Step 11 - SecurityConfiguration calss banao and securityFilterChain method banake ke usko configure karo
@Configuration
public class SecurityConfiguration {

	private JwtAuthenticationFilter jwtAuthenticationFilter;
	
	
	private UserService userService;


	public SecurityConfiguration(JwtAuthenticationFilter jwtAuthenticationFilter, UserService userService) {
		super();
		this.jwtAuthenticationFilter = jwtAuthenticationFilter;
		this.userService = userService;
	}
	
	// Step 11 - creating url authority access 
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(AbstractHttpConfigurer::disable)
			.authorizeHttpRequests( request -> request.requestMatchers("/api/v1/auth/**").permitAll()
					.requestMatchers("/api/v1/admin").hasAnyAuthority(Role.ADMIN.name())
					.requestMatchers("/api/v1/user").hasAnyAuthority(Role.USER.name())
					.anyRequest().authenticated()
					)
			.sessionManagement(manager -> manager.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
			.authenticationProvider(authenticationProvider()) // step 12 authenticationProvider yh method banao 
			.addFilterBefore( jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
		return http.build();
	}
	
	// step 12 - authenticationProvider() method banao 
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userService.userDetailsService());
		authenticationProvider.setPasswordEncoder(passwordEncoder()); // Step 13 = create passwordEncoder
		return authenticationProvider;
	}
	
	// Step 13 - create passwordEncoder method 
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	// Step 14 - create authenticationManager method
	// Step 15 - Create SignupRequest Dto and contrroller and service layers 
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}
	
}
