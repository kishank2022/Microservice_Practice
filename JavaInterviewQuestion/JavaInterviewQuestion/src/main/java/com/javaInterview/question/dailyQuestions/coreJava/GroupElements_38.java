package com.javaInterview.question.dailyQuestions.coreJava;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupElements_38 {

	public static void main(String[] args) {
		List<Driver> list1 = List.of(
				new Driver("YTIET", "dON", 22),
				new Driver("YTIET", "Kishan", 23),
				new Driver("KALYAN", "SONU", 22),
				new Driver("YTIET", "Kishan", 25),
				new Driver("KALYAN", "dON", 25)
				);
		Map<String, List<Driver>> collegeList = list1.stream()
										.collect(Collectors.groupingBy(obj1 -> obj1.getCollegeName()));
		System.out.println(collegeList);
		collegeList.forEach((college, driver) ->{
			System.out.println(college);
			driver.forEach(e -> System.out.println(e.getCollegeName()));
		});
		
	}
	
}

class Driver{
	String collegeName;
	String name;
	int age;
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Driver(String collegeName, String name, int age) {
		super();
		this.collegeName = collegeName;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Driver [collegeName=" + collegeName + ", name=" + name + ", age=" + age + "]";
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}