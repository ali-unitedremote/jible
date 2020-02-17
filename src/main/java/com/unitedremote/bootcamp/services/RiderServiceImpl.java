package com.unitedremote.bootcamp.services;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.dao.RiderDaoImpl;
import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.RiderComparable;

import mock.RiderComparableMock;

@Service
public class RiderServiceImpl implements RiderService{
	
	@Autowired
	RiderDaoImpl riderDao;
	
	private List<RiderComparable> riders;
	private static Logger logger = LogManager.getLogger();
	
	@Override
	public Rider save(Rider rider) {
		return riderDao.save(rider);
	}
	
	@Override
	public List<Rider> findAll() {
		logger.debug("finding all riders ");
		return riderDao.findAll();
	}
	
	@Override
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
	
	@Override
	public void delete(Rider rider) {
		logger.info("deleting rider : " + rider.getName());
		riderDao.delete(rider);
	}
	
	@Override
	public List<RiderComparable> mockRiders(int skheraVolume){
		riders = new RiderComparableMock().createRiders();
		return riders.stream()
				.filter(rider 
						-> (rider.isAbleToBeShared() && rider.getAvailableVolume() >=  skheraVolume))
				.collect(Collectors.toList());
	}
	
	@Override
	public List<RiderComparable> getRiders(int skheraVolume){
		logger.debug("getting all available riders");
		return this.mockRiders(skheraVolume);
	}
	
	@Override
	public List<RiderComparable> getFreeRiders(int skheraVolume){
		logger.debug("getting all free available riders");
		return this.mockRiders(skheraVolume)
				.stream().filter(rider -> rider.getOngoingSkheras() == 0)
				.collect(Collectors.toList());
	}
	
}
