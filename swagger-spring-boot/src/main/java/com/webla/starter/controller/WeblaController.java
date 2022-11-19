package com.webla.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeblaController {
	@RequestMapping("/webla")
	public String displayMessage() {
		return "Hello World from Webla Controller";
	}
}
