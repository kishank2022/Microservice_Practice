package com.javaInterview.question.dailyQuestions.coreJava;

import java.util.Arrays;
import java.util.List;

public class Stream_Method_40 {

	/*
		Stream - 
		1. anyMatch() - at least one element matches the condition.
		2. allMatch() - all elements matches the condition
		3. noneMatch() - no element matches the condition
	*/
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		boolean anyMatch = list1.stream().anyMatch(n1 -> n1>100);
		System.out.println("anyMatch:"+anyMatch);
		
		boolean allMatch = list1.stream().allMatch(n1 -> n1!=0);
		System.out.println("allMatch:"+allMatch);
		
		boolean noneMatch = list1.stream().noneMatch(n1 -> n1%2==0);
		System.out.println("noneMatch:"+noneMatch);
	}
}
