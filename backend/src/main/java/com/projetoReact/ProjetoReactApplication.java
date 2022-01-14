package com.projetoReact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@EntityScan(basePackages = "entities")
public class ProjetoReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoReactApplication.class, args);
	}

}
