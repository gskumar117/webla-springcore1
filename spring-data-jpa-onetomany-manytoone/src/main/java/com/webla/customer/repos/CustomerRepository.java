package com.webla.customer.repos;

import org.springframework.data.repository.CrudRepository;

import com.webla.customer.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
