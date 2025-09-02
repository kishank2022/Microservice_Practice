package com.javaInterview.question.springBoot;

import org.springframework.beans.factory.annotation.Autowired;

public class DependencyInjection {

	private DependencyClass dependencyClass;
	
    // ✅ Constructor Injection (best practice)
	public DependencyInjection(DependencyClass dependencyClass) {
		this.dependencyClass = dependencyClass;
	}
	// Constructor Injection is preferred → makes fields immutable, easier for unit testing, avoids NullPointerException.
	// IoC Container / ApplicationContext, manages Dependency Injection in Spring Boot.
	
	
	// Setter Injection, 1) Good when dependencies are optional. 2) Can change dependencies at runtime.
	// Object can be created without dependency (not safe for required dependencies).
	// ✅ Setter Injection
    @Autowired
    public void setDependencyClass(DependencyClass dependencyClass) {
        this.dependencyClass = dependencyClass;
    }
    
    // Field Injection - Dependency is injected directly into the field using @Autowired. Short and simple.
    // Harder to unit test (requires reflection). Not recommended in production-level code.
    @Autowired
    private DependencyClass dependencyClass1;
    
    
    

	
}
