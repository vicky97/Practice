package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WeightedUniformStrings {

	
	public static void main(String[] args) {
	
		Scanner io=new Scanner(System.in);
		String s=io.next();
		int n=io.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=io.nextInt();
		
	
		char c[]=s.toCharArray();
		char prev;
		int sum=0;
		
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
		for(int i=0;i<a.length;i++)
		{
			if(al.contains(a[i]))
				System.out.println("Yes");
			else

				System.out.println("No");
		}
	}

	
}
