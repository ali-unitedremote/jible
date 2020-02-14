package services;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.RiderComparable;
import com.unitedremote.bootcamp.models.Skhera;
import com.unitedremote.bootcamp.services.DispatcherService;

class DispatcherServiceTest {
	
	
	
	static List<RiderComparable> riders = new ArrayList<RiderComparable>();

	@BeforeClass
	public static void setUpBeforeClass() {
	}
	
	@Test
	void testDispatchRiderToSkhera() {
		
		DispatcherService dispatcher = new DispatcherService();
		Skhera skhera = new Skhera(true);
		Rider rider = dispatcher.dispatchRiderToSkhera(skhera);

		assertTrue("test fail, expected rider_id : 7" , rider.getId().equals(7l) );
	}

}
