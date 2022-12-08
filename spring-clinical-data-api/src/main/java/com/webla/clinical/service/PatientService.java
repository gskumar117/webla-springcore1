package com.webla.clinical.service;

import java.util.List;


import com.webla.clinical.dto.PatientDto;

public interface  PatientService{
	public List<PatientDto> getAllPatients();
	public int savePatient(PatientDto patientDto);
	public PatientDto getPatient(int id);

}
