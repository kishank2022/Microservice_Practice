package com.unit.test.cases.learning.logic.service;

public class CalculatorService {

	public static int addService(int n1, int n2) {
		int sum = n1+n2;
		System.out.println("Sum:"+sum);
		return sum;
	}
	
	public static int productService(int n1, int n2) {
		int product = n1*n2;
		System.out.println("product:"+product);
		return product;
	}
	
	
}
