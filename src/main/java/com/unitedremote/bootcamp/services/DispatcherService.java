package com.unitedremote.bootcamp.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.RiderComparable;
import com.unitedremote.bootcamp.models.Skhera;

@Service
public class DispatcherService {
	
	@Autowired
	SkheraService skheraService;
	@Autowired
	RiderService riderService;
	
	private List<RiderComparable> riders = new ArrayList<RiderComparable>();

	public Rider dispatchRiderToSkhera(Skhera skhera) {
		if (skhera.isAbleToShare()){
			List<RiderComparable> riders = riderService.getRiders();
			Collections.sort(riders, new AbleToShareSkherasRidersComparator());		
		}
		else{
			List<RiderComparable> freeRiders = riderService.getRiders();
			Collections.sort(freeRiders, new AbleToShareSkherasRidersComparator());
		}
		return riders.get(0).getRider();
	}
	
}