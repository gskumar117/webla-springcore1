package com.webla.university.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webla.university.model.Student;
import com.webla.university.service.StudentService;


@Controller
@RequestMapping("/university")
public class UniversityController {

	@Autowired
	private StudentService studentService;
	
	
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
	
	// sunil  -> sunil
	// Sunil  -> sunil
	@RequestMapping("/student/search")
	public ModelAndView studentSearch(HttpServletRequest req, ModelAndView model) throws IOException {
		String rollNumber = req.getParameter("rollNumber");
		
		List<Student> students =  studentService.loadStudentInfo();
		
		Optional<Student> studentOptional = students.stream().filter(e -> e.getId().equalsIgnoreCase(rollNumber)).findFirst();
		
		Student student = null;
		if(studentOptional.isPresent()) {
			student = studentOptional.get();
			
			model.addObject("student", student);
			/*
			 * model.addAttribute("userName", student.getName());
			 * model.addAttribute("college", student.getCollege());
			 * model.addAttribute("location", student.getLocation());
			 */
		}else {
			//model.addAttribute("userName", "Not Found");
		}
		model.setViewName("welcome-student-view");
		return  model;
	}
	
}
