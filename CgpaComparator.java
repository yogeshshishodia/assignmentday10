package day10.comprodapt;
import java.util.Comparator;

public class CgpaComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		
	Student e1=(Student)o1;
	Student e2=(Student)o2;
	
if(e1.getCgpa()==e2.getCgpa())  
return 0;  
else if(e1.getCgpa()>e2.getCgpa())  
return -1;  
else  
return 1; 

}

}