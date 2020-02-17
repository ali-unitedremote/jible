package com.unitedremote.bootcamp.dao;

import java.util.List;

import com.unitedremote.bootcamp.models.Customer;

public interface CustomerDao {

	Customer save(Customer customer);

	List<Customer> findAll();

}
