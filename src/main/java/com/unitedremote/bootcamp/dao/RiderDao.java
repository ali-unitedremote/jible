package com.unitedremote.bootcamp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.repositories.RiderRepository;

@Service
public class RiderDao {
	
	@Autowired
	RiderRepository riderRepository;
	
	public Rider save(Rider rider) {
		return riderRepository.save(rider);
	}

}
