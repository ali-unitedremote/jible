package com.unitedremote.bootcamp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date scheduledDate;
	@Column
	private boolean asap;
	@Column
	private boolean ableToShare;
	@Column
	private String addressFrom;
	@Column
	private String addressTo;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date pickedUpAt;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date deliveredAt;
	
	//Relationships
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "rider_id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Rider rider;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Customer customer;

	
	//getters & Setters
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
	public boolean isAbleToShare() {
		return ableToShare;
	}
	public void setAbleToShare(boolean ableToShare) {
		this.ableToShare = ableToShare;
	}

	public Date getPickedUpAt() {
		return pickedUpAt;
	}

	public void setPickedUpAt(Date pickedUpAt) {
		this.pickedUpAt = pickedUpAt;
	}

	public Date getDeliveredAt() {
		return deliveredAt;
	}

	public void setDeliveredAt(Date deliveredAt) {
		this.deliveredAt = deliveredAt;
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
	public void setRider(Rider rider) {
		this.rider = rider;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setAddressTo(String addressTo) {
		this.addressTo = addressTo;
	}
	public Rider getRider() {
		return rider;
	}
	public Customer getCustomer() {
		return customer;
	}
}
