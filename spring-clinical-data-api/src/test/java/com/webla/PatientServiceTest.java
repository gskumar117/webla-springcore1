package com.webla;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.webla.clinical.dto.PatientDto;
import com.webla.clinical.entity.Patient;
import com.webla.clinical.repo.PatientRepository;
import com.webla.clinical.service.PatientService;

@SpringBootTest
public class PatientServiceTest {

	@Autowired
	private PatientService patientService;
	
	@Test
	public void testGetAllPatients() {
		List<PatientDto> patients = 
				patientService.getAllPatients();
		assertNotNull(patients);
		patients.stream().forEach(System.out::println);
	}
	
}
