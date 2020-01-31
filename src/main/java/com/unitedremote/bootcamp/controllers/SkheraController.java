package com.unitedremote.bootcamp.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unitedremote.bootcamp.dao.SkheraDao;
import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.Skhera;
import com.unitedremote.bootcamp.repositories.SkheraRepository;
import com.unitedremote.bootcamp.services.SkheraService;

@RestController
public class SkheraController {

	@Autowired
	SkheraDao skheraDao;	
	@Autowired
	SkheraService skheraService;
	@Autowired
	SkheraRepository skheraRepository;
	
	@GetMapping("/skheras")
	public List<Skhera> findAll() {
		return skheraDao.findAll();
	}
	
	@GetMapping("/skheras/{id}")
	public Optional<Skhera> findOne(@PathVariable("id") Long id) {
		return skheraDao.findOne(id);
	}
	
	@PostMapping("/skheras")
	public Skhera createSkhera(@RequestBody Skhera skhera){
		return skheraDao.save(skhera);
	}
	
	@PatchMapping("/skheras/{skheraId}")
	public Skhera setRider(
			@PathVariable(value = "skheraId") Long skheraId, 
			@RequestBody Rider rider){
		Skhera skhera = skheraDao.getOne(skheraId);
		return skheraService.setRider(rider, skhera);
	}
	
	@DeleteMapping("/skheras/{skheraId}")
	public void deleteSkhera(
			@PathVariable(value = "skheraId") Long skheraId) {
		Skhera skhera = skheraDao.getOne(skheraId);
		skheraDao.delete(skhera);
	}
	
	@PatchMapping("/skheras/{skheraId}/pickup")
	public void pickupSkhera(
			@PathVariable(value = "skheraId") Long skheraId,
			@RequestBody Date pickedUpAt) {
		Skhera skhera = skheraDao.getOne(skheraId);
		skheraService.pickupSkhera(skhera, pickedUpAt);
	}
	
	@PatchMapping("/skheras/{skheraId}/deliver")
	public String deliverSkhera(
			@PathVariable(value = "skheraId") Long skheraId,
			@RequestBody Date deliveredAt) {
		Skhera skhera = skheraDao.getOne(skheraId);
		skheraService.deliverSkhera(skhera, deliveredAt);
		return "dfeffsgdfgdf dfdf g ";
	}
}
