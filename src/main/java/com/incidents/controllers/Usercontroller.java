package com.incidents.controllers;





import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.incidents.services.UserService;


import com.incidents.entity.UserEntity;
import com.incidents.orchestration.UserOrchestration;

@RestController 
@RequestMapping("/users") //localhost:8080/users URL



public class Usercontroller {
	@Autowired 
	UserService userService; 
	
	@Autowired
	UserOrchestration userOrchestration;
	
	
	@PostMapping
	public UserEntity creatUser(@RequestBody  UserEntity userEntity) {
		userEntity=userOrchestration.orchestration(userEntity);
		
	return userEntity;
	}
	
}
