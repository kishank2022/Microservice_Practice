package com.javaInterview.question.springAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect; // Aspect
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*  Spring AOP (Aspect-Oriented Programming)
  Add dependency - in pom.xml
		  <dependency>
		    <groupId>org.springframework.boot</groupId>
		    <artifactId>spring-boot-starter-aop</artifactId>
		  </dependency>
	AOP allows you to write reusable concerns like logging, transactions, and security.
	Common use cases: 1-Logging, 2-Performance monitoring, 3-Transaction management, 4-Security checks
*/
@Aspect
@Component
public class SpringAOP {

	@Before("execution(* com.example.demo.PaymentService.makePayment(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("🔹 [LOG] Method called: " + joinPoint.getSignature().getName());
    }
	
	/*
	 	@Before → runs before method execution.
		@After → runs after method execution.
		@AfterReturning → runs after successful method execution.
		@AfterThrowing → runs if method throws an exception.
		@Around → runs before and after method execution.
	 */
	
}
