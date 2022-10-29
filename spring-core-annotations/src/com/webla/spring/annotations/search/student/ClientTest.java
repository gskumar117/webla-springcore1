package com.webla.spring.annotations.search.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientTest {
	public static void main(String[] args) {
		
		//ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		ApplicationContext  applicationContext = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		StudentClient client = applicationContext.getBean("studentClient", StudentClient.class);
		client.displayEligibleColleges(1001);
	} 
}

