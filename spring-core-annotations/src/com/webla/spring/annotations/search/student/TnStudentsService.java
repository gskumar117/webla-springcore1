package com.webla.spring.annotations.search.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("tnStudentsService")
public class TnStudentsService implements StudentService{

	@Override
	public List<Student> loadData() {
		
		//Connecting to TN XML Servr and reads the data
		Set<Student> studens = new HashSet();
		
		Student student1 = new Student(9999, "TN Sunil", 90);
		Student student2 = new Student(9998, "TN Vishwa", 85);
		Student student3 = new Student(9997, "TN Anil", 70);
		Student student4 = new Student(9996, "TN Mithra", 80);
		
		studens.add(student1);
		studens.add(student2);
		studens.add(student3);
		studens.add(student4);
		
		List<Student> studentsList = studens.stream().collect(Collectors.toList());
		
		return studentsList;
		
	}

}

