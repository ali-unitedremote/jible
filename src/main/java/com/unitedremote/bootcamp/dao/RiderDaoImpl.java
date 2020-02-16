package com.unitedremote.bootcamp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.repositories.RiderRepository;

@Service
public class RiderDaoImpl implements RiderDao{
	
	@Autowired
	RiderRepository riderRepository;
	
	@Override
	public Rider save(Rider rider) {
		return riderRepository.save(rider);
	}
	
	@Override
	public List<Rider> findAll() {
		return riderRepository.findAll();
	}
	
	@Override
	public Optional<Rider> findOne(Long id) {
		return riderRepository.findById(id);
	}
	
	@Override
	public Rider getOne(Long id) {
		Rider rider = riderRepository.getOne(id);
		return rider;
	}
	@Override
	public void delete(Rider rider) {
		riderRepository.delete(rider);
	}
}
