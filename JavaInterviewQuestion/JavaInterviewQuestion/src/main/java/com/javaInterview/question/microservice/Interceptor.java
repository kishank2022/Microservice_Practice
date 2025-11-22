package com.javaInterview.question.microservice;

public class Interceptor {

}

/*

----------------------------- Feign Client Interceptor-------------------------------------- 

	A Feign Client Interceptor is a component that allows you to modify every outgoing HTTP request made through a Feign Client.
	It is used to automatically add: Authentication tokens, Custom headers, Correlation ID / Trace ID, Logging, API keys,
	Request signatures (important in banking), Encryption headers, It acts exactly like a filter for Feign requests.
	
	--------
	import feign.RequestInterceptor;
	import feign.RequestTemplate;
	import org.springframework.stereotype.Component;
	@Component
	public class FeignAuthInterceptor implements RequestInterceptor {
	    @Override
	    public void apply(RequestTemplate template) {
	        // Add JWT Token
	        template.header("Authorization", "Bearer " + getToken());
	        // Add trace ID / correlation ID
	        template.header("X-Correlation-Id", generateCorrelationId());
	        // Add banking custom headers
	        template.header("client-id", "DCB-BANK-APP");
	        template.header("request-source", "MOBILE-BANKING");
	        // Logging
	        System.out.println("Feign Request → " + template.url());
	    }
	    private String getToken() {
	        // Normally generated from a TokenService
	        return "abc123tokenXYZ";
	    }
	    private String generateCorrelationId() {
	        return java.util.UUID.randomUUID().toString();
	    }
	}
	
	---------
	@FeignClient(
	        name = "upi-service",
	        url = "http://localhost:9090",
	        configuration = FeignAuthInterceptor.class
	)
	public interface UpiFeignClient {
	
	    @GetMapping("/upi/checkBalance/{accountNo}")
	    String checkBalance(@PathVariable String accountNo);
	}
	

-------------------------------------  RestTemplate Interceptor ----------------------------
	RestTemplate Interceptor is used to apply cross-cutting concerns — like authentication, tracing, logging, or header injection — 
	for every outgoing HTTP request. Instead of repeating header code everywhere, we put it in one interceptor.
	
	Interface Used - interface ClientHttpRequestInterceptor.java
	It has one method  intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) 
	
	
	Step 1: Create Interceptor
	
	@Component
	public class RestTemplateAuthInterceptor implements ClientHttpRequestInterceptor {
	    @Override
	    public ClientHttpResponse intercept(
	            HttpRequest request,
	            byte[] body,
	            ClientHttpRequestExecution execution) throws IOException {
	        // Add Authentication Token
	        request.getHeaders().add("Authorization", "Bearer " + getToken());
	        // Add Correlation ID
	        request.getHeaders().add("X-Correlation-ID", generateCorrelationId());
	        // Add Bank-specific header
	        request.getHeaders().add("client-id", "DCB-BANK");
	        // Log Request
	        System.out.println("Sending Request To: " + request.getURI());
	        System.out.println("Method: " + request.getMethod());
	        System.out.println("Headers: " + request.getHeaders());
	        System.out.println("Body: " + new String(body, StandardCharsets.UTF_8));
	        return execution.execute(request, body);
	    }
	    private String getToken() {
	        return "ABC123TOKEN";
	    }
	    private String generateCorrelationId() {
	        return java.util.UUID.randomUUID().toString();
	    }
	}

	Step 2: Register Interceptor with RestTemplate
	
	@Configuration
	public class RestTemplateConfig {
	    @Bean
	    public RestTemplate restTemplate(RestTemplateAuthInterceptor interceptor) {
	        RestTemplate restTemplate = new RestTemplate();
	        restTemplate.getInterceptors().add(interceptor);
	        return restTemplate;
	    }
	}
	
	Step 3: Use RestTemplate Normally - No need to add headers manually anymore.
	
	@Autowired
	private RestTemplate restTemplate;
	public String callPaymentService() {
	    String url = "http://payment-service/pay";
	    return restTemplate.getForObject(url, String.class);
	}

	









*/