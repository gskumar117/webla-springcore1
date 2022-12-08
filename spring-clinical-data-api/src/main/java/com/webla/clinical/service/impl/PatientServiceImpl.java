package com.webla.clinical.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webla.clinical.controller.PatientController;
import com.webla.clinical.dto.PatientDto;
import com.webla.clinical.entity.Patient;
import com.webla.clinical.exception.PatientAlreadyAvailableException;
import com.webla.clinical.exception.PatientNotFoundException;
import com.webla.clinical.repo.PatientRepository;
import com.webla.clinical.service.PatientService;


@Service
public class PatientServiceImpl implements PatientService{
	private static final Logger LOG = LoggerFactory.getLogger(PatientServiceImpl.class);

	@Autowired
	private PatientRepository patientRepository;
	
	@Override
	public List<PatientDto> getAllPatients() {
		
		List<Patient> patients = (List<Patient>) patientRepository.findAll();
		List<PatientDto> patientDtos = patients.stream()
				.map(e -> copyProperties(e)).collect(Collectors.toList());
		return patientDtos;
	}

	public PatientDto copyProperties(Patient patient) {
		PatientDto patientDto = new PatientDto();
		BeanUtils.copyProperties(patient, patientDto);
		return patientDto;
	}

	@Override
	public int savePatient(PatientDto patientDto) {
		Patient patient = new Patient();
		
		BeanUtils.copyProperties(patientDto, patient);
		
		System.out.println("patient "+patient);
		if(true) {
			throw new PatientAlreadyAvailableException("Patient Already Exist");
		}
		Patient response = patientRepository.save(patient);
		return response.getId();
	}

	@Override
	public PatientDto getPatient(int id) {
		
		PatientDto patientDto = new PatientDto();
		Optional<Patient> patient = patientRepository.findById(id);
		if(patient.isPresent()) {
			BeanUtils.copyProperties(patient.get(), patientDto);
		}else {
			LOG.warn("Patient Not Found - Exception May arise {} ", id);
			throw new PatientNotFoundException("Patient Not available - ID "+id);
		}
		
		return patientDto;
	}


}
