package com.atos.firstbackend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	@Override
	public ResponseEntity<User> createUser(User user) {
		try {
			User _user = userRepository.save(new User(
				user.getUserName(), user.getPassword(), user.getIdProfile(), user.getIdEmployee(),
				user.getStatus(), user.getCreatedDate(), user.getUpdatedDate(), user.getLogin()
			));
			return new ResponseEntity<>(_user, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<User> updateUser(int userId, User user) {
		Optional<User> userData = userRepository.findById(userId);
		if (userData.isPresent()) {
			User _user = userData.get();
			_user.setUserName(user.getUserName());
			_user.setPassword(user.getPassword());
			_user.setIdProfile(user.getIdProfile());
			_user.setIdEmployee(user.getIdEmployee());
			_user.setStatus(user.getStatus());
			_user.setCreatedDate(user.getCreatedDate());
			_user.setUpdatedDate(user.getUpdatedDate());
			_user.setLogin(user.getLogin());
			return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
