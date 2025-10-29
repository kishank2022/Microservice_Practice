package com.javaInterview.question.springBoot;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class VirtualThread {
	
	Executor executor = Executors.newFixedThreadPool(5);
	
	
	public static void main(String[] args) {
		VirtualThread test = new VirtualThread();
		test.test1();
	}
	
	public void test1() {
		executor.execute(()->{
			System.out.println("Heloow World");
		});
	}
}


/*
	 In Tomcat server 200 threads is the default thread 
	 



*/