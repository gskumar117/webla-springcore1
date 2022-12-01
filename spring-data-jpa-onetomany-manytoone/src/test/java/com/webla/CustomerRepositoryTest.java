package com.webla;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.webla.customer.entity.Customer;
import com.webla.customer.entity.PhoneNumber;
import com.webla.customer.repos.CustomerRepository;

@SpringBootTest
public class CustomerRepositoryTest {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void testSaveCustomer() {
		
		Customer customer = new Customer();
		customer.setName("Anil Kumar");
		
		PhoneNumber cellNumber = new PhoneNumber();
		cellNumber.setNumber("545555555");
		cellNumber.setType("Cell");
		cellNumber.setCustomer(customer);
		
		
		PhoneNumber landLineNumber = new PhoneNumber();
		landLineNumber.setNumber("546456445");
		landLineNumber.setType("LandLine");
		landLineNumber.setCustomer(customer);

		PhoneNumber faxNumber = new PhoneNumber();
		faxNumber.setNumber("+67235234");
		faxNumber.setType("Fax");
		faxNumber.setCustomer(customer);

		
		Set<PhoneNumber> phoneNumbersSet = new HashSet<>();
		phoneNumbersSet.add(cellNumber);
		phoneNumbersSet.add(landLineNumber);
		phoneNumbersSet.add(faxNumber);
		
		customer.setPhoneNumbers(phoneNumbersSet);
		
		customerRepository.save(customer);
		
	}
	
	@Test
	@Transactional
	public void testFindCustomer() {
		
		Customer customer = customerRepository.findById(5).get();
		System.out.println("Name : "+customer.getName());
		System.out.println("Phone Numbers : "+customer.getPhoneNumbers());

	}
	
	
	@Test
	@Transactional
	@Rollback(false)
	public void testDeleteCustomer() {
		customerRepository.deleteById(4);
	}
	
	
	
	
}
