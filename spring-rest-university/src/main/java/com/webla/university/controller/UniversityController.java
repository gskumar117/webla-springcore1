package com.webla.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webla.university.dto.Student;
import com.webla.university.service.UniversityService;

@RestController
@RequestMapping("/university")
public class UniversityController {

	@Autowired
	private UniversityService universityService;
	
	//GET, POST, PUT , DELETE
	
	@RequestMapping(value =  "/all/students", method = RequestMethod.GET)
	//@GetMapping("/all/students")
	//@ResponseBody
	public List<Student> getAllStudents(){
		
		List<Student> allStudents 
			= universityService.loadAllStudents();
		
		return allStudents;
	}
	
}




