package com.webla.spring.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.webla.spring.annotations")
@PropertySource(value = "classpath:databaseconfig.properties")
public class BeansConfiguration {
	/*
	 * @Bean public DataSource sqlDataSource() { return new SqlDataSource(); }
	 * 
	 * @Bean
	 * 
	 * @Primary public DataSource oracleDataSource() { return new
	 * OracleDataSource(); }
	 */
}
