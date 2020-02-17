package com.unitedremote.bootcamp.controllers;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
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
import com.unitedremote.bootcamp.services.DispatcherServiceImpl;
import com.unitedremote.bootcamp.services.SkheraService;
import com.unitedremote.bootcamp.services.utils.ErrorHandlingService;

@RestController
@RequestMapping("/skheras")
public class SkheraController {

	@Autowired
	SkheraService skheraService;
	@Autowired
	DispatcherServiceImpl dispatcherService;
	@Autowired
	ErrorHandlingService errorHandlingService;
	
	private static Logger logger = LogManager.getLogger();
	
	@GetMapping("")
	public List<Skhera> findAll() {
		logger.info("Retrieving all skheras ...");
		return skheraService.findAll();
	}
	
	@GetMapping("/{skheraId}")
	public Skhera findOne(@PathVariable("skheraId") Long skheraId) {
		logger.info("Retrieving skhera: " + skheraId);
		return skheraService.findOne(skheraId);
	}
	
	/**
	 * @param skhera
	 * @param bindingResult
	 * @return
	 */
	@PostMapping("")
	public String createSkhera(@RequestBody @Valid Skhera skhera, BindingResult bindingResult){
		logger.info("Creating skhera ...");
		
		if (bindingResult.hasErrors()) {
			String errorMessage = errorHandlingService.InputValidationErroHandler(bindingResult);
			logger.warn(errorMessage);
			return errorMessage;
		}
		skheraService.saveSkhera(skhera);
		return "Skhera Successfully Created";
	}
	
	@DeleteMapping("/{skheraId}")
	public String deleteSkhera(@PathVariable(value = "skheraId") Long skheraId) {
		logger.info("Deleting skhera: " + skheraId);
		Skhera skhera = skheraService.findOne(skheraId);
		if (skhera.getId() == null)
			return "No such skheraId";
		skheraService.deleteSkhera(skhera);
		return "Skhera " + skheraId + " deleted succefully";
	}
	
	@PatchMapping("/{skheraId}/pickup")
	public String pickupSkhera(@PathVariable(value = "skheraId") Long skheraId) {
		logger.info("Picking skhera up: " + skheraId);
		Skhera skhera = skheraService.findOne(skheraId);
		if (skhera.getId() == null)
			return "No such skheraId";
		skheraService.pickupSkhera(skhera, new Date());
		return "Skhera " + skheraId + " picked up succefully";
	}
	
	@PatchMapping("/{skheraId}/deliver")
	public String deliverSkhera(@PathVariable(value = "skheraId") Long skheraId) {
		logger.info("Delivering skhera : " + skheraId);
		Skhera skhera = skheraService.findOne(skheraId);
		if (skhera.getId() == null)
			return "No such skheraId";
		skheraService.deliverSkhera(skhera, new Date());
		return "Skhera " + skheraId + " delivered succefully";
	}
	
	@GetMapping("/{skheraId}/dispatch")
	public String dispatchSkhera(@PathVariable(value = "skheraId") Long skheraId) {
		Skhera skhera = skheraService.findOne(skheraId);
		if (skhera.getId() == null)
			return "No such skheraId";
		Rider rider = dispatcherService.dispatchRiderToSkhera(skhera);
		logger.info("Dispatching skhera of: " + skhera.getCustomer().getName() + " to rider :" + rider.getName());
		skheraService.setRider(skhera, rider);
		return "Skhera " + skheraId + " dispatched to " + rider.getName() + " succefully";
	}

}
