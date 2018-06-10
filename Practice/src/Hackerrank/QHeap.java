package Hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class QHeap {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner io=new Scanner(System.in);	
		int min=Integer.MAX_VALUE;
		int n=io.nextInt();
		while(n>0)
		{
			int optr=io.nextInt();
			
			switch (optr) {
			case 1:
				int x=io.nextInt();
				al.add(x);
				if(x<min)min=x;
				
				break;
				
			case 2:
				int a=io.nextInt();
				al.remove(al.indexOf(a));
				
				if(a==min)
					{
					min=Integer.MAX_VALUE;
					for(int i:al)
						if(i<min)min=i;
					}
					break;
				
			case 3:
				System.out.println(min);
				break;
			}	


			
			n--;
		}
	}
	   
}
