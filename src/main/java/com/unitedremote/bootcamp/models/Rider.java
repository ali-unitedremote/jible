package com.unitedremote.bootcamp.models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="riders")  
@PrimaryKeyJoinColumn(name="rider_id")
public class Rider extends User{
	
	public Rider() {
	}
	
	public Rider(Long id, String name, String email) {
		super(id, name, email);
	}
	
	

    public boolean equals(Rider anotherRider) {
		if(anotherRider.getId() == this.getId()) {
			return true;
		}
		else return false;
	}
	
}
