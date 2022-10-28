package com.webla.spring.annotations.search.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("apStudentsService")
public class ApStudentsService implements StudentService{

	@Override
	public List<Student> loadData() {
		List<Student> studens = new ArrayList<>();
		
		Student student1 = new Student(1001, "Sunil", 60);
		Student student2 = new Student(1002, "Vishwa", 70);
		Student student3 = new Student(1003, "Anil", 82);
		Student student4 = new Student(1004, "Mithra", 95);
		
		studens.add(student1);
		studens.add(student2);
		studens.add(student3);
		studens.add(student4);
		
		return  studens;
		
	}

}

