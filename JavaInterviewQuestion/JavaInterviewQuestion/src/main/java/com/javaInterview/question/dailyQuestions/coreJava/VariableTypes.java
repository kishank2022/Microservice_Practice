package com.javaInterview.question.dailyQuestions.coreJava;

public class VariableTypes {

	static int x; /// static variables are assigned with their default values
	int y; // /// instance variables are assigned with their default values
	public static void main(String[] args) {
		int z; /// local variables are not assigned with their default values
		System.out.println(x); // 0
		VariableTypes vt = new VariableTypes();
		System.out.println(vt.y); // 0
//		System.out.println(z); //  local variables are not assigned with their default values, that is why it is showing error 
		
		final int k = 20;
		// once a variable is declared as final its value cannot be unchanged. 
//		k = 30; // it will give compile time error 
		
		final int j;
		j = 30;
		// here in this example we have decalred j as final but we have not set the value so we can change the value of j
		
	}
}
