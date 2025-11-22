package com.javaInterview.question.dailyQuestions.coreJava;

public class Thread_Example_36 {

	public static void main(String[] args) {
		/*simple code
		printTable(2);
		printTable(3);
		*/
		/*
	
		*/
		System.out.println(Thread.currentThread().getName());
		// To print 2 and 3 ka table simontaneously we use Thread in java 
		
		Runnable t1 = () -> {
			printTable(2);
		};
		
Runnable t2 = () -> {
	printTable(3);
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
		
	}
	
	public static void printTable(int n) {
		for(int i = 1; i<=10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}
