package com.webla.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(BeansConfiguration.class);
		DatabaseConnector dc = applicationContext.getBean("databaseConnector", DatabaseConnector.class);
		dc.connect();
	}
}
