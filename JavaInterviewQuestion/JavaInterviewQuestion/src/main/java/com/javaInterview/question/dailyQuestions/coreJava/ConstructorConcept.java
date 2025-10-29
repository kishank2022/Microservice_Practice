package com.javaInterview.question.dailyQuestions.coreJava;

public class ConstructorConcept {

	/*
	public ConstructorConcept(String name)
	{
		// now we have explicitly defined a constructor tho ab java error dega and 
		// jo default constructor hai usko hide kardega
		// and hamko bolega aapka constructor use karo
	}
	*/
	public static void main(String[] args) {
		// abhi hame koi bhi constructor banaya nhi hai tho java bydefault ek constructor banadeta hai with no arguments.
		ConstructorConcept constructor1 = new ConstructorConcept();// it is not showing error 
	}
}
