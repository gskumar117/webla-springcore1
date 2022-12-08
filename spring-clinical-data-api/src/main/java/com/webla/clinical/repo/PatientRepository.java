package com.webla.clinical.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webla.clinical.entity.Patient;


@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer>{

}
