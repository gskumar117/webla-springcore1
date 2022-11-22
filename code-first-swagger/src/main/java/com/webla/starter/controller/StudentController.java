package com.webla.starter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webla.starter.dto.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/list")
	public List<Student> listStudents(){
		List<Student> studentsList = new ArrayList<>();
		System.out.println("Im Here..");
		return studentsList;
	}
	
	
	@PostMapping("/list")
	public String saveStudents(@RequestBody Student student){
		//List<Student> studentsList = new ArrayList<>();
		System.out.println("Im Here..inPOST Method");
		return "SUCCESS";
	}
	
	
	@DeleteMapping("/list")
	public String saveStudents
	   (@RequestParam(value = "id", required = false, defaultValue = "CURRENTLOCATION") String id){
		//List<Student> studentsList = new ArrayList<>();
		System.out.println("Im Here..in DELETE Method");
		return "SUCCESS";
	}
	
}
