package com.javaInterview.question.multithreading1;

public class MultithreadingByUsingLambdaExpression {
// we can also create thread using lambda expression
	public static void main(String[] args) {
		// Since Runnable is a functional interface, you can use a lambda.
		Thread thread3 = new Thread(() -> {
			for(int i = 1; i<= 5; i++) {
				Thread.currentThread().setName("LambdaThread_kishan");
				System.out.println(Thread.currentThread().getName() + " - Count: " + i);
	            try {
	                Thread.sleep(3000); 
	            } catch (Exception e) {
	                System.out.println(e);
	            }
			}	
		});
		thread3.start();	
	}
}


