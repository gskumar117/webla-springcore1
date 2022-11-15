package com.webla.user.data.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.webla.user.data.dto.User;

@RestController
@RequestMapping("/user")
public class UserDataController {

	@Autowired
    private	RestTemplate restTemplate;
	
	
	String ENDPOINT = "https://jsonplaceholder.typicode.com/comments";
	/*
	 * @GetMapping("/data") public List<User> getUserComments() {
	 * 
	 * List<User> users = restTemplate.getForObject(ENDPOINT, List.class);
	 * 
	 * return users; }
	 */
	
	
	@GetMapping
	public List<User> getUserCommentsById(
			@RequestHeader(value = "id", required = false) String userId
			) {
		
		List<User> users = null;
		List<User> usersById = null;
		ParameterizedTypeReference<List<User>> typeRef = new ParameterizedTypeReference<List<User>>() {};
		
		ResponseEntity<List<User>> usersEntity = 
				restTemplate.exchange(ENDPOINT, HttpMethod.GET,null, typeRef);
		
		if(usersEntity.getStatusCode() == HttpStatus.OK) {
			users = usersEntity.getBody();
		}
		
		if(null == userId) {
			return users;
		}
		
		
		User user  = null;
		usersById = new ArrayList<>();
		if(null != users && !users.isEmpty()) {
			Optional<User> userOptional = users.stream()
					.filter( e -> (e.getId() ==  Integer.valueOf(userId))).findFirst();
			if(userOptional.isPresent()) {
				user =  userOptional.get();
				usersById.add(user);
			}
		}
		
		return usersById;
		
	}
	
	
	@PostMapping
	public String saveUser(@RequestBody User user) {
		System.out.println("saveUser()");

		System.out.println(user);
		
		return user.getName()+ "Successfully Saved";
	}
	
	
	@PutMapping
	public String updateUser(@RequestBody User user) {
		
		System.out.println("updateUser()");
		System.out.println(user);
		
		return user.getName()+ "Updated ";
	}
	
	
	@DeleteMapping
	public String deleteUser(@RequestBody User user) {
		System.out.println("deleteUser()");

		System.out.println(user);
		
		return user.getName()+ "Successfully deleted";
	}
	
}
