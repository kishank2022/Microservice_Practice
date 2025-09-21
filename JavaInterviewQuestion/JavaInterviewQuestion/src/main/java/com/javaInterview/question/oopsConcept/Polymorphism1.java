package com.javaInterview.question.oopsConcept;

/*
	Polymorphism = “Many forms.” | In Java, polymorphism means the same object can behave differently depending on the context.
	1. Compile-time Polymorphism (Static Binding / Method Overloading) - Resolved at compile-time.
	2. Runtime Polymorphism (Dynamic Binding / Method Overriding) - Resolved at runtime.
	
	In upcasting and downcasting, the method call depends on the actual object type (child), not the reference type → child method executes.
	But for static methods and variables, the call depends on the reference type (parent).
	
*/

public class Polymorphism1 {

}

/*
 	Parent p = new Child();  // Upcasting
 	Upcasting = Converting a child class object reference into a parent class reference.

	
	Child c = (Child) p;  // Downcasting
	Downcasting = Converting a parent class reference back to a child class reference.
	Safe, because 'p' is actually Child object
	Unsafe downcasting (will throw ClassCastException at runtime)
	
	Use instanceof operator before casting, for safely perform downcasting.
	if (animal instanceof Dog) {
    Dog safeDog = (Dog) animal;
    safeDog.fetch();
	}

*/

