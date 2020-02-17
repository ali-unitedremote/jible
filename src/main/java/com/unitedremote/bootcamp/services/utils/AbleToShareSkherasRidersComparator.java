package com.unitedremote.bootcamp.services.utils;

import java.util.Comparator;

import com.unitedremote.bootcamp.models.RiderComparable;

/**
 * According to this criteria: one comparable rider is "better" than another,
 * if he has less ongoing skheras
 *
 */
public class AbleToShareSkherasRidersComparator implements Comparator<RiderComparable> {	

	@Override
	public int compare(RiderComparable rider1, RiderComparable rider2) {
        
        if (rider1.getTimeTo() != rider2.getTimeTo()){
        	return rider1.getTimeTo() - rider2.getTimeTo();
        }
        else {
        	return rider1.getOngoingSkheras() - rider2.getOngoingSkheras();
        }
    }

}