package com.unitedremote.bootcamp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitedremote.bootcamp.dao.UserDao;
import com.unitedremote.bootcamp.models.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserDao userDao;
	
	@PostMapping("")
	public User CreateUser(@RequestBody User user) {
		return userDao.save(user);
	}
	
	@GetMapping("/")
	public List<User> index() {
		return userDao.findAll();
	}
}
