package com.javaInterview.question.dailyQuestions.coreJava;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaCoding_39 {

	public static void main(String[] args) {
		List<String> list1 = List.of("Alok","Kishan","Mahesh","Anita","Alok1","Alok2");
		// convert this list into map of String, Integer, === String and its length
		Map<String, Integer> map1 = list1.stream()
				.collect(Collectors.toMap(value -> value, value -> value.length())); 
		System.out.println("Map1:"+map1);
	}
}
