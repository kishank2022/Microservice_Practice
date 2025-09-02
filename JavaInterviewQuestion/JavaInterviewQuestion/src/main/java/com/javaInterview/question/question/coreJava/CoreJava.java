package com.javaInterview.question.question.coreJava;

import java.util.List;

public class CoreJava {

	public static void main1(String[] args) {
	
	
	
	// multithreading in java
//	Types of Creating Threads in Java
	// 1. Extending the Thread class
	// Create a class that extends Thread, Override the run() method, 
	// Create an object and call start() (not run() directly).
		MyThread1 thread1 = new MyThread1();
		MyThread1 thread2 = new MyThread1();
		thread1.setName("thread1");
		thread2.setName("thread2");
		thread1.start();
		thread2.start();
		// yha hamne MyThread1 name se class banaya hai, fir us class ko extend kiya Thread class se 
		// inside that class run method ko override kiya hai, and us run method me java ka code kiya hai 
		
		
		// 2. Implementing the Runnable interface
		// Create a class that implements Runnable, Override run() method, 
		//Pass object to Thread class constructor, Call start().
		Runnable runnable = new MyRunnable1();
		Thread t1 = new Thread(runnable, "Runnable-1");
        Thread t2 = new Thread(runnable, "Runnable-2");
        t1.start();
        t2.start();
        
        
        // 3. Creating Thread with Lambda (Java 8+)
        // Since Runnable is a functional interface, you can use a lambda.
        Thread thread3 = new Thread(() -> {
        	for(int i =1; i<5 ; i++) {
        		try {
        		Thread.sleep(5000); 
        		}catch(Exception e) {
        			e.printStackTrace();
        			System.out.println(e.getMessage());        			
        		}
        		System.out.println("Lambda Count: "+i);
        	}
        });
        thread3.start();
	}
	
	
	
//  Exception Handling in java 
//  throw is used inside a method to actually throw a single exception object, we can write multiple throw inside the method area
  // but only one exception will get throw at a time. We cannot throw two exceptions at the same time with one throw.
  // Eg.  if (age < 18) {
//  throw new Exception("Age must be 18 or above!"); }
  // throw → used to throw one exception object at a time. (inside method/block)
  // throws → used to declare multiple exceptions that a method may throw. (in method signature)
  // throws in Java, Used in method declaration to tell the caller that this method might throw exceptions.
  // Multiple exceptions can be declared using throws.
  // Eg. public static void readFile(String fileName) throws IOException, NullPointerException {
  
	
	
	
	
    
    // Association in Java
    // Association is a relationship between two classes that establishes a connection between their objects
    // In association, both classes can exist independently.
    // Types of Association - 1. One-to-One, 2. One-to-Many, 3. Many-to-One, 4. Many-to-Many
    
	
	
    // Copy Constructor
//  A copy constructor in Java is a constructor that creates a new object by copying the values from another object.
//  It is not built-in like in C++, but we can define it manually.
  public static void main2(String[] args) {
  	CopyConstructor1 constructor1 = new CopyConstructor1("Kishan", "Bhandup");
  	System.out.println(constructor1.toString());
  	CopyConstructor1 constructor2 = new CopyConstructor1(constructor1);
  	System.out.println("constructor2:"+constructor2);
	}
  
  
  
  
	
	
}

class MyThread1 extends Thread { // Thread is a class
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyRunnable1 implements Runnable {  // Runnable is an interface
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }    
}



// this is copy constructor class 
class CopyConstructor1{
	String name;
	String address;
	public CopyConstructor1(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	// copyConstructor
	public CopyConstructor1(CopyConstructor1 copyConstructor1) {
		this.name = copyConstructor1.getName();
		this.address = copyConstructor1.getAddress();
	}
	
	public CopyConstructor1() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CopyConstructor1 [name=" + name + ", address=" + address + "]";
	}
}





//Association in Java
// Association is a relationship between two classes that establishes a connection between their objects
// In association, both classes can exist independently.
// Types of Association - 1. One-to-One, 2. One-to-Many, 3. Many-to-One, 4. Many-to-Many
class Passport {
}
class Person {
	Passport passport; // One-to-One Association
}

class Teacher {
}
class School {
	List<Teacher> teachers; // One-to-Many Association
}

class Company {	
}
class Employee {
	Company company; // Many employees → One company, Many-to-One Example
}

// Many teachers can work in many schools.
class Teacher1 {
	List<School1> schools1; // // Many-to-Many Association
}
class School1 {
	List<Teacher1> teachers1;
}



