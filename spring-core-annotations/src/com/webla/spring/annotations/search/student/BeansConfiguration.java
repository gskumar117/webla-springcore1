package com.webla.spring.annotations.search.student;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = "com.webla.spring.annotations.search.student")

@PropertySources({
    @PropertySource("classpath:admininfo.properties"),
    @PropertySource("classpath:databaseconfig.properties")
})
public class BeansConfiguration {

}
