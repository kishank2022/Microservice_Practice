package com.javaInterview.question.microservice;

public class SynchronousAndAsynchronousCommunication {

}

/*
 
 Synchronous - In synchronous communication, one microservice waits for another microservice to respond before continuing. 
 			   It is blocking and real-time.
 	Uses - 1. When real-time data is required 2. Payment verification. 3. User details required to create an order.
 		   4. Login/authentication.
	Problem - 1. If UserService is slow, OrderService becomes slow 2. If UserService is down, OrderService fails
		      3. Tight coupling 4. More latency
		      
		--------------------------------------------------------------------------------------------------------------------------      
		      
 Asynchronous - In asynchronous communication, services do NOT wait for each other. Messages are sent through a message broker. 		      
 				It is non-blocking.
	Uses - 1. Background Processing (Non-blocking tasks) - Used when the result is not needed immediately. Eg, Email, SMS
		   2. High Performance & Low Latency - Service A does not wait for service B → extremely fast response.
		   3. Better Fault Tolerance (Loose Coupling) - 
		   	  If Service B is down, Service A still works. Events are stored in queues, so no data is lost.
		   4. Scalability
		      Each service can scale separately based on message load.
		   5. Event-Driven Architecture
		   	  Used for building modern microservices - 1. Order Created Event, 2. Payment Confirmed Event, 3. Inventory Reserved Event.
		   	  This helps build clean, decoupled systems.
	Problem - 1. No Immediate Response (Not Suitable for Real-Time Needs)
				Since the consumer responds later, you cannot get real-time result.
			  2. Complex Error Handling
			     If consumer fails, how do you know the message was processed?
			     Message may be re-delivered
				 Consumer may crash
				 Partial updates may occur
		      3. Difficult Debugging & Tracing 
		        Finding where the request failed is hard.
		      	Async systems behave like: Eg Service A → Queue → Service B → Another Queue → Service C
		      	We/Developer need to do Logging per event.
		      4. Eventual Consistency (Not Strong Consistency)
		        Data across services becomes eventually consistent, not immediate.
		      5. Complicated Architecture
		         Async systems require: Message brokers, Topics/Queues, Consumer groups, Dead letter strategies, Ordering guarantees.
		         More infrastructure = More complexity.
		      6. Message Ordering Issues - Kafka and RabbitMQ do not guarantee strict ordering for all partitions/queues.
		    
	Uses of Asynchronous Communication-
		1. Background tasks, 2. High performance, 3. Loose coupling, 4. Scalability, 5. Failure tolerance,
		6. Event-driven architecture, 7. Works even if consumer is down

 	Problems in Asynchronous Communication - 
 		1. No real-time response, 2. Eventual consistency, 3. Hard to debug, 4. Complex error handling, 5. Duplicate messages,
 		6. Ordering issues, 7. More infrastructure, 8. Hard consumer coordination.
		      
		         
		      	
		



*/

