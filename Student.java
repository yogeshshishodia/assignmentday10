package day10.comprodapt;

public class Student {
	private int id; 
    private String fname; 
    private double cgpa;
	public Student() {
		
	}
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa =cgpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", cgpa=" + cgpa + "]";
	} 
    
    

}
