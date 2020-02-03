package com.unitedremote.bootcamp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitedremote.bootcamp.dao.UserDao;
import com.unitedremote.bootcamp.models.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserDao userDao;
	
	@GetMapping("/")
	public List<User> findAll() {
		return userDao.findAll();
	}
	
	@GetMapping("/{userId}")
	public User findOne(@PathVariable(value = "userId") Long userId) {
		return userDao.findOne(userId);
	}
}
