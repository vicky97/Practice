package Hackerrank;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HackerRankList {
	
	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
		LinkedList<Integer> li=new LinkedList<Integer>();
		int n=io.nextInt();
		for(int i=0;i<n;i++)
			li.add(io.nextInt());
		
		int m=io.nextInt();
		for(int i=0;i<m;i++)
		{
			String s=io.next();
			if(s.charAt(0)=='I')
			{
				int x=io.nextInt();
				int y=io.nextInt();
				li.add(x,y);
			}
			else 
			{
				int x=io.nextInt();
				li.remove(x);
			}
		}
		for(int x:li)
			System.out.print(x+" ");
	}
}
