package com.javaInterview.question;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javaInterview.question.springBoot.DependencyClass;

@SpringBootApplication
public class JavaInterviewQuestionApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(JavaInterviewQuestionApplication.class, args);
//	}
	
	/*
	  LifeCycle of Bean 
	    1) Constructor → Bean is created.
		2) Dependency Injection → Spring injects required beans.
		3) @PostConstruct / afterPropertiesSet() → Init logic (DB connection, resource setup). (used for loosely coupled)
		4) Bean Ready → Used by application.
		5) @PreDestroy / destroy() → Cleanup (close DB connection, free resources).( used for loosely coupled)
	 
	 */
	
	
	// ByDefault Scope of Bean is Singleton. // The ApplicationContext (IoC container), manages LifeCycle of Bean
	public static void main(String[] args) {
//		SpringApplication.run(JavaInt.class, args); //  this created ApplicationContext in Spring Boot
		ApplicationContext applicationContext =  SpringApplication.run(JavaInterviewQuestionApplication.class, args);
		DependencyClass dependencyClass = applicationContext.getBean(DependencyClass.class);
		dependencyClass.getClassName();
	}

}
