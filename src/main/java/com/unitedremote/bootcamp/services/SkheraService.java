package com.unitedremote.bootcamp.services;

import java.util.Date;
import java.util.List;

import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.Skhera;

public interface SkheraService {

	Skhera saveSkhera(Skhera skhera);
	
	Skhera findOne(Long id);
	
	List<Skhera> findAll();

	void deleteSkhera(Skhera skhera);

	/**
	 * Assigns a rider to a skhera
	 * 
	 * @param skhera
	 * @param rider
	 * @return skhera
	 */
	Skhera setRider(Skhera skhera, Rider rider);

	/**
	 * Add a date value identifying the skhera picking up by the rider assigned
	 * 
	 * @param skhera
	 * @param date
	 * @return skhera
	 */
	Skhera pickupSkhera(Skhera skhera, Date date);

	/**
	 * Add a date value identifying the skhera delivering by the rider assigned
	 * 
	 * @param skhera
	 * @param date
	 * @return skhera
	 */
	Skhera deliverSkhera(Skhera skhera, Date date);

}