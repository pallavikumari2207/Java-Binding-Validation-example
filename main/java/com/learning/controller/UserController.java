package com.learning.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.Response.Response;
import com.learning.model.User;
import com.learning.service.UserRegistration;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	UserRegistration service;
	
@PostMapping("/user")
public ResponseEntity<Response> registrationCont(@Valid @RequestBody User user,BindingResult result)
{  if(result.hasErrors())
	return new ResponseEntity<Response>(new Response(400, result.getAllErrors().get(0).getDefaultMessage()),HttpStatus.UNPROCESSABLE_ENTITY);
	System.out.println(result.getAllErrors());
	service.register(user);
	return  ResponseEntity.ok().body(new Response(200,"Registered successfully"));
	
}
}
