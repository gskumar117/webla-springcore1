package com.webla.starter.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.webla.starter.api.UserApi;
import com.webla.starter.gen.model.User;

@RestController
public class UserController implements UserApi{

	@Override
	public ResponseEntity<User> getUserById(Long id) {
		System.out.println("user ID {} " + id);
		
		User user = new User();
		user.setId(1001L);
		user.setName("Sunil Kumar G");
		user.setLocation("Hyderabad - Kukatpalli");
		if(id == 1001) {
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}else {
			return new ResponseEntity<User>(new User(), HttpStatus.NOT_FOUND);

		}
		
	}

}
