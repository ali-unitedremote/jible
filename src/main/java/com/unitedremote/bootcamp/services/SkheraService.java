package com.unitedremote.bootcamp.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.dao.SkheraDao;
import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.Skhera;

@Service
public class SkheraService {
	
	@Autowired
	SkheraDao skheraDao;
	
	public List<Skhera> findAll() {
		return skheraDao.findAll();
	}
	
	public Skhera findOne(Long id) {
		return skheraDao.findOne(id).get();
	}
	
	public Skhera saveSkhera(Skhera skhera){
		return skheraDao.save(skhera);
	}
	
	public void deleteSkhera(Skhera skhera) {
		skheraDao.delete(skhera);
	}
	
	public void setRider(Skhera skhera, Rider rider){
		 skhera.setRider(rider);
	}
	
	public Skhera pickupSkhera(Skhera skhera, Date date) {
		skhera.setPickedUpAt(date);
		return skheraDao.save(skhera);	
	}
	
	public Skhera deliverSkhera(Skhera skhera, Date date) {
		skhera.setDeliveredAt(date);
		return skheraDao.save(skhera);	
	}
}
