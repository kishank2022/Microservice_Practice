package com.unit.test.cases.learning;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.unit.test.cases.learning.logic.service.CalculatorService;

import junit.framework.Assert;

@SpringBootTest
class TestCasesLearningApplicationTests {

	@Test
	void contextLoads() {
		
		int actualResult = CalculatorService.addService(10, 20);
		int expectedResult = 300;
		System.out.println("actualResult>"+actualResult);
		System.out.println("expectedResult>"+expectedResult);
		// we have two types of result, one result that we will get actually
//		and the other result that we are expecting 
		// for checking this we have Assert in jUnit.
		assertEquals(expectedResult, actualResult);
		
		// actual result
		
		// expected result
		
	}
	
	@Test
	public void productTest() {
		int expectedResult = 20;
		int actualResult = CalculatorService.productService(10, 20);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	
	
	
	
}
