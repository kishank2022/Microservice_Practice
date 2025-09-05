package com.example.learn.jwtAuthentication.config;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.learn.jwtAuthentication.service.impl.JWTService;
import com.example.learn.jwtAuthentication.service.impl.UserService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Step 7 - create JwtAuthenticationFilter.java class
@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	private JWTService jwtService;
	
	
	
	public JwtAuthenticationFilter(JWTService jwtService, UserService userService) {
		super();
		this.jwtService = jwtService;
		this.userService = userService;
	}

	private UserService userService;
	
	
	
	
	// Step 7 - create doFilterInternal method in JwtAuthenticationFilter.java class, 
	// create find by username method in repository layer of userRepository 
	 // Step 8 - this is method to get the username from repository layer this is our service layer 
	// created userDetailsService method in UserServcei Impl calss 
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		final String authHeader = request.getHeader("Authorization");
		final String jwt;
		final String userName;
		if(authHeader == null || authHeader.isEmpty() || !authHeader.startsWith("Bearer ")) {
			filterChain.doFilter(request, response);
			return;
		}
		jwt = authHeader.substring(7);
		userName = jwtService.extractUserName(jwt);
		
		if(!userName.isEmpty() && SecurityContextHolder.getContext().getAuthentication() == null) {
			UserDetails userDetails = userService.userDetailsService().loadUserByUsername(userName);
			
			// Step 10 vapas yha pe aake code karo expiration ka 
			if(jwtService.isTokenValid(jwt, userDetails)) {
				SecurityContext securityContext = SecurityContextHolder.createEmptyContext();
				UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities()
						);
				token.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				securityContext.setAuthentication(token);
				SecurityContextHolder.setContext(securityContext);
			}
		}
		filterChain.doFilter(request, response);
		// yha tak step 10 tha ab step 11 aaega 
//		Step 11 Security configuration class banao 
		
	}

}
