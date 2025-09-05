package com.javaInterview.question.java8.arrayQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwoConditionInFilter {

	public static void main(String[] args) {
		List<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(1, "kishan1", 1000, 1));
		list1.add(new Employee(2, "kishan2", 2000, 2));
		list1.add(new Employee(3, "kishan3", 3000, 3));
		list1.add(new Employee(4, "kishan4", 4000, 4));
		list1.add(new Employee(5, "kishan5", 5000, 5));
		
		// here we have used one single filter, and added two conditions.
		List<Employee> list2 = list1.stream()
								.filter(employee -> employee.getAge()>3 && employee.getSalary()>3000)
								.collect(Collectors.toList());
		for(Employee e : list2) {
			System.out.println(e);
		}
		
		// here we have used two different filter for two conditions 
		List<Employee> list3 = list1.stream()
							.filter(employee -> employee.getAge()>3)
							.filter(employee -> employee.getSalary()>3000)
							.collect(Collectors.toList());
		for(Employee e : list3) {
		System.out.println(e);
		}
		
	}
}

