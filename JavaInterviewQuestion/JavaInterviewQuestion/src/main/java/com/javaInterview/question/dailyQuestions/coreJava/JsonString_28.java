package com.javaInterview.question.dailyQuestions.coreJava;

public class JsonString_28 {
public static void main(String[] args) {
	String jsonString1 = """
			{"name":"Kashish",
			 "age":16
			}
			""";
	System.out.println(jsonString1);
	
	// dynamic json string 
	String jsonString2 = """
			{
			"name":"%s",
			"age":%d
			}
			""".formatted("Kishan", 26);
	System.out.println(jsonString2);
}
}
