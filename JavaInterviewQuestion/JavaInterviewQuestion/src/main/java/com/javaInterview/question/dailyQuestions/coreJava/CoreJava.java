package com.javaInterview.question.dailyQuestions.coreJava;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.boot.web.servlet.server.Session;

public class CoreJava {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Hello world");
		
		/*
		 	Question 18 - Memory required for char primitive datatype
			char primitive data type in java 
			It supports Unicode characters set
			It can have/supports 65536 characters
			It takes 2 byte of memory 
		
		*/
		
		// Question 19 - this prog. is for printing all the methods of class all constructor/superclass constructor of class at runtime in java 
		// This is called Reflection API
		// Class.forName ki help se ham kisi bhi class ka package ke sath name 
		//likh ke uska pura information nikal sakte hai 
		// yha hame apne hi class ke super class ka name pata kiya 
		Class<?> aClass = Class.forName("com.javaInterview.question.dailyQuestions.coreJava.CoreJava");
		System.out.println("supercalss name::"+aClass.getSuperclass().getName()); // java.lang.Object
		
		
		// Question - 26 - Resource management in java
		// try ke andar koi resource open kiya tho usko close karne ki koi jarurat nhi hai 
		//try(Session session = new Session()){
		// try ke andar code likhte hai isko ham try with resource bolte hai, 
		// abhi ham jese db connection ko open karte hai fir usko close karne ka code finally me likhte hai aisa kab tak karege 
		// isliye ham try with resource use karte hai isme close karne ki jarurat nhi hai 
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		calculate_factorial(20);
		
	}
	
	// Question 14
	// Always use BigDecimal or BigInteger for calculating the factorial of big numbers
	public static void calculate_factorial(int number) {
		BigDecimal factorial = BigDecimal.ONE;
		for(int i=1; i<=number; i++) {
			factorial = factorial.multiply(new BigDecimal(i));
		}
		System.out.println("Factorial:"+factorial);
	}
}
