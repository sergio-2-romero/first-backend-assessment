package com.atos.firstbackend.service;

import java.util.List;

import com.atos.firstbackend.model.User;

import org.springframework.http.ResponseEntity;

public interface UserService {

	ResponseEntity<List<User>> getAllUsers();

	ResponseEntity<User> createUser(User user);

}