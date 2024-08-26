package com.crud;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class SpringbootcrudDay4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcrudDay4Application.class, args);
	}

}
