package com.javaInterview.question.multithreading1;

// This example is doing multithreading by implementing Runnable interface

public class MultiThreadingByImplementingRunnableInterface {

	public static void main(String[] args) {
		Runnable runnable1 = new MyRunnable1();
		Thread thread1 = new Thread(runnable1, "Rubbavle-1-kishan");
		Thread thread2 = new Thread(runnable1, "Rubbavle-2-kishan");
		thread1.start();
		thread2.start();
		
	}
	
}


class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i<= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(3000); 
            } catch (Exception e) {
                System.out.println(e);
            }
		}		
	}
	
}