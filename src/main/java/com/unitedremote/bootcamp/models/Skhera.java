package com.unitedremote.bootcamp.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "skheras")
public class Skhera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String description;
	@Column
	private String items;
	@Column
	private double estimated_price;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date scheduledDate;
	@Column
	private boolean asap;
	@Column
	private String addressFrom;
	@Column
	private String addressTo;
	@Column
	private String skheraState;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User rider;
	@ManyToOne(cascade = CascadeType.ALL)
	private User Customer;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public double getEstimated_price() {
		return estimated_price;
	}
	public void setEstimated_price(double estimated_price) {
		this.estimated_price = estimated_price;
	}
	public Date getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	public boolean isAsap() {
		return asap;
	}
	public void setAsap(boolean asap) {
		this.asap = asap;
	}
	public String getAddressFrom() {
		return addressFrom;
	}
	public void setAddressFrom(String addressFrom) {
		this.addressFrom = addressFrom;
	}
	public String getAddressTo() {
		return addressTo;
	}
	public void setAddressTo(String addressTo) {
		this.addressTo = addressTo;
	}
	public String getSkheraState() {
		return skheraState;
	}
	public void setSkheraState(String skheraState) {
		this.skheraState = skheraState;
	}
	public User getRider() {
		return rider;
	}
	public void setRider(User rider) {
		this.rider = rider;
	}
	public User getCustomer() {
		return Customer;
	}
	public void setCustomer(User customer) {
		Customer = customer;
	}
	
	
}
