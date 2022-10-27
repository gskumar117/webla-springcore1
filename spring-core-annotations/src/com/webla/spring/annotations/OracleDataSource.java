package com.webla.spring.annotations;

import org.springframework.stereotype.Component;

@Component("oracleDataSource")
public class OracleDataSource implements DataSource{
	public void displayDatabaseDetails() {
		System.out.println("Oracle Database Configured..");
	}
}