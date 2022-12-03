package com.webla;

import java.time.Year;
import java.util.Calendar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.webla.entity.License;
import com.webla.entity.Person;
import com.webla.repos.LicenseRepository;

@SpringBootTest
class SpringDataJpaOnetooneApplicationTests {

	@Autowired
	private LicenseRepository licenseRepository;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void testLicenseCreate() {
		License license = new License();
		license.setType("4 Wheeler");
		Calendar calendar = Calendar.getInstance();
		license.setValidFrom(calendar.getTime());
		calendar.set(2042, 12, 03);
		license.setValidTo(calendar.getTime());
		//license.set
		
		Person person = new Person();
		
		person.setFirstName("Sandeep");
		person.setLastName("Sandeep Last");
		person.setAge(25);
	
		license.setPerson(person);
		
		licenseRepository.save(license);
		
	}
	
	
}
