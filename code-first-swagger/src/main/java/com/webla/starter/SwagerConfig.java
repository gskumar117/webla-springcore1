package com.webla.starter;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Students API", 
description = "You can find User related Operations Here", version = "1.0"
,contact = @Contact(email = "studentinfo@email.com", name = "Student Contact Support Team")))
public class SwagerConfig {

}
