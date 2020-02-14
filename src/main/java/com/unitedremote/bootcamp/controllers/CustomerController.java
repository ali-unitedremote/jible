package com.unitedremote.bootcamp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unitedremote.bootcamp.dao.CustomerDao;
import com.unitedremote.bootcamp.models.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDao customerDao;
	
	@PostMapping("/customers")
	public Customer CreateCustomer(@RequestBody Customer customer) {
		return customerDao.save(customer);
	}
	
	@GetMapping("/customers")
	public List<Customer> findAll() {
		return customerDao.findAll();			
	}

}
