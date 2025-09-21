package com.javaInterview.question.oopsConcept;


/*
 
 Inheritance in Java allows a class (child/subClass) to acquire properties and methods of another class (parent/superClass) 
 using the extends keyword. It promotes code reusability and represents an IS-A relationship. 
 Java supports single, multilevel, and hierarchical inheritance, but not multiple inheritance with classes 
 (to avoid ambiguity), which is handled using interfaces.
 Private members are not inherited. Final classes cannot be inherited. 
 Static methods are inherited but can’t be overridden (only hidden).
 
 Inheritance: IS-A relationship (Car is a Vehicle).
 Composition: HAS-A relationship (Car has an Engine). 
 
 */

public class InheritanceAssociation {

}

/*
	Association - Association is a relationship between two independent classes,
	that establishes a connection using their objects.
	Aggregation, Composition are two types of association.
	Aggregation (HAS-A relationship, weaker form of association) | A Library HAS-A Book. If the library is destroyed, the books can still exist.
	Composition (HAS-A relationship, stronger form of association) | Example: A Car HAS-A Engine. If the car is destroyed, the engine doesn’t make sense independently.
	
*/


/*
 
	Composition is an object-oriented design principle where one class contains an object reference to another class, 
	instead of inheriting from it.
	It represents a HAS-A relationship (unlike inheritance which is an IS-A relationship).
	Avoids issues of multiple inheritance.
	
*/

class Engine {
    void start() {
        System.out.println("Engine is starting...");
    }
}
class Car {
    private Engine engine; // HAS-A relationship
    Car() {
        this.engine = new Engine(); // Composition
    }
    void startCar() {
        engine.start(); // Delegation
        System.out.println("Car is ready to go!");
    }
}
class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar(); 
        // Engine is starting...
        //Car is ready to go!
    }
}





