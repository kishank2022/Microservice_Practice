package com.javaInterview.question.dailyQuestions.coreJava;

import java.util.HashMap;
import java.util.Map;

public class Map_QUestion_45 {

	// Question 45 , Question 46 [ map - merge and putIfAbsent method in java
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("one", 1);
		map1.put("two", 2);
		map1.put("three", 3);
		System.out.println(map1);
		
		// putIfAbsent - if vo key phle se hi presenthai tho new value insert nhi karta,
		//new value update bhi nhi karta existing key me 
		map1.putIfAbsent("four", 4);
		map1.putIfAbsent("five", 5);
		map1.putIfAbsent("one", 100);
		
		System.out.println(map1);
		
//		merge - we can write any logic here we have used addition logic 
		map1.merge("one", 5, (oldValue, newValue) -> oldValue+newValue);
		//          key   newValue=5 , ( old + new === 1 + 5) 
		System.out.println(map1);
		
	}
}
