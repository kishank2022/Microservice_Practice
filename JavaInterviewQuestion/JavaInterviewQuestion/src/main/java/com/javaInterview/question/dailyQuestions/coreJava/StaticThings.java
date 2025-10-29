package com.javaInterview.question.dailyQuestions.coreJava;

import java.util.Scanner;

public class StaticThings {

	static int x = 10;
	int y = 5;
	public static void main(String[] args) {
		StaticThings obj1 = new StaticThings();
		StaticThings obj2 = new StaticThings();
		
		obj1.x += 10;
		System.out.println("obj1.x"+obj1.x); // 20
		obj2.x += 10;
		System.out.println("obj2.x"+obj2.x); // 30
		
		obj1.y += 10;
		System.out.println("obj1.y"+obj1.y); // 15
		obj2.y += 10;
		System.out.println("obj2.y"+obj2.y); // 15
		
		// in this example we can see that value of x is changed/updated from any reference, 
		// but value of y is changed from the same reference only
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		System.out.println("n1*2="+n1*2);
		
	}
	
}
/*
	static variables are commonly shared between class objects.
	if obj1 is altered the static variable then if we use the value in another class we will get the altered value 
	
	instance variable har ek objet ka apna khud ka value hota hai  
	vo vhi update hota hai, vho shared nhi hota.
	
	
	

*/