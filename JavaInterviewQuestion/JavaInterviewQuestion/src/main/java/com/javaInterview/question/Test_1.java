package com.javaInterview.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Test_1 {
	public static void main(String[] args) {
		int [] array1 = {1,2,3,4,5,6,7,8,2,5,6};
		Set<Integer> set1 = new HashSet();
		Optional<Integer> op2 = Arrays.stream(array1).boxed().filter(number -> !set1.add(number)).skip(1).findFirst();
		if(op2.isPresent()) {
			System.out.println(op2.get());
		}
	}

}
