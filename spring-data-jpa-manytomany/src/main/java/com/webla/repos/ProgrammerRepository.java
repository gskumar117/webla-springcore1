package com.webla.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webla.entity.Programmer;

@Repository
public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {

}
