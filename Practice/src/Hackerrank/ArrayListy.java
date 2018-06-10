package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListy {
	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		ArrayList al[]=new ArrayList[n];
		for(int i=0;i<n;i++)
		{
			al[i]=new ArrayList<Integer>();
			int m=io.nextInt();
			for(int j=0;j<m;j++)
			{
				al[i].add(io.nextInt());			}
		}
		int a=io.nextInt();
		
		for(int i=0;i<a;i++)
		{
			int x=io.nextInt();
			int y=io.nextInt();
			x--;
			if(al[x].size()<y) System.out.println("ERROR!");
			else
				System.out.println(al[x].get(y-1));
		}
	}
}
