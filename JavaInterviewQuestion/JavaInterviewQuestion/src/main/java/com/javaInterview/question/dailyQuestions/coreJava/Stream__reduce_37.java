package com.javaInterview.question.dailyQuestions.coreJava;

import java.util.List;

public class Stream__reduce_37 {

	/*
	 	Stream provides 3 methods - 
	 	
	 	1. Without Identity (Optional Return)
	 	List<Integer> numbers = Arrays.asList(5, 3, 7, 2, 8);
	 	Optional<Integer> result = numbers.stream().reduce((a, b) -> a + b);
	 	// yha pe "a" hamara accumulator hai, jo bhi new changes hoga vo a me store hota jaega 
	 	It takes first two elements of numbers list and add ups, final output is 25, 
	 	if the numbers list is empty it will return null 
	 	
	 	2. With Identity (Default Value)
	 	int sum = numbers.stream().reduce(0, (a, b) -> a + b);
	 	here in reduce method 0 is called identity, suppose if the list is empty then it will return 0.
	 	else it will return the sum of the elements in the list.

        System.out.println(sum);  // Output: 25 
	  
	 */
	 public static void main(String[] args) {
		List<String> list1 = List.of();
		List<Integer> list2 = List.of(1,2,3,4,5,6);
		int sum1 = list2.stream().reduce(0, (a,b)->a+b);
		System.out.println("sum1:-"+sum1);
		
		String s1 = list1.stream()
				.map(s2 -> s2.substring(0, 1))
				.reduce("empty", (a, b) -> a+b);
		System.out.println("S1>"+s1);
		
	}
}
