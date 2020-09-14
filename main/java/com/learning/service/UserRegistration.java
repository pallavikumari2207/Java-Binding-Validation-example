package com.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.model.User;
import com.learning.repo.RegisterRepo;

@Service
public class UserRegistration {
	@Autowired
	RegisterRepo repo;
	public User register(User user) {
	return repo.save(user);	
		
	}

}
