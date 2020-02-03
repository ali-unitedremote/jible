package com.unitedremote.bootcamp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.services.RiderService;

@RestController
@RequestMapping("/riders")
public class RiderController {
	
	@Autowired
	RiderService riderService;
	
	@GetMapping("/riders")
	public List<Rider> findAll() {
		return riderService.findAll();
	}
	
	@GetMapping("/{riderId}")
	public Rider findOne(@PathVariable("riderId") Long riderId) {
		return riderService.findOne(riderId);
	}
	
	@PostMapping("/")
	public Rider createRider(@RequestBody Rider rider){
		return riderService.save(rider);
	}
	
	@DeleteMapping("/{riderId}")
	public void deleteRider(@PathVariable(value = "riderId") Long riderId) {
		Rider rider = riderService.findOne(riderId);
		riderService.delete(rider);
	}

}
