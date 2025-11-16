package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.crud.controller","com.crud.model","com.crud.repository","com.crud.service"})
public class SpringCrudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudApiApplication.class, args);
	}
 
}
