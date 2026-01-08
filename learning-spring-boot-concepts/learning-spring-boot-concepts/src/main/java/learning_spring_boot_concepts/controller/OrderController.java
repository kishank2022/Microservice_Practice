package learning_spring_boot_concepts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import learning_spring_boot_concepts.service.PaymentService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/pay")
	public String placeOrder() {
		return paymentService.makePayment();
	}
}
