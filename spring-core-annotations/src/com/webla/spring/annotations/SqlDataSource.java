package com.webla.spring.annotations;

import org.springframework.stereotype.Component;

@Component("sqlDataSource")
public class SqlDataSource implements DataSource{
	public void displayDatabaseDetails() {
		System.out.println("SQL Database Configured..");
	}
}