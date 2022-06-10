package com.recode.aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.recode.aula")
public class Aula202202141Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula202202141Application.class, args);
	}

}
