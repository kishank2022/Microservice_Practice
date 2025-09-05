package com.javaInterview.question.java8;

interface A{
	default void greet() {
		System.out.println("Greeting from A");
	}
}

interface B extends A{
	default void greet() {
		System.out.println("Greeting from B");
		A.super.greet();  // Greeting from A
	}
}

class C implements B, A{
	@Override
	public void greet() {
		System.out.println("Greeting from C");
		B.super.greet(); // Greeting from B
	}
}

public class InterfaceExample1 {
	public static void main(String[] args) {
		C objc = new C();
		objc.greet(); //  Greeting from C
	}
}
