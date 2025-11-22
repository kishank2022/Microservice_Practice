package com.javaInterview.question.dailyQuestions.coreJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMinMax_41 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int min1 = list1.stream().sorted().findFirst().get();
		System.out.println("Min1:"+min1);
		
		int min2 = list1.stream().min(Integer::compareTo).get();
		System.out.println("Min2:"+min2);
		
		int max1 = list1.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println("Max1:"+max1);
		
		int max2 = list1.stream().max(Integer::compareTo).get();
		System.out.println("Max2:"+max2);
	}
}
