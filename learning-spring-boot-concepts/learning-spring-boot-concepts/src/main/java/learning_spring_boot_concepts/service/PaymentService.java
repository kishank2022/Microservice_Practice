package learning_spring_boot_concepts.service;

import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@Service
public class PaymentService {
	
	private int attempt = 1;
	
	@Retry(name = "paymentRetry")
	@CircuitBreaker(name = "paymentServiceCB", fallbackMethod = "paymentFallback")
	public String makePayment() {
		System.out.println("Payment attempt:"+attempt);
		attempt = attempt + 1;
		if(attempt<=6) {
			throw new RuntimeException("Payment service is down!!");
		}
		
		return "Payment successfull!!";
	}
	
	public String paymentFallback(Exception e) {
		return "Falback method is running!! Payment service is temporary unavailable!!";
	}

}
