package com.javaInterview.question.dailyQuestions.coreJava;

// Question - 29 - In how many cases finally block will not get executes
public class FinallyBlock_29 {

	
	public static void main(String[] args) {
		System.out.println("start");
		/*
		 	1) If we write System.exit(0); // JVM exit
		 	2) JVM Crash
		 	3) Infinite loops 
		 */
		try {
			System.out.println("inside try");
//			System.exit(0);
		}catch(Exception e) {
			System.out.println("inside catch");
		}finally {
			System.out.println("inside finally");
		}
		System.out.println("end");
	}
}
