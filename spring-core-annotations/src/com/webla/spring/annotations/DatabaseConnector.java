package com.webla.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnector {
	
	@Value("${database.type}")
	private String dataSourceType;//ORACLE, SQL
	
	@Autowired
	private DataSource oracleDataSource;
	
	@Autowired
	private DataSource sqlDataSource;
	
	
	public void connect() {
		System.out.println("Connecting to datasource "+dataSourceType);
		if("ORACLE".equalsIgnoreCase(dataSourceType)) {
			oracleDataSource.displayDatabaseDetails();
		}else {
			sqlDataSource.displayDatabaseDetails();
		}
	}
}
