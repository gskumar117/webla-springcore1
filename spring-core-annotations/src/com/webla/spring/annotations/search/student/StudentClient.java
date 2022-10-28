package com.webla.spring.annotations.search.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentClient {

    @Value("${admin.phonenumber}")
	private String phoneNumber;

    @Value("${admin.mail}")
	private String mail;

    
    @Value("${database.type}")
    private String databaseValue;
    
	@Autowired
	@Qualifier("apStudentsService")
	private StudentService studentService;

	public void displayEligibleColleges(int rollNumber) {
		
		
	    List<Student> studens = studentService.loadData();
	    
	    boolean isAvailable =  false;
	    for (Student student : studens) {
			if(student.getRollNumber() == rollNumber) {
				isAvailable = true;
				System.out.println("Your Rollnumber found "+rollNumber);
				System.out.println("Your Details are Name "+student.getName()+ " percentage  "+student.getPercentage());
				if(student.getPercentage() > 90) {
					System.out.println("You are eligible for A Grage Colleges");
				}else if (student.getPercentage() > 80) {
					System.out.println("You are eligible for B Grade Colleges");
				}else if (student.getPercentage() > 50) {
					System.out.println("You are eligible for C Grade Colleges");
				}else {
					System.out.println("You are not eligible for selection");
				}
			}
		}
	    
	    if(!isAvailable) {
	    	System.out.println("your data is not available with us pleas contact admin team "+phoneNumber+" Mail "+mail);
	    	System.out.println("databaseValue "+databaseValue);
	    }
	}
	
	
}
