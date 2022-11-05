package com.webla.university.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webla.university.model.Student;
import com.webla.university.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/save")
	public String saveStudent(@ModelAttribute("student") Student student, Model model) throws IOException {
		System.out.println(student);
		studentService.saveStudent(student);
		model.addAttribute("name", student.getName());
		
		//model.
		
		return "student-success";
	}
	
	
	@RequestMapping("/register" )
	public String registerStudent() {
		System.out.println("registerStudent() ");
		return "register-student";
	}
	
}
