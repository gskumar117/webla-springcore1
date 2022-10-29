package com.webla.spring.annotations.search.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("apStudentsService")
@Scope(value = "singleton")
public class ApStudentsService implements StudentService{

    @Value("${ap.admin.phonenumber}")
    private String number;
    
	public ApStudentsService() {
		System.out.println("Test Load");
		
	}
	@Override
	public List<Student> loadData() {
		System.out.println("Number "+number);
		
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

