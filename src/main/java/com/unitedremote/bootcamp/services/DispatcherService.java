package com.unitedremote.bootcamp.services;

import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.Skhera;
import com.unitedremote.bootcamp.services.utils.AbleToShareSkherasRidersComparator;
import com.unitedremote.bootcamp.services.utils.UnableToShareSkherasRidersComparator;

public interface DispatcherService {

	/**
	 *
	 * <b> Assign a rider to a skhera, using a rider comparator</b>
	 * 
	 * <p>Selection criteria :</p>
	 * <ul>
	 * 	<li> Ability of a rider to be shared </li>
	 *  <li> Ability of the skhera to be sahred </li>
	 *  <li> Proximity of a rider to the skhera pickup address </li>
	 *  <li> Number of ongoing skheras of a rider </li>
	 *  <li> A rider Box available volume </li>
	 * </ul>
	 *
	 * @param skhera
	 * @return rider
	 * 
	 * @see AbleToShareSkherasRidersComparator
	 * @see UnableToShareSkherasRidersComparator
	 */
	Rider dispatchRiderToSkhera(Skhera skhera);

}
