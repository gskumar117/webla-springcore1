package com.webla.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webla.starter.dto.User;
import com.webla.starter.dto.UserV2;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
public class UserController {

	//URL Versioning
	/* @GetMapping("/user")
	public User getuser() {
		User user = new User();
		user.setName("Sunil Kumar Gamnisetti");
		return user;
	}
	
	@GetMapping("/v2/user")
	public UserV2 getuserV2() {
		UserV2 user = new UserV2();
		user.setFirstName("Sunil");
		user.setLastName("Ganisetti");
		user.setMiddleName("Kumar");
		return user;
	} */
	
	//Request Parameter Versioning
	/*@GetMapping(value = "/user", params = "version=1")
	public User getuser() {
		User user = new User();
		user.setName("Sunil Kumar Gamnisetti");
		return user;
	}
	
	@GetMapping(value = "/user", params = "version=2")
	public UserV2 getuserV2() {
		UserV2 user = new UserV2();
		user.setFirstName("Sunil");
		user.setLastName("Ganisetti");
		user.setMiddleName("Kumar");
		return user;
	}*/
	
	//Request Parameter Header
		@GetMapping(value = "/user", headers = "X-API-VERSION=1")
		public User getuser() {
			User user = new User();
			user.setName("Sunil Kumar Gamnisetti");
			return user;
		}
		
		@GetMapping(value = "/user", headers = "X-API-VERSION=2")
		public UserV2 getuserV2() {
			UserV2 user = new UserV2();
			user.setFirstName("Sunil");
			user.setLastName("Ganisetti");
			user.setMiddleName("Kumar");
			return user;
		}
	
	
}
