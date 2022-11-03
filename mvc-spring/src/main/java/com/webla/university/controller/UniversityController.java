package com.webla.university.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/university")
public class UniversityController {

	@RequestMapping("/welcome")
	public String welcomeMessage(Model model) {
		String contactNo = "+91 999999999";
		String name = "Sandeep";
		model.addAttribute("contactNumber", contactNo);
		model.addAttribute("userName", name);
		return "welcome-view";
	}
	
	

	@RequestMapping("/student/welcome")
	public String studentWelcomeMessage(Model model) {
		return "StudentSearch";
	}
	
	
	
	@RequestMapping("/student/search")
	public String studentSearch(HttpServletRequest req,  Model model) {
		
		
		String rollNumber = req.getParameter("rollNumber");
		String user = "";
		System.out.println("user Name : "+user);
		
		boolean isRollNumberFound = true;
		if(rollNumber.equals("1001")) {
			user = "Sandeep ";
		}else if(rollNumber.equals("1002")) {
			user = "Anil ";
		}else {
			user = "Not Found";
			isRollNumberFound = false;
		}
		
		model.addAttribute("userName", user);
		if(isRollNumberFound) {
			model.addAttribute("contactNumber", "+91 9999999999");
		}else {
			model.addAttribute("contactNumber", "+91 888888888");
		}
		return "welcome-student-view";
	}
	
}
