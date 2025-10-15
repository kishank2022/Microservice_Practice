package com.javaInterview.question.coreJava;

import java.util.stream.IntStream;

public class RecursionJava {

	/*
	 // Using Recursion 
	// print Natural no. from 1 to n without using any loop
	 
	public static void main(String[] args) {
		printNumber(1, 10);
	}	
	public static void printNumber(int startNumber, int endNumber) {
		if(startNumber <= endNumber) {
			System.out.print(startNumber+" ");
			printNumber(startNumber + 1, endNumber);
		}
	}
	*/
	
	/*
	// Using Streams (Java 8+)
	// // IntStream.rangeClosed(1, 100) generates numbers from 1 to 100.
	 
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100).forEach(System.out::println);   
	}
	*/
	
	/*
	 // static blocks are the blocks that are run before the main method 
	 // System.exit(0) ensures program exits after printing.
	 
	 static {
		 printNumbers(1);
		 System.exit(0);
	 }
	
	// Using Static Block (Trick)
	static void printNumbers(int n) {
		if(n <= 100) {
			System.out.print(n+ " ");
			printNumbers(n + 1);
		}
	}
	
	*/
	
	public static void main(String[] args) {
		
	}
	
	
	
	
}
