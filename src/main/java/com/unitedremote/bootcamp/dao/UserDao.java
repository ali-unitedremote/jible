package com.unitedremote.bootcamp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.models.User;
import com.unitedremote.bootcamp.repositories.UserRepository;

@Service
public class UserDao {
	
	@Autowired
	UserRepository userRepository;
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findOne(Long id) {
		return userRepository.getOne(id);
	}
	
	public void delete(User user) {
		userRepository.delete(user);
	}
}
