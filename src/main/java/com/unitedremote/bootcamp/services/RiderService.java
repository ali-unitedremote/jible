package com.unitedremote.bootcamp.services;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.dao.RiderDao;
import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.RiderComparable;

import mock.RiderComparableMock;

@Service
public class RiderService {
	
	@Autowired
	RiderDao riderDao;
	
	private static Logger logger = LogManager.getLogger();
	
	public Rider save(Rider rider) {
		return riderDao.save(rider);
	}
	
	public List<Rider> findAll() {
		logger.debug("finding all riders ");
		return riderDao.findAll();
	}
	
	public Rider findOne(Long id) {
		logger.debug("finding rider with id: " + id);
		Rider rider= new Rider();
		try {
			rider = riderDao.findOne(id).get();
		} catch (Exception e) {
			logger.warn("Error: " + e.getMessage());
		}
		return rider;
	}
	
	public void delete(Rider rider) {
		logger.info("deleting rider : " + rider.getName());
		riderDao.delete(rider);
	}
	
	private List<RiderComparable> riders;
	
	public List<RiderComparable> createRiders(int skheraVolume){
		riders = new RiderComparableMock().createRiders();
		return riders.stream()
				.filter(rider 
						-> (rider.isAbleToBeShared() && rider.getAvailableVolume() >=  skheraVolume))
				.collect(Collectors.toList());
	}
	
	public List<RiderComparable> getRiders(int skheraVolume){
		logger.debug("getting all available riders");
		return this.createRiders(skheraVolume);
	}
	
	public List<RiderComparable> getFreeRiders(int skheraVolume){
		logger.debug("getting all free available riders");
		return this.createRiders(skheraVolume)
				.stream().filter(rider -> rider.getOngoingSkheras() == 0)
				.collect(Collectors.toList());
	}
	
}
