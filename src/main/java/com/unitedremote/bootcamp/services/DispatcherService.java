package com.unitedremote.bootcamp.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.RiderComparable;
import com.unitedremote.bootcamp.models.Skhera;
import com.unitedremote.bootcamp.services.utils.AbleToShareSkherasRidersComparator;
import com.unitedremote.bootcamp.services.utils.UnableToShareSkherasRidersComparator;

@Service
public class DispatcherService {
	
	private static Logger logger = LogManager.getLogger();

	public Rider dispatchRiderToSkhera(Skhera skhera) {
		
		logger.info("dispatching a rider to skhera : " + skhera.getId() );
		
		int skheraVolume = skhera.getVolume();
		List<RiderComparable> riders = new ArrayList<RiderComparable>();
		RiderService riderService = new RiderService();
		if (skhera.isAbleToShare()){
			riders = riderService.getRiders(skheraVolume);
			Collections.sort(riders, new AbleToShareSkherasRidersComparator());		
		}
		else{
			riders = riderService.getFreeRiders(skheraVolume);
			Collections.sort(riders, new UnableToShareSkherasRidersComparator());
		}
		return riders.get(0).getRider();
	}
	
}