package Hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {

	public static void main(String[] args) {
	Scanner io=new Scanner(System.in);	
	ArrayList<Integer>al=new ArrayList<Integer>();
	ArrayList<Integer>bl=new ArrayList<Integer>();
	int n1=io.nextInt();
	for(int i=0;i<n1;i++)
	al.add(io.nextInt());
	
	int n2=io.nextInt();
	for(int i=0;i<n2;i++)
	{
		int x=io.nextInt();
		if(al.contains(x)) {
			al.remove(al.indexOf(x));
		}
		else
			bl.add(x);
	}
	bl.addAll(al);
	
	TreeSet<Integer>s=new TreeSet(bl);
	for(Integer x:s)
		System.out.println(x);
}
}