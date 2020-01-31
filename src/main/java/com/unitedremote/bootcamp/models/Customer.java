package com.unitedremote.bootcamp.models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="customer")  
@PrimaryKeyJoinColumn(name="customer_id")
public class Customer extends User {
	
	

}
