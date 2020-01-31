package com.unitedremote.bootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unitedremote.bootcamp.models.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {

}
