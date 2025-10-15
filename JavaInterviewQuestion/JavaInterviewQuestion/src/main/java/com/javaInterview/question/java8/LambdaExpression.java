package com.javaInterview.question.java8;

/*

	Syntax - (parameter_list) -> { body }
	
	* A function without a name, used to implement functional interfaces.
	* Lambda doesn’t create a separate class file, and it’s more lightweight and readable.
	* Concise, readable, efficient, Used in Threads, Streams, Collections, Callbacks etc.
	
*/
public class LambdaExpression {

	public static void main(String[] args) {
		Greeting g = (inputName) -> {
			inputName = "Hello "+ inputName;
			return inputName;
		};		
		System.out.println(g.name1("Kishan"));
	}
	
}

interface Greeting{	
	 String name1(String name);
}