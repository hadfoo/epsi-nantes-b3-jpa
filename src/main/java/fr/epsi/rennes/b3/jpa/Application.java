package fr.epsi.rennes.b3.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;

@SpringBootApplication(
		scanBasePackages = "fr.epsi.rennes.b3.jpa",
		exclude = ReactiveSecurityAutoConfiguration.class)
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

}
