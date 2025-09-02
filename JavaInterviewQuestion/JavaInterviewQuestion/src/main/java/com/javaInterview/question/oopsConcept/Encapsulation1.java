package com.javaInterview.question.oopsConcept;

/*
 
 Encapsulation is the process of binding data and methods together into a single unit (class) and 
 restricting direct access to variables by making them private. We provide controlled access using getter and setter methods.
 It helps in data hiding, security, and maintainability.
 
 Data Hiding → Prevents unauthorized access. 
 Controlled Access → We can validate data before setting it.
 Flexibility & Maintainability → Internal implementation can change without affecting outside code.
 Security → Sensitive data stays safe.
 
 
 */
public class Encapsulation1 {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
