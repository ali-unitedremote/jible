package com.unitedremote.bootcamp.models;

public class RiderComparable {
	
	private Rider rider;
	private boolean ableToBeShared;
	private int timeTo;
	private int ongoingSkheras;
	private int availableVolume;
		
	public RiderComparable(Rider rider, boolean ableToBeShared, int timeTo, int ongoingSkheras, int availableVolume) {
		super();
		this.rider = rider;
		this.ableToBeShared = ableToBeShared;
		this.timeTo = timeTo;
		this.ongoingSkheras = ongoingSkheras;
		this.availableVolume = availableVolume;
	}

	public boolean isAbleToBeShared() {
		return ableToBeShared;
	}

	public void setAbleToBeShared(boolean ableToBeShared) {
		this.ableToBeShared = ableToBeShared;
	}

	public int getAvailableVolume() {
		return availableVolume;
	}

	public void setAvailableVolume(int availableVolume) {
		this.availableVolume = availableVolume;
	}

	public int getOngoingSkheras() {
		return ongoingSkheras;
	}

	public void setOngoingSkheras(int ongoingSkheras) {
		this.ongoingSkheras = ongoingSkheras;
	}

	public Rider getRider() {
		return rider;
	}

	public void setRider(Rider rider) {
		this.rider = rider;
	}

	public int getTimeTo() {
		return timeTo;
	}

	public void setTimeTo(int timeTo) {
		this.timeTo = timeTo;
	}
	
}
