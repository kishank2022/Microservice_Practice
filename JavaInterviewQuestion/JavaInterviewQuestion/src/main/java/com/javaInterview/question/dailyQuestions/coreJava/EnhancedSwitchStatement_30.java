package com.javaInterview.question.dailyQuestions.coreJava;

public class EnhancedSwitchStatement_30 {

	public static void main(String[] args) {
		int roleId = 2;
		String role = switch(roleId) {
		case 1 -> "One";
		case 2 -> "Two";
		case 3 -> "Three";
		case 5,6 -> "Five/Six"; // we can write multiple cases in one line, no need of break
		default -> "default"; // default mandatory
		};
		System.out.println("Role>>"+role);
	}
	
	// old switch case code
	public static void main_old(String[] args) {
		// old switch me ham condition switch ke inside likh ke usko case me compare karte hai 
		// if ham break likhna bhul gae tho uske niche vala case bhi execute hojata hai 
		int roldeId = 2;
		switch(roldeId) {
		case 1 : System.out.println("one");
		break;
		case 2 : System.out.println("two");
		break;
		case 3 : System.out.println("three");
		break;
		case 4 : System.out.println("Four");
		break;
		// we can write switch case without default
//		default: System.out.println("Default"); // default not mandatory
		}
	}
}
