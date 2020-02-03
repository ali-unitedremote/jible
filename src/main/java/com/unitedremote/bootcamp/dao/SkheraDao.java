package com.unitedremote.bootcamp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.models.Skhera;
import com.unitedremote.bootcamp.repositories.SkheraRepository;

@Service
public class SkheraDao {

	@Autowired
	SkheraRepository skheraRepository;

	public Skhera save(Skhera skhera) {
		return skheraRepository.save(skhera);
	}
	
	public List<Skhera> findAll() {
		return skheraRepository.findAll();
	}
	
	public Optional<Skhera> findOne(Long id) {
		return skheraRepository.findById(id);
	}
	
	public Skhera getOne(Long id) {
		Skhera skhera = skheraRepository.getOne(id);
		return skhera;
	}
	
	public void delete(Skhera skhera) {
		skheraRepository.delete(skhera);
	}
}
