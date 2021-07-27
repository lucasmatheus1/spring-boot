package com.calcme.lucas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.calcme.lucas.entities.User;
import com.calcme.lucas.services.CreateUserService;

@RestController
@RequestMapping("/users")
public class CreateUserController {
	
	@Autowired
	private CreateUserService service;
	
	@PostMapping
	// resposta do objeto criado, do tipo created
	// valor 201 do http
	@ResponseStatus(HttpStatus.CREATED)
	public User handle(@RequestBody User user) {
		return this.service.execute(user);
	}
	

}
