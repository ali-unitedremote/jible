package mock;

import java.util.ArrayList;
import java.util.List;

import com.unitedremote.bootcamp.models.Rider;
import com.unitedremote.bootcamp.models.RiderComparable;

public class RiderComparableMock {
	
	public List<RiderComparable> createRiders(){
		List<RiderComparable> riders = new ArrayList<RiderComparable>();
		RiderComparable rider4 = new RiderComparable(new Rider(4l, "Ali", "ali@gmail.com"), true,533, 2, 6);
		riders.add(rider4);
		RiderComparable rider5 = new RiderComparable(new Rider(5l, "Zakaria", "Zakaria@gmail.com"), true, 233, 3, 6);
		riders.add(rider5);
		RiderComparable rider6 = new RiderComparable(new Rider(6l, "Hamza", "hamza@gmail.com"), false, 133, 1, 10);
		riders.add(rider6);
		RiderComparable rider7 = new RiderComparable(new Rider(7l, "Houssam", "houssam@gmail.com"), true, 133, 1, 8);
		riders.add(rider7);
		RiderComparable rider8 = new RiderComparable(new Rider(8l, "Najlae", "Najlae@gmail.com"), true, 733, 4, 6);
		riders.add(rider8);
		RiderComparable rider9 = new RiderComparable(new Rider(9l, "Nabil", "nabil@gmail.com"), false, 233, 5, 2);
		riders.add(rider9);
		RiderComparable rider10 = new RiderComparable(new Rider(10l, "Youssef", "houssam@gmail.com"), true, 333, 0, 8);
		riders.add(rider10);
		RiderComparable rider11 = new RiderComparable(new Rider(11l, "Najoua", "Najoua@gmail.com"), false, 433, 4, 4);
		riders.add(rider11);
		RiderComparable rider12 = new RiderComparable(new Rider(12l, "Youness", "youness@gmail.com"), true, 633, 1, 6);
		riders.add(rider12);
		
		return riders;
	}
}
