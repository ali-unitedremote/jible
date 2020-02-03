package com.unitedremote.bootcamp.models;

public class RiderComparable {
	
	private Rider rider;
	private int timeTo;
	private int ongoingSkheras;
	
	public RiderComparable(Rider rider, int timeTo, int ongoingSkheras) {
		this.rider = rider;
		this.timeTo = timeTo;
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

	public int getFreedomDegree() {
		return ongoingSkheras;
	}

	public void setFreedomDegree(int ongoingSkheras) {
		this.ongoingSkheras = ongoingSkheras;
	}
	
}
