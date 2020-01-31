package com.unitedremote.bootcamp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unitedremote.bootcamp.dao.RiderDao;
import com.unitedremote.bootcamp.models.Rider;

@RestController
public class RiderController {
	
	@Autowired
	RiderDao riderDao;
	
	@PostMapping("/riders")
	public Rider CreateRider(@RequestBody Rider rider) {
		return riderDao.save(rider);
	}

}
