package com.unitedremote.bootcamp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.models.Customer;
import com.unitedremote.bootcamp.repositories.CustomerRepository;

@Service
public class CustomerDao {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

}
