package com.javaInterview.question.springMvc;

public class SpringMVC {


}

/*
	
	-- Spring MVC is a Model–View–Controller framework used to build web applications in Java.
	It separates the application into:	
	1) Model → Data / Business objects
	2) View → JSP / Thymeleaf / HTML
	3) Controller → Handles HTTP requests

	-- Spring MVC Architecture
	Client → DispatcherServlet → HandlerMapping → Controller → Service → DAO → DB
	       ← ViewResolver ← JSP/HTML ← ModelAndView ← Controller
	       
	DispatcherServlet - The front controller that receives every HTTP request.
	HandlerMapping - Chooses which controller method to call.
	Controller - Business logic runs here.
	ViewResolver - Finds JSP/HTML page.
	Model - Used to send data from Controller → View.
	
	-- Step 1 DispatcherServlet ( web.xml)
	<web-app>	
	    <servlet>
	        <servlet-name>springmvc</servlet-name>
	        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	        <load-on-startup>1</load-on-startup>
	    </servlet>	
	    <servlet-mapping>
	        <servlet-name>springmvc</servlet-name>
	        <url-pattern>/</url-pattern>
	    </servlet-mapping>	
	</web-app>

	-- Step 2 - springmvc-servlet.xml (ViewResolver)
	<beans>	
	   <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	       <property name="prefix" value="/WEB-INF/views/"/>
	       <property name="suffix" value=".jsp"/>
	   </bean>	
	</beans>
	
		Q6: Why prefix/suffix are used in ViewResolver?
		To avoid writing the full JSP path repeatedly.
	
	-- Step 3 - Controller
		@Controller
		public class HomeController {		
		    @GetMapping("/hello")
		    @ResponseBody
		    public String sayHello() {
		        return "Hello from Spring MVC!";
		    }		
		    @GetMapping("/user")
		    public String getUser(@RequestParam("id") int id, Model model) {
		        model.addAttribute("userid", id);
		        model.addAttribute("name", "Kishan Kushwaha");
		        return "user";	
		    } // for view in jsp ===  ${userid} , ${name}
		}


	

















*/
