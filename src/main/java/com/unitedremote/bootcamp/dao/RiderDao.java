package com.unitedremote.bootcamp.dao;

import java.util.List;
import java.util.Optional;

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
	
	public List<Rider> findAll() {
		return riderRepository.findAll();
	}
	
	public Optional<Rider> findOne(Long id) {
		return riderRepository.findById(id);
	}
	
	public Rider getOne(Long id) {
		Rider rider = riderRepository.getOne(id);
		return rider;
	}
	
	public void delete(Rider rider) {
		riderRepository.delete(rider);
	}
}
