package com.javaInterview.question.java8.arrayQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class DuplicateElementInArray {

	// first duplicate element
	public static void main(String[] args) {
//		firstDuplicateIntegerInArray();
//		secondDuplicateIntegerInArray();
		firstRepeatingCharacter();
	}
	
	
	// find first duplicate element in the array of integers using java 8
	public static void firstDuplicateIntegerInArray() {
		Integer [] array1 = {1,2,3,4,2,10,7,3,0,9};
		Set<Integer> duplicateElement1 = new HashSet<>();
		Optional<Integer> number1 = Arrays.stream(array1).filter(number -> !duplicateElement1.add(number)).findFirst();
		if(number1.isPresent()) {
			System.out.println("Duplicate element is:"+number1.get());
		}else {
			System.out.println("Element is not present");
		}
	}
	
	// find second duplicate element in the array of integers using java 8
		public static void secondDuplicateIntegerInArray() {
			Integer [] array1 = {1,2,3,4,2,10,7,3,0,9};
			Set<Integer> duplicateElement1 = new HashSet<>();
			Optional<Integer> number1 = Arrays.stream(array1).filter(number -> !duplicateElement1.add(number)).skip(1).findFirst();
			if(number1.isPresent()) {
				System.out.println("Second duplicate element is:"+number1.get());
			}else {
				System.out.println("Element is not present");
			}
		}
		
	// find First repeating character in the String
		public static void firstRepeatingCharacter() {
			String s1 = "chzihelloyiamkishran";
			Set<Character> set1 = new HashSet<>();
			Optional<Character> firstRepeatingCharacter = s1.toLowerCase()
						.chars()
						.mapToObj(c -> (char) c)
						.filter(c -> !set1.add(c))
						.findFirst();
			System.out.println(firstRepeatingCharacter.isPresent() ? "element is "+firstRepeatingCharacter.get() : "Element is not present");
			
			Set<Character> set2 = new HashSet<>();
			Optional<Character> secondRepeatingCharacter = s1.toLowerCase()
					.chars()
					.mapToObj(c -> (char) c)
					.filter(c -> !set2.add(c))
					.skip(1)
					.findFirst();
			System.out.println(secondRepeatingCharacter.isPresent() ? "element is "+secondRepeatingCharacter.get() : "Element is not present");
			
			Set<Character> set3 = new HashSet<>();// unique elements 
			Set<Character> set4 = new HashSet<>(); // duplicate elements
			Optional<Character> c1 = s1.toLowerCase()
					.chars()
					.mapToObj(c -> (char)c)
					.filter(c -> c!=' ')
					.filter(c -> {
						if(!set3.add(c)) {
							set4.add(c);
						}
						return true;
					})
					.filter(c -> !set4.contains(c))
					.findFirst();
			System.out.println(c1.isPresent() ? "first non repeating element is "+c1.get() : "Element is not present");
			
		}
}
