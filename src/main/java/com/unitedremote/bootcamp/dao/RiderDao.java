package com.unitedremote.bootcamp.dao;

import java.util.List;
import java.util.Optional;

import com.unitedremote.bootcamp.models.Rider;

public interface RiderDao {

	Rider save(Rider rider);

	Optional<Rider> findOne(Long id);

	Rider getOne(Long id);
	
	List<Rider> findAll();
	
	void delete(Rider rider);
	
}
