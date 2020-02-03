package com.unitedremote.bootcamp.services;

import java.util.Comparator;

import com.unitedremote.bootcamp.models.RiderComparable;

public class UnableToShareSkherasRidersComparator implements Comparator<RiderComparable> {

	public int compare(RiderComparable rider1, RiderComparable rider2) {
        return rider1.getTimeTo() - rider2.getTimeTo();
    }
}