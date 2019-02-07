package com.adp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.adp.domain.Calcul;

@SpringBootApplication
public class MonProjet22AopLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonProjet22AopLoggingApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runIt(Calcul c) {
		return args -> {
			c.additionner(11, 22);
		};
	}
}
