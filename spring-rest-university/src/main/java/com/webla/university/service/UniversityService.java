package com.webla.university.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webla.university.dto.Student;

@Service
public class UniversityService {

	public List<Student> loadAllStudents() {
		List<Student> students = new ArrayList<>();
		
		Student student = new Student(1001, "sunil", "AU");
		Student student1 = new Student(1002, "sunil2", "AU2");
		Student student2 = new Student(1003, "sunil3", "AU3");
		Student student3 = new Student(1004, "sunil4", "AU4");

		students.add(student);		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		return students;
	}
	
	
}
