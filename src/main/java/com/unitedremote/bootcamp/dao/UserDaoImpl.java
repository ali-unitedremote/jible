package com.unitedremote.bootcamp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.models.User;
import com.unitedremote.bootcamp.repositories.UserRepository;

@Service
public class UserDaoImpl  implements UsuerDao{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@Override
	public User findOne(Long id) {
		return userRepository.getOne(id);
	}
	
	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}
}
