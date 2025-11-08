package com.javaInterview.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		//int [] array1 = {1,2,3,4,5,6,7,8,2,5,6};
//		Set<Integer> set1 = new HashSet<>();
//		Optional<Integer> op2 = Arrays.stream(array1).boxed().filter(number -> !set1.add(number)).skip(1).findFirst();
//		if(op2.isPresent()) {
//			
//			System.out.println(op2.get());
//		}
		
		//int [] array1 = {2,3,4,5,6,1,7,8,2,5,6};
		//Optional<Integer> opt1 = Arrays.stream(array1).boxed().distinct().sorted().findFirst();
		//Optional<Integer> opt1 = Arrays.stream(array1).boxed().distinct().sorted(Comparator.reverseOrder()).findFirst();
//		if(opt1.isPresent()) {
//			System.out.println(opt1.get());
//		}
		
//		int [] array1 = {2,3,4,5,6,1,7,8,2,5,6};
//		List<Integer> even = Arrays.stream(array1).boxed().filter(number -> number%2 == 0)
//				.collect(Collectors.toList());
//		List<Integer> odd = Arrays.stream(array1).boxed().filter(number -> number % 2 != 0)
//				.collect(Collectors.toList());
		
		String s1 = "IAmAlokKushwaha";
		Set<Character> set1 = new HashSet<>();
		Optional<Character> opt1 = s1.chars()
								.mapToObj(letter -> (char)letter)
								.filter(letter -> !set1.add(letter))
								.findFirst();
		System.out.println(opt1.isPresent()? opt1.get() : "No"  );
								
		System.out.println("OKOK");
	}
}
