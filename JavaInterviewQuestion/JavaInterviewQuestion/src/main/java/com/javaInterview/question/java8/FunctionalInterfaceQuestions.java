package com.javaInterview.question.java8;

public class FunctionalInterfaceQuestions {
 
	// one functionalInterface can extends another FunctionalInterface but the only condition is that
	// both cannot have abstract methods, either parentInterface or childInterface have only abstract method
	
	
	public static void main(String[] args) {
		SumInterface sum1 = (n1, n2) -> {return n1+n2;};
		System.out.println(sum1.sum(10, 20));
		System.out.println(sum1.defaultSum(10, 30));
		
		SumInterfaceChild sum2 = (n1, n2) -> {return n1-n2; };
		System.out.println(sum2.defaultSum(10, 5));
		System.out.println(sum2.defaultSum(020, 5));
	}
}
