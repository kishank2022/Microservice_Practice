package com.javaInterview.question.java8;

@FunctionalInterface
public interface SumInterface {
	public int sum(int n1, int n2);
	
	public static int staticSum(int n1, int n2) {
		System.out.println("static method is called !!");
		return n1+n2;
	}
	
	default int defaultSum(int n1, int n2) {
		System.out.println("Default method is called !!");
		return n1+n2;
	}
}
