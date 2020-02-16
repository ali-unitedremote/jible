package com.unitedremote.bootcamp.services.utils;

import java.util.Comparator;

import com.unitedremote.bootcamp.models.RiderComparable;

/**
 * According to this criteria: one comparable rider is "better" than another,
 * if he can get to the pickup address of a given skhera in less time
 *
 */
public class UnableToShareSkherasRidersComparator implements Comparator<RiderComparable> {

	@Override
	public int compare(RiderComparable rider1, RiderComparable rider2) {
        return rider1.getTimeTo() - rider2.getTimeTo();
    }
}