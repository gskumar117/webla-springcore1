package com.webla;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.webla.clinical.entity.Patient;
import com.webla.clinical.repo.PatientRepository;

@SpringBootTest
public class PatientRepositoryTest {

	@Autowired
	private PatientRepository patientRepository;
	
	public void testFindAllPatients() {
		
		List<Patient> patients = 
				(List<Patient>) patientRepository.findAll();
		
		assertNotNull(patients);
		
		patients.stream().forEach( System.out::println);
		
	}
	
	
}
