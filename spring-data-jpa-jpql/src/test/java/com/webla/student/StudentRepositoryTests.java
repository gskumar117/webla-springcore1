package com.webla.student;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.webla.student.entity.StudentInfo;
import com.webla.student.repos.StudentRepository;

@SpringBootTest
public class StudentRepositoryTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testAddData() {
		StudentInfo stInfo = new StudentInfo();
		stInfo.setFirstName("Sunil");
		stInfo.setLastName("Ganisetti");
		stInfo.setScore(90);
		
		StudentInfo stInfo1 = new StudentInfo();
		stInfo1.setFirstName("Sunil1");
		stInfo1.setLastName("Ganisetti1");
		stInfo1.setScore(80);
		
		StudentInfo stInfo2 = new StudentInfo();
		stInfo2.setFirstName("Sunil2");
		stInfo2.setLastName("Ganisetti3");
		stInfo2.setScore(70);
		
		StudentInfo stInfo3 = new StudentInfo();
		stInfo3.setFirstName("Sunil3");
		stInfo3.setLastName("Ganisetti3");
		stInfo3.setScore(60);
		
		StudentInfo stInfo4 = new StudentInfo();
		stInfo4.setFirstName("Sunil4");
		stInfo4.setLastName("Ganisetti4");
		stInfo4.setScore(65);
		
		List<StudentInfo> students = new ArrayList<>();
		students.add(stInfo4);
		students.add(stInfo3);
		students.add(stInfo2);
		students.add(stInfo1);
		students.add(stInfo);
		
		studentRepository.saveAll(students);
		
	}
	
	@Test
	public void testFindAllStudents() {
		
		List<StudentInfo> students = 
				studentRepository.findAllStudents();
		System.out.println(students);
	}
	
	
	@Test
	public void testFindFirstnameAndLastName() {
		List<Object[]> students = 
				studentRepository.findFirstnameAndLastName();
		
		for (Object[] objects : students) {
			System.out.println("======================");
			System.out.println("First Name "+objects[0]);
			System.out.println("Last Name "+objects[1]);
		}
		
	}
	
	
	@Test
	public void testFindStudentByName() {
		String name = "Sunil10";
		List<StudentInfo> students = 
				studentRepository.findStudentByName(name);
		System.out.println(students);
	}
	
	@Test
	public void testFindStudentByScore() {
		List<StudentInfo> students = 
				studentRepository.findStudentByScore(50, 80);
		System.out.println(students);
	}
	
	
	@Transactional
	@Test
	@Rollback(false)
	public void testdeleteStudentByScore() {
		studentRepository.deleteStudentByScore(50, 70);
	}
	
	@Test
	public void testFindAllStudentsNq() {
		
		List<StudentInfo> students = 
				studentRepository.findAllStudentsNativeQuery();
		System.out.println(students);
	}
	
	@Test
	public void testFindStudentByScoreNativeQuery() {
		
		List<StudentInfo> students = 
				studentRepository.findStudentByScoreNativeQuery(70, 90);
		System.out.println(students);
	}
	
	

	@Test
	@Transactional
	@Rollback(false)
	public void testUpdateStudentByScore() {
		studentRepository.updateStudentByScore("Updated Name", 70, 90);
	}
	
}
