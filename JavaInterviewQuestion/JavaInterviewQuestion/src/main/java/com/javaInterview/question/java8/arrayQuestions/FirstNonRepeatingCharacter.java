package com.javaInterview.question.java8.arrayQuestions;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	
	public static void main(String[] args) {
		String s1 = "zuHello world, How are You";
		Map<Character, Long> map1 = s1.chars()
									.mapToObj(c -> (char)c)
									.filter(c -> c!=' ')
									.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
		
		Optional<Character> nonRepeating = map1.entrySet()
									.stream()
									.filter(entry -> entry.getValue() == 1)
									.map(Map.Entry::getKey)
									.skip(1)  // skip is used to skip the elements mentioned in it
									.findFirst();		
		
		Optional<Character> firstRepeating = map1.entrySet()
											.stream()
											.filter(entry -> entry.getValue()>1)
											.map(Map.Entry::getKey)
											.findFirst();
		if(nonRepeating.isPresent()) {
			System.out.println("First non repeating character is: "+nonRepeating.get());
		}else {
			System.out.println("First non repeating character is not present");
		}		
		
		if(firstRepeating.isPresent()) {
			System.out.println("First repeating character is: "+firstRepeating.get());
		}else {
			System.out.println("First repeating character is not present");
		}
		
	}
}
