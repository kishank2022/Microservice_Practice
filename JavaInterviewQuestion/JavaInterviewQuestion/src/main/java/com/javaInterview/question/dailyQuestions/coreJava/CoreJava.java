package com.javaInterview.question.dailyQuestions.coreJava;

import org.springframework.boot.web.servlet.server.Session;

public class CoreJava {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Hello world");
		
		/*
			char primitive data type in java 
			It supports Unicode characters set
			It can have/supports 65536 characters
			It takes 2 byte of memory 
		
		*/
		
		// Class.forName ki help se ham kisi bhi class ka package ke sath name 
		//likh ke uska pura information nikal sakte hai 
		// yha hame apne hi class ke super class ka name pata kiya 
		Class<?> aClass = Class.forName("com.javaInterview.question.dailyQuestions.coreJava.CoreJava");
		System.out.println("supercalss name::"+aClass.getSuperclass().getName()); // java.lang.Object
		
		//try(Session session = new Session()){
		// try ke andar code likhte hai isko ham try with resource bolte hai, 
		// abhi ham jese db connection ko open karte hai fir usko close karne ka code finally me likhte hai aisa kab tak karege 
		// isliye ham try with resource use karte hai isme close karne ki jarurat nhi hai 
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
