package com.javaInterview.question.multithreading1;

public class MultiThreadingByExtendingThreadClass {

	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		MyThread1 thread2 = new MyThread1();
		thread1.setName("thread1_kishan");
		thread2.setName("thread2_kishan");
		thread1.setName("thread1_kishan");
		thread1.start();
		thread2.start();
	}
}


// Tyoe one creating a class and extends it to Thread class
//Thread is a class ( java.lang.Thread)
class MyThread1 extends Thread{
	public void run() {
		for(int i = 1; i<= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(5000); 
            } catch (Exception e) {
                System.out.println(e);
            }
		}
	}
}
