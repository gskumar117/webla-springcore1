package com.webla.user.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webla.user.rest.controller.dto.User;
import com.webla.user.rest.service.UserDataService;


@RestController
@RequestMapping("/users")
public class UserTestController {

	@Autowired
	private UserDataService userDataService;
	
	//@RequestMapping(value =  "/details" , method = HttpMethod.GET)
	@GetMapping("/details")
	@ResponseBody
	public List<User> getUserDetails() {
		System.out.println("In Get Mapping Now");
		return userDataService.fetchUserDetails();
	}

	@PostMapping("/details")
	@ResponseBody
	public List<User> postUserDetails() {
		System.out.println("In POST Mapping Now");
		return userDataService.fetchUserDetails();
	}
	
}
