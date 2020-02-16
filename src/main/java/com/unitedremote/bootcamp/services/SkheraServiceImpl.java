package com.unitedremote.bootcamp.services;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.dao.SkheraDaoImpl;
import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.Skhera;

@Service
public class SkheraServiceImpl implements SkheraService {
	
	@Autowired
	SkheraDaoImpl skheraDao;
	
	private static Logger logger = LogManager.getLogger();
	
	@Override
	public List<Skhera> findAll() {
		return skheraDao.findAll();
	}
	
	@Override
	public Skhera findOne(Long id) {
		logger.debug("finding Skhera with id: " + id);
		Skhera skhera= new Skhera();
		try {
			skhera = skheraDao.findOne(id).get();
		} catch (Exception e) {
			logger.warn("Error: " + e.getMessage());
		}
		return skhera;
	}
	
	@Override
	public Skhera saveSkhera(Skhera skhera){
		logger.debug("saving Skhera ...");
		return skheraDao.save(skhera);
	}
	
	@Override
	public void deleteSkhera(Skhera skhera) {
		logger.debug("deleting Skhera with id: " + skhera.getId());
		skheraDao.delete(skhera);
	}
	
	@Override
	public Skhera setRider(Skhera skhera, Rider rider){
		logger.debug("setting rider " + rider.getId() + "to skhera "  +skhera.getId());
		 skhera.setRider(rider);
		 return this.saveSkhera(skhera);
	}
	
	@Override
	public Skhera pickupSkhera(Skhera skhera, Date date) {
		logger.debug("picking up Skhera " + skhera.getId() + " at "+date.toString());
		skhera.setPickedUpAt(date);
		return skheraDao.save(skhera);	
	}
	
	@Override
	public Skhera deliverSkhera(Skhera skhera, Date date) {
		logger.debug("delivering Skhera " + skhera.getId() + " at "+date.toString());
		skhera.setDeliveredAt(date);
		return skheraDao.save(skhera);	
	}
}
