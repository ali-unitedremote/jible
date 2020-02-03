package com.unitedremote.bootcamp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.dao.RiderDao;
import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.RiderComparable;

@Service
public class RiderService {
	
	@Autowired
	RiderDao riderDao;
	
	public Rider save(Rider rider) {
		return riderDao.save(rider);
	}
	
	public List<Rider> findAll() {
		return riderDao.findAll();
	}
	
	public Rider findOne(Long id) {
		return riderDao.findOne(id).get();
	}
	
	public void delete(Rider rider) {
		riderDao.delete(rider);
	}
	
	private List<RiderComparable> riders = new ArrayList<RiderComparable>();
	
	public List<RiderComparable> getRiders(){
		RiderComparable rider1 = new RiderComparable(new Rider(1l, "Ali", "ali@gmail.com"), 233, 2);
		riders.add(rider1);
		RiderComparable rider2 = new RiderComparable(new Rider(2l, "Zakaria", "Zakaria@gmail.com"), 233, 3);
		riders.add(rider2);
		RiderComparable rider3 = new RiderComparable(new Rider(3l, "Hamza", "hamza@gmail.com"), 233, 1);
		riders.add(rider3);
		RiderComparable rider4 = new RiderComparable(new Rider(4l, "Houssam", "houssam@gmail.com"), 333, 0);
		riders.add(rider4);
		RiderComparable rider5 = new RiderComparable(new Rider(5l, "Najlae", "Najlae@gmail.com"), 733, 4);
		riders.add(rider5);
		RiderComparable rider6 = new RiderComparable(new Rider(6l, "Nabil", "nabil@gmail.com"), 233, 5);
		riders.add(rider6);
		RiderComparable rider7 = new RiderComparable(new Rider(7l, "Youssef", "houssam@gmail.com"), 333, 0);
		riders.add(rider7);
		RiderComparable rider8 = new RiderComparable(new Rider(8l, "Najoua", "Najoua@gmail.com"), 433, 4);
		riders.add(rider8);
		RiderComparable rider9 = new RiderComparable(new Rider(9l, "Youness", "youness@gmail.com"), 633, 1);
		riders.add(rider9);
		
		return riders;
	}
//	
//	public List<Rider> findFreeRiders(){
//		
//	}
//	
//	public List<Rider> findRiders(){
//		List<Rider> riders = riderDao.findAll();
//		return riders;
//	}
	
}
