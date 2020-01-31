package com.unitedremote.bootcamp.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.dao.SkheraDao;
import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.Skhera;

@Service
public class SkheraService {
	
	@Autowired
	SkheraDao skheraDao;
	
	public Skhera setRider(Rider rider, Skhera skhera) {
		skhera.setRider(rider);
		return skheraDao.save(skhera);	
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
