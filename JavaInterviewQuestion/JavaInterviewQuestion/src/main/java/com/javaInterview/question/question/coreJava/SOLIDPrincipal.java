package com.javaInterview.question.question.coreJava;

public class SOLIDPrincipal {

}




/*
   SOLID Principals of Java
   S - S → One class = One responsibility
   O → Extend, don’t modify existing code
   L → Subclasses should replace parents safely
   I → Prefer small, specific interfaces
   D → Depend on abstractions, not concrete classes
   
   
   
   	1️.  Single Responsibility Principle (SRP)
    A class should have only one responsibility.
    class Report {
    public void generateReport() {}
    public void saveToFile() {}
  } 
  // Problem: Report class has two responsibilities → generating and saving.
   Class 1: Responsible for report generation
	class Report {
	    public void generateReport() {
	        System.out.println("Generating Report...");
	    }
	}
	// Class 2: Responsible for saving report
	class ReportSaver {
	    public void saveToFile() {
	        System.out.println("Saving Report to File...");
	    }
	}
	
	2. Open/Closed Principle (OCP)
	A class should be open for extension but closed for modification.
		// Parent interface
		interface Payment {
		    void pay(int amount);}
		
		// New payment methods can be added without changing old code
		class CreditCardPayment implements Payment {
		    public void pay(int amount) {
		        System.out.println("Paid " + amount + " using Credit Card");  } }
		
		class UPIPayment implements Payment {
		    public void pay(int amount) {
		        System.out.println("Paid " + amount + " using UPI");  } }
		
		    public static void main(String[] args) {
		        Payment payment1 = new CreditCardPayment();
		        payment1.pay(1000);
		
		        Payment payment2 = new UPIPayment();
		        payment2.pay(500);   } // We added new payment types without modifying existing code.
		        
		        
		        
	3.  Liskov Substitution Principle (LSP)
	// Subclasses should be replaceable by their parent classes without breaking the application.
	 
	 // Wrong Example
	 class BankAccount {
    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount); } }
	class FixedDepositAccount extends BankAccount {
	    @Override
	    public void withdraw(double amount) {
	        throw new UnsupportedOperationException("Withdrawals not allowed on FD!");   }	}
	   // Violates LSP because FixedDepositAccount cannot be substituted where BankAccount is expected.
	  
	 // Right Example 
	  abstract class Account {   public abstract double getBalance(); }
	class SavingsAccount extends Account {
	    private double balance = 1000;
	    public double getBalance() {
	        return balance;  }	}
	class FixedDepositAccount extends Account {
	    private double balance = 5000;
	    public double getBalance() {
	        return balance;    }	}
	 // Now both accounts behave consistently and can be substituted, using getBalance()
    
    
    4. Interface Segregation Principle (ISP)
    //Clients should not be forced to implement interfaces they don’t use.
     // Wrong Code 
      interface AccountOperations {    void deposit(double amount);    void withdraw(double amount);
          void requestOverdraft(double amount);	}
		class SavingsAccount implements AccountOperations {
		    public void deposit(double amount) {}
		    public void withdraw(double amount) {}
		    public void requestOverdraft(double amount) {
		        // Not applicable, but forced to implement
		        throw new UnsupportedOperationException();
		    }
		}
	// Correct Code 
	 interface DepositOperation {		    void deposit(double amount);		}
	interface WithdrawOperation {		    void withdraw(double amount);		}
		
		class SavingsAccount implements DepositOperation, WithdrawOperation {
		    public void deposit(double amount) {}
		    public void withdraw(double amount) {}
		}	// Each account implements only what it needs.
		
		
		// 5. Dependency Inversion Principle (DIP)
		 // High-level modules should not depend on low-level modules. Both should depend on abstractions.
		  // Wrong Code // Here NotificationService is tightly coupled to EmailService.
		   class LoanApprovalService {
		    private EmailService emailService = new EmailService(); // tightly coupled		
		    public void approveLoan(String customer) {
		        System.out.println("Loan approved for: " + customer);
		        emailService.sendEmail("Dear " + customer + ", your loan is approved.");		    }		}
		class EmailService {
		    public void sendEmail(String message) {
		        System.out.println("📧 Email sent: " + message);		    }		}
		// Here, LoanApprovalService directly depends on EmailService. If tomorrow bank wants to send SMS or WhatsApp notifications,
		 // you must change LoanApprovalService → violates Open/Closed Principle + DIP.
	// Correct Example (Following DIP) in Banking
	 // Abstraction
		interface NotificationService {
		    void sendNotification(String message);
		}		
		// Low-level modules implementing abstraction
		class EmailNotification implements NotificationService {
		    public void sendNotification(String message) {
		        System.out.println("📧 Email sent: " + message);		    }		}
		class SMSNotification implements NotificationService {
		    public void sendNotification(String message) {
		        System.out.println("📱 SMS sent: " + message);		    }		}
		// High-level module depends on abstraction
		class LoanApprovalService {
		    private NotificationService notificationService;		
		    public LoanApprovalService(NotificationService notificationService) {
		        this.notificationService = notificationService;		    }		
		    public void approveLoan(String customer) {
		        System.out.println("Loan approved for: " + customer);
		        notificationService.sendNotification("Dear " + customer + ", your loan is approved.");		    }		}
		        
		public class BankApp {
	    public static void main(String[] args) {
	        // Injecting Email
	        LoanApprovalService emailLoanService = new LoanApprovalService(new EmailNotification());
	        emailLoanService.approveLoan("Kishan");	
	        // Injecting SMS
	        LoanApprovalService smsLoanService = new LoanApprovalService(new SMSNotification());
	        smsLoanService.approveLoan("Ramesh");	    }	}
	        
	   // Without DIP → LoanApprovalService locked to Email only. With DIP → LoanApprovalService can use Email, SMS, WhatsApp,
	   //  Push Notifications, etc. without modifying the service itself. This makes the banking system 
		//	 scalable & testable (we can mock NotificationService in unit tests).
    
    
    
 */



