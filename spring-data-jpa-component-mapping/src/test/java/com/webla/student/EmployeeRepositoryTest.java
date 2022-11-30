package com.webla.student;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.webla.student.entites.Adress;
import com.webla.student.entites.Employee;
import com.webla.student.repos.EmployeeRepository;

@SpringBootTest
public class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository emRepository;
	
	@Test
	public void testSaveEmployee() {
		Employee employee = new Employee();
		Adress adress = new Adress();
		employee.setName("Sunil2");
		
		adress.setCity("Hyderabad");
		adress.setState("Telangana");
		adress.setStreetAddress("Some Street");
		adress.setCountry("India");
		adress.setZipCode("0000888");
		employee.setAdress(adress);
		
		emRepository.save(employee);
		
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void testDeleteEmployee() {
		emRepository.deleteById(2);
	}
	
	
	
	
}
