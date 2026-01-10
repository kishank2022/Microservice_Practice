package learning_spring_boot_concepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LearningSpringBootConceptsApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(
                LearningSpringBootConceptsApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(LearningSpringBootConceptsApplication.class, args);
	}

}
