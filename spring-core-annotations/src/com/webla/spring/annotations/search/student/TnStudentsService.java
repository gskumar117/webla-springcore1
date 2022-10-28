package com.webla.spring.annotations.search.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("tnStudentsService")
public class TnStudentsService implements StudentService{

	@Override
	public List<Student> loadData() {
		
		//Connecting to TN XML Servr and reads the data
		List<Student> studens = new ArrayList<>();
		
		Student student1 = new Student(9999, "TN Sunil", 90);
		Student student2 = new Student(9998, "TN Vishwa", 85);
		Student student3 = new Student(9997, "TN Anil", 70);
		Student student4 = new Student(9996, "TN Mithra", 80);
		
		studens.add(student1);
		studens.add(student2);
		studens.add(student3);
		studens.add(student4);
		
		return  studens;
		
	}

}

