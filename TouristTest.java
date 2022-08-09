package day10.comprodapt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class TouristTest {

	public static void main(String[] args) {
	ArrayList<Tourist> lis=new ArrayList<Tourist>();
	lis.add(new Tourist(1,"Yogesh","Dadri"));
	lis.add(new Tourist(2,"Suraj","Aligarh"));
	lis.add(new Tourist(3,"Ravi","BIhar"));
	lis.add(new Tourist(4,"Roop","Noida"));
	lis.add(new Tourist(5,"Rohan","delhi"));
	lis.add(new Tourist(6,"Tinku","Noida"));
	
	
	Iterator it=lis.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		
	}
	
	System.out.println("    ");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the city");
	String a=sc.nextLine();
	
	for(int i=0;i<lis.size();i++) {
		if(lis.get(i).getCity().equals(a)) {
			System.out.println(lis.get(i));
		}
	}
	
	
    System.out.println("   ");
    System.out.println("sorting on the basis of Name");
	
	Collections.sort(lis,new NameComparator());  
	for(Tourist dm:lis){  
         System.out.println(dm.getId()+"   "+dm.getName()+"   "+dm.getCity());
	}  
	
	System.out.println("   ");
    System.out.println("sorting on the basis of City");
	
	Collections.sort(lis,new CityComparator());  
	for(Tourist dm:lis){  
         System.out.println(dm.getId()+"   "+dm.getName()+"   "+dm.getCity());
	}  
	

	}

}
