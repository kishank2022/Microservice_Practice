package com.javaInterview.question.dailyQuestions.coreJava;

/*
	
	WrapperClass - A Wrapper Class in Java is an object representation of a primitive data type.
	byte == Byte, int == Integer, short == Short, long == Long, float == Float, double == Double, char == Character, boolean == Boolean
	
 */
public class WrapperClass {

	public static void main(String[] args) {
		int i = 100;
		Integer j = i;
		int result = j;
		System.out.println("i>>"+i);
		System.out.println("j>>"+j);
		System.out.println("result>>"+result);
		// Wrapper classes can hold null, but primitives cannot.
		// Wrapper objects are immutable (their value cannot be changed).
		// Comparing wrapper objects using == can be tricky.
		Integer a = 100;
		Integer b = 100;
		System.out.println(a == b); // true
		
		Integer c = 101;
		Integer d = 101;
		System.out.println(c == d); // true
		
		Integer x = 200;
		Integer y = 200;
		System.out.println( x == y); // false
		
		// here the trick is -
		// Java keeps a cache of frequently used integer values (to improve memory and performance).
		// Cached Range: -128 to 127
		// 101 and 100 is within the range of -128 to 127 so the output is true and 200 is out of range so the value is false.
		
	}
}
