package com.javaInterview.question.dailyQuestions.coreJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional_Interface_52 {
	public static void main_1(String[] args) {
		functional_Interface fi = (s1)->{
			System.out.println("Hello "+s1);
		};
		//here in this printing statement it is showing error 
		// println() is a method which take boolean value as argument, but we are passing void that is why it is showing error 
		//System.out.println(fi.sayHello("Kishan"));
		fi.sayHello("Kishan"); // Hello Kishan
	}
	
	
	/*
	
	Question 54 - 
	BuiltIn Functional Interface methods Top 5
	1. Predicate,
	2. Function
	3. Consumer
	4. Supplier 
	5. BiFunction
	
	Predicate - Test a condition return boolean value. Eg. main_predicate();
	Function - Transform an input T to a result R. Function<T,R>, Signature - R apply(T t). Eg - main_function();
	Consumer - Accept a value and do something with it — returns nothing (side-effect). Signature: void accept(T t) main_consumer()
	Supplier - Produce or supply a value — takes no input, returns T. Useful for lazy generation, factories. Signature: T get() main_supplier()
	BiFunction - Take two inputs T and U and produce a result R. Signature: R apply(T t, U u) main_bifunction()
	
	*/
	
	public static void main_predicate(String[] args) {
		// Predicate - Test a condition return boolean value. Eg. main_predicate();
		Predicate<Integer> predicate1 = n -> n%2==0;
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list1.forEach(num -> System.out.println(predicate1.test(num)));
	}
	
	public static void main_function(String[] args) {
		//Function - Transform an input T to a result R. Function<T,R>, Signature - R apply(T t)
		Function<String, Integer> function1 = str1 -> str1.length();
		System.out.println("Length of word (Kishan) is "+function1.apply("Kishan"));
	}
	
	public static void main_consumer(String[] args) {
		// Consumer - Accept a value and do something with it — returns nothing (side-effect). Signature: void accept(T t)
		Consumer<String> consumer_1 = str -> System.out.println(str.toUpperCase());
		List<String> list1 = Arrays.asList("one", "two", "Three", "FouR");
		for(String s1 : list1) {
			consumer_1.accept(s1);
		}
	}
	
	public static void main_supplier(String[] args) {
		// Produce or supply a value — takes no input, returns T. Useful for lazy generation, factories. Signature: T get() main_supplier()
		Supplier<String> supplier1 = () -> "Hello Supplier";
		System.out.println(supplier1.get());
	}
	
	public static void main_bifunction(String[] args) {
		// Take two inputs T and U and produce a result R. Signature: R apply(T t, U u) main_bifunction()
		BiFunction<String, String, String> biFunction1 = (str1, str2) -> "Hello "+str1+" "+str2;
		System.out.println(biFunction1.apply("Kishan", "Mahesh Kushwaha")); // Hello Kishan Mahesh Kushwaha
	}
	
	
	
	
	
	
	/*
	
	Question 55 - Java Generics
	List ya koi bhi collection use karte samay ham bataege kki kounsa type ka data add karna hai, 
	List me koi ek type ka hi data ka hi data add karne ka .
	
	
	*/
	
}


@FunctionalInterface
interface functional_Interface{
	void sayHello(String s1);
}