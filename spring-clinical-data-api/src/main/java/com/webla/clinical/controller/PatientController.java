package com.webla.clinical.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webla.clinical.dto.PatientDto;
import com.webla.clinical.entity.Patient;
import com.webla.clinical.service.PatientService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/patient")
public class PatientController {
	private static final Logger LOG = LoggerFactory.getLogger(PatientController.class);

	@Value("${test.profile.check}")
	private String testProfileCheck;

	@Autowired
	private PatientService patientService;

	// GET - localhost:9090/patient
	@GetMapping
	public List<PatientDto> getAllPatients() {
		LOG.info("Property from Properties fiel " + testProfileCheck);
		List<PatientDto> patientsList = patientService.getAllPatients();
		patientsList.stream().forEach(
				// e -> LOG.debug("First Name "+e.getFirstName()+ "Last Name "+e.getFirstName())
				e -> LOG.debug("First Name {} Last Name {} ", e.getFirstName(), e.getLastName()));
		LOG.warn("Its warning");
		LOG.error("its Error");

		return patientService.getAllPatients();
	}

	// POST - localhost:9090/patient
	@PostMapping
	public int getAllPatients(@RequestBody PatientDto patientDto) {
		return patientService.savePatient(patientDto);
	}

	// GET - localhost:9090/patient/1
	@GetMapping("/{id}")
	public ResponseEntity<PatientDto> getPatient(@PathVariable("id") int id){
		LOG.info("patient id", id);
		return new ResponseEntity<>(patientService.getPatient(id), HttpStatus.OK);
	}

}
