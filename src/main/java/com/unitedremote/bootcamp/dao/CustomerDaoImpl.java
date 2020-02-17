package com.unitedremote.bootcamp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.models.Customer;
import com.unitedremote.bootcamp.repositories.CustomerRepository;

@Service
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
