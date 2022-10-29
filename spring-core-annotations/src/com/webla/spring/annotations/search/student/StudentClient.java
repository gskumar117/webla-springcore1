package com.webla.spring.annotations.search.student;

import java.util.ArrayList;
import java.util.Collections;
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

    @Value("${ap.admin.phonenumber}")
    private String apPhoneNumber;
    
    @Value("${tn.admin.phonenumber}")
    private String tnPhoneNumber;
    
    @Value("${ts.admin.phonenumber}")
    private String tsPhoneNumber;
    

	/*
	 * @Autowired
	 * 
	 * @Qualifier("apStudentsService") private StudentService studentService;
	 */

	@Autowired
	@Qualifier("tnStudentsService")
	private StudentService tnStudentService;

	@Autowired
	@Qualifier("tsStudentsService")
	private StudentService tsStudentService;

	
	public void displayEligibleColleges(int rollNumber) {
		
	    List<Student> allStudents = new ArrayList<>();
	    
	   // allStudents.addAll(studentService.loadData());
	    allStudents.addAll(tnStudentService.loadData());
	    allStudents.addAll(tsStudentService.loadData());

	    
	    boolean isAvailable =  false;
	    for (Student student : allStudents) {
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
	    	//System.out.println("For AP College related Queries Contact ph. "+apPhoneNumber);
	    	System.out.println("For TN College related Queries Contact ph. "+tnPhoneNumber);
	    	System.out.println("For TS College related Queries Contact ph. "+tsPhoneNumber);

	    	
	    }
	}
	
	
}
