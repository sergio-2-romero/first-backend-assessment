package com.atos.firstbackend.service;

import java.util.ArrayList;
import java.util.List;

import com.atos.firstbackend.model.User;
import com.atos.firstbackend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
	private UserRepository userRepository;

    @Override
    public ResponseEntity<List<User>> getAllUsers() {
        try {
			List<User> users = new ArrayList<User>();
			userRepository.findAll().forEach(users::add);
			if (users.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(users, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }

}
