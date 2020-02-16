package com.unitedremote.bootcamp.dao;

import java.util.List;

import com.unitedremote.bootcamp.models.User;

public interface UsuerDao {

	List<User> findAll();

	User findOne(Long id);

	void delete(User user);

}
