package com.unitedremote.bootcamp.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.Skhera;
import com.unitedremote.bootcamp.services.DispatcherService;
import com.unitedremote.bootcamp.services.SkheraService;

@RestController
@RequestMapping("/skheras")
public class SkheraController {

	@Autowired
	SkheraService skheraService;
	@Autowired
	DispatcherService dispatcherService;
	
	@GetMapping("/")
	public List<Skhera> findAll() {
		return skheraService.findAll();
	}
	
	@GetMapping("/{skheraId}")
	public Skhera findOne(@PathVariable("skheraId") Long skheraId) {
		return skheraService.findOne(skheraId);
	}
	
	@PostMapping("/")
	public Skhera createSkhera(@RequestBody Skhera skhera){
		return skheraService.saveSkhera(skhera);
	}
	
	@DeleteMapping("/{skheraId}")
	public void deleteSkhera(@PathVariable(value = "skheraId") Long skheraId) {
		Skhera skhera = skheraService.findOne(skheraId);
		skheraService.deleteSkhera(skhera);
	}
	
	@PatchMapping("/{skheraId}/pickup")
	public Skhera pickupSkhera(
			@PathVariable(value = "skheraId") Long skheraId) {
		Skhera skhera = skheraService.findOne(skheraId);
		return skheraService.pickupSkhera(skhera, new Date());
	}
	
	@PatchMapping("/{skheraId}/deliver")
	public Skhera deliverSkhera(
			@PathVariable(value = "skheraId") Long skheraId) {
		Skhera skhera = skheraService.findOne(skheraId);
		return skheraService.deliverSkhera(skhera, new Date());
	}
	
	@GetMapping("/{skheraId}/dispatch")
	public Skhera dispatchSkhera(
			@PathVariable(value = "skheraId") Long skheraId) {
		Skhera skhera = skheraService.findOne(skheraId);
		Rider rider = dispatcherService.dispatchRiderToSkhera(skhera);
		skheraService.setRider(skhera, rider);
		return skheraService.saveSkhera(skhera);
	}
}
