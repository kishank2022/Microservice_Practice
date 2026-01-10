package learning_spring_boot_concepts.cicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class DriverController {

	
	@GetMapping
	public ResponseEntity<String> test(){
		System.out.println("Hello world");
		return ResponseEntity.ok("Hello World");
	}
}
