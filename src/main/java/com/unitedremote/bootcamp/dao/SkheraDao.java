package com.unitedremote.bootcamp.dao;

import java.util.List;
import java.util.Optional;

import com.unitedremote.bootcamp.models.Skhera;

public interface SkheraDao {

	Skhera save(Skhera skhera);

	Optional<Skhera> findOne(Long id);

	List<Skhera> findAll();

	Skhera getOne(Long id);

	void delete(Skhera skhera);

}
