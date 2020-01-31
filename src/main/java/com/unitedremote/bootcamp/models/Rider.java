package com.unitedremote.bootcamp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="riders")  
@PrimaryKeyJoinColumn(name="riderId")
public class Rider extends User{

	@Column  
	private String position;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
