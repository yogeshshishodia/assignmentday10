package day10.comprodapt;

import java.util.Comparator;



class NameComparator implements Comparator<Tourist> {

	@Override
	public int compare(Tourist o1, Tourist o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}