package com.recode.aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.recode.aula")
public class MeuTesteOAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuTesteOAuthApplication.class, args);
	}

}
