package com.javaInterview.question.java8;

@FunctionalInterface
public interface SumInterfaceChild extends SumInterface{
	
//	int sum2(int n1, int n2); // one more abstract method is not allowed


	@Override
	default int defaultSum(int n1, int n2) {
		System.out.println("Default method in child interface!!");
		return n1+n2;
	}
}
