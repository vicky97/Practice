package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;

public class WeightedUniformStrings {

	
	public static void main(String[] args) {
	
		String s="abccddde";
		int a[]= {6,1,3,12,5,9,10};
		for(String t:weightedUniformStrings(s,a))
		System.out.println(t);
	}

	 static String[] weightedUniformStrings(String s, int[] queries) {
		// TODO Auto-generated method stub
		char c[]=s.toCharArray();
		char prev;
		int sum=0;
		String arr[]=new String [queries.length];
		ArrayList<Integer>al=new ArrayList<Integer>();
		prev=c[0];
		for(char x:c) {
			
			if(prev==x) 
				sum=sum+x-96;
						
			else
			sum=x-96;
			prev=x;
			
			al.add(sum);
			
		}
		for(int i=0;i<queries.length;i++)
		{
			if(true)
				arr[i]="Yes";
			else
				arr[i]="No";
		}
		 
		 
		 return arr;
	}
}
