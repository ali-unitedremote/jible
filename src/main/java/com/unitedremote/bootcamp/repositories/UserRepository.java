package com.unitedremote.bootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unitedremote.bootcamp.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
