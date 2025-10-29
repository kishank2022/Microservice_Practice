package com.javaInterview.question.dailyQuestions.coreJava;

public class TypeCasting {

	public static void main(String[] args) {
		double d1 = 4.5;
		int i1 = (int) d1;
		System.out.println("d1>>"+d1);
		System.out.println("i1>>"+i1);
		/*
		 	widening === implicit === chote value ko bade value me convert karte hai 
		 	narrowing  === explicit === bade value ko chote value me convert karna hai ( data loss hota hai )
		 	(narrowing ko forcefully karna padta hai ) 
		 	
		 	Truncation - Truncation means cutting off (or discarding) part of a value — usually its fractional part,
		 	or higher-order bits — when converting between data types.
		 	
		 */
	}
}
