package Hackerrank;

import java.util.BitSet;
import java.util.Scanner;

public class Bits {

	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
	int n=io.nextInt();
	BitSet bs[]=new BitSet[2];
	bs[0]=new BitSet(n);	
	bs[1]=new BitSet(n);
	
	
	
	int m=io.nextInt();
	for(int i=0;i<m;i++)
	{
		String s=io.next();
		int x=io.nextInt();
		int y=io.nextInt();
		if(s.equals("AND"))
		{
			x--;y--;
			bs[x].and(bs[y]);
		
		}
		else if(s.equals("SET"))
		{
			x--;
			bs[x].set(y);
			
		}
		else if(s.equals("FLIP"))
		{
			x--;
			bs[x].flip(y);
			
		}
		else if(s.equals("OR"))
		{
			x--;y--;
			bs[x].or(bs[y]);
			
		}
		
		System.out.println(bs[0].cardinality()+" "+bs[1].cardinality());
		
		
	}
	}
}
