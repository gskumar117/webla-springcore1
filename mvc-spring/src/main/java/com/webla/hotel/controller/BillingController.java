package com.webla.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ext")
public class BillingController {
	
	@RequestMapping("/billing")
	//@ResponseBody
	public String getBillingDetails() {
		System.out.println("getBillingDetails() arg method called");
		return "extbilling";
	}
}


///ext/billing