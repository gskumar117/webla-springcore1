package com.webla.student.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webla.student.entites.Employee;

@Repository
public interface EmployeeRepository 
    extends CrudRepository<Employee, Integer>{

}
