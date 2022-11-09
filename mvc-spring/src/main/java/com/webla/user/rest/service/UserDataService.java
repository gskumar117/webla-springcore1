package com.webla.user.rest.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webla.user.rest.controller.dto.User;


@Service
public class UserDataService {

	public List<User> fetchUserDetails(){
		List<User> users = new ArrayList<>();
		
		//creating dummy data
		User user1 = new User();
		user1.setId("1001");
		user1.setName("Sandeep");
		user1.setEmployer("Org 1");
		user1.setSalary(new BigDecimal(50000));
		user1.setLocation("Hyderabad");
		
		
		User user2 = new User();
		user2.setId("1002");
		user2.setName("Vishwa");
		user2.setEmployer("Org 1");
		user2.setSalary(new BigDecimal(50000));
		user2.setLocation("Hyderabad");
		
		
		User user3 = new User();
		user3.setId("1003");
		user3.setName("Anil");
		user3.setEmployer("Org 1");
		user3.setSalary(new BigDecimal(50000));
		user3.setLocation("Hyderabad");
		
		
		User user4 = new User();
		user4.setId("1004");
		user4.setName("Maithra");
		user4.setEmployer("Org 1");
		user4.setSalary(new BigDecimal(50000));
		user4.setLocation("Hyderabad");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		return users;
	}
}
