package com.example.learn.jwtAuthentication.entity;

/*
	An enum in Java is a special data type that represents a fixed set of constants. It is type-safe,
	meaning the variable can only take one of the predefined values.
	
	Enum constants are static and final by default.
	Enums can have fields, constructors, and methods.	
	Enums can implement interfaces but cannot extend other classes (because they already extend java.lang.Enum).
	Commonly used in switch statements, representing states, or configuration values.
	
*/
public enum Role {

	USER, 
	ADMIN
}
