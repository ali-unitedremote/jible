package com.unitedremote.bootcamp.services;

import java.util.List;

import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.RiderComparable;


public interface RiderService {

	Rider save(Rider rider);

	List<Rider> findAll();

	Rider findOne(Long id);

	void delete(Rider rider);
	
	
	
	/**
	 * returns a list of riderComparable object on the basis of all registered riders
	 * 
	 * @param skheraVolume
	 * @return RiderComparable list
	 * 
	 * @see RiderComparable
	 */
	List<RiderComparable> getRiders(int skheraVolume);

	/**
	 * returns a list of riderComparable object on the basis of the available riders
	 * 
	 * @param skheraVolume
	 * @return RiderComparable list
	 * 
	 * @see RiderComparable
	 */
	List<RiderComparable> getFreeRiders(int skheraVolume);
	
	/**
	 * return a dummy list of riderComparable object
	 * 
	 * @param skheraVolume
	 * @return RiderComparable list
	 * 
	 * @see RiderComparable
	 */
	List<RiderComparable> mockRiders(int skheraVolume);

}
