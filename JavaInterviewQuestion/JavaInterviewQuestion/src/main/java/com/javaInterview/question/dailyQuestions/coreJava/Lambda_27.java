package com.javaInterview.question.dailyQuestions.coreJava;

// Question 27 - Java - Lambda, Functional Interface concepts
public class Lambda_27 {

	public static void main(String[] args) {
		Calculator c1 = (n1, n2)->{
			int add = n1 + n2;
			return add;
		};
		System.out.println(c1.add(10, 200));
	}
}

@FunctionalInterface
interface Calculator{
	int add(int n1, int n2);
}
