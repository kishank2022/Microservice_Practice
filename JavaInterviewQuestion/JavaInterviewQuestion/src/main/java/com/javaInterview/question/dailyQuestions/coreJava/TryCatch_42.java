package com.javaInterview.question.dailyQuestions.coreJava;

public class TryCatch_42 {

	public static void main(String[] args) {
		try {
			System.out.println("Try!!");
			int n = 5/0;
		}catch(Exception e) {
			System.out.println("Catch!!");
			return;
		}finally {
			System.out.println("Finally!!");
		}
	}
}
