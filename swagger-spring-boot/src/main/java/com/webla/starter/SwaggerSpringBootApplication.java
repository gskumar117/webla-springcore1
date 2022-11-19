 package com.webla.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Component Scan
//Configuration
//Resource
//@ComponentScan(value = {"org.webla.controller"})
public class SwaggerSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringBootApplication.class, args);
	}

}
