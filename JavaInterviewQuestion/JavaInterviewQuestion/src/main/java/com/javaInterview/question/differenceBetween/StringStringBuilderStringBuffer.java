package com.javaInterview.question.differenceBetween;

// Question 22 - Difference String and String Builder
public class StringStringBuilderStringBuffer {

	public static void main(String[] args) {
		int iteration = 100000;
		String s1 = "a";
		long starttime1 = System.nanoTime();
		for(int i = 1; i<iteration; i++) {
			s1 = s1+"a";
		}
		long endtime1 = System.nanoTime();
		long timeTaken1 = endtime1 - starttime1;
		System.out.println("time1>>"+timeTaken1);// time1>>647169600
		
		StringBuilder sb1 = new StringBuilder("a");
		long starttime2 = System.nanoTime();
		for(int i = 1; i<iteration; i++) {
			sb1.append("a");
		}
		long endtime2 = System.nanoTime();
		long timeTaken2 = endtime2 - starttime2;
		System.out.println("time2>>"+timeTaken2); // time2>>4761500
		// we can clearly see that time2 is less, it is faster
		
		
		
	}
}

/*
	
	String - 
	1. String is immutable.
	2. Stores the data in String constant pool.
	3. Thread Safe
	4. used in small modification areas
	5. slow in performance
	
	
	String Builder - 
	1. Mutuable
	2. Stores the data in heap area.
	3. not thread safe
	4. used in frequent modifications, loops 
	5. fast in performance

*/