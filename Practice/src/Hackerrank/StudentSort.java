package Hackerrank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		int cgpacmp;
		if(cgpa>=arg0.cgpa)
		{
			if(cgpa==arg0.cgpa)
				cgpacmp=0;
			else 
				cgpacmp=-1;
		}
		else cgpacmp=1;
		
		if(cgpacmp!=0)
			return cgpacmp;
		
		int namecmp;
		namecmp=fname.compareTo(arg0.fname);
		if(namecmp!=0)
			return namecmp;
		int idcmp;
		if(id>=arg0.id)
		{
			if(id==arg0.id)
				idcmp=0;
			else 
				idcmp=-1;
		}
		else idcmp=1;
		
		return idcmp;
	}
}

//Complete the code
public class StudentSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		Collections.sort(studentList);
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



