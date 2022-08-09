package day10.comprodapt;

import java.util.ArrayList;
import java.util.Collections;



public class StudentTest {
	public static void main(String args[]){  
		ArrayList<Student> al=new ArrayList<Student>();  
	 
		al.add(new Student(1,"Yogesh",8.7)); 
		al.add(new Student(2,"Suraj",9.5));
		al.add(new Student(3,"Ravi",8));
		al.add(new Student(4,"Roop",9.5));
		al.add(new Student(5,"Rohan",8.7));
		al.add(new Student(6,"Tinku",7.9));

		System.out.println("sorting by cgpa ");
		System.out.println();


		Collections.sort(al,new CgpaComparator());  
		for(Student dm:al){  
	         System.out.println(dm.getFname());
		}  



		
		}  
		
		} 


