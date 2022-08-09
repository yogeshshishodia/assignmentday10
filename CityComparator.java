package day10.comprodapt;

import java.util.Comparator;

class CityComparator implements Comparator<Tourist> {

	@Override
	public int compare(Tourist o1, Tourist o2) {
		
		return o1.getCity().compareTo(o2.getCity());
	}

}
