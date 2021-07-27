package com.calcme.lucas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calcme.lucas.entities.User;
import com.calcme.lucas.repositories.UserRepository;

@Service
public class CreateUserService {
	
	// Injeta o repository
	@Autowired
	private UserRepository repository;
	
	public User execute(User user) {
		User userSaved = repository.save(user);
		return userSaved;
	}
}
