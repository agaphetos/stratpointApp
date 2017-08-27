package org.stratpoint.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * Spring Boot Application
 * This class is our main runner for our Spring Boot Application
 * This will also scan all our packages using @ComponentScan
 */
@SpringBootApplication
@ComponentScan("org.stratpoint")
public class StratpointApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(StratpointApplication.class, args);
	}
}
