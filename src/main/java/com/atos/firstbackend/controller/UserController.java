package com.atos.firstbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.atos.firstbackend.model.User;
import com.atos.firstbackend.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUsers() {
		return userService.getAllUsers();
	}
    
}
