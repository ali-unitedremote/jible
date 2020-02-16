package com.unitedremote.bootcamp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.models.Skhera;
import com.unitedremote.bootcamp.repositories.SkheraRepository;

@Service
public class SkheraDaoImpl implements SkheraDao{

	@Autowired
	SkheraRepository skheraRepository;

	@Override
	public Skhera save(Skhera skhera) {
		return skheraRepository.save(skhera);
	}
	
	@Override
	public List<Skhera> findAll() {
		return skheraRepository.findAll();
	}
	
	@Override
	public Optional<Skhera> findOne(Long id) {
		return skheraRepository.findById(id);
	}
	
	@Override
	public Skhera getOne(Long id) {
		Skhera skhera = skheraRepository.getOne(id);
		return skhera;
	}
	
	@Override
	public void delete(Skhera skhera) {
		skheraRepository.delete(skhera);
	}
}
