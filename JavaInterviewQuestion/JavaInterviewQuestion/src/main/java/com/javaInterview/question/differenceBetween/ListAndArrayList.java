package com.javaInterview.question.differenceBetween;

public class ListAndArrayList {

}

/*
 
 	List - It is an interface in java.util package.
 	ArrayList → It is a class in java.util package that implements the List interface.
 	
 	List<String> list = new ArrayList<>(); // ✅ Recommended (programming to interface)
 	ArrayList<String> list2 = new ArrayList<>(); // Possible but less flexible

	List is parent interface.
	ArrayList is a child class.( ArrayList inherits all methods from List and adds its own implementation.)
	
	List → Used when you want to declare a contract (generic).
	ArrayList → Used when you specifically need a dynamic array implementation.
	
	List Interface can be implemented by classes like -  ArrayList, LinkedList, Vector, etc.
	ArrayList - Faster in retrieval (get(index)) but slower in insert/delete in middle.
	
 
 
 */
