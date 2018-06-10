package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Stack {
	public static void main(String[] args) {
	Scanner io=new Scanner(System.in);	
	
	java.util.Stack<Integer> st= new java.util.Stack<Integer>();
	java.util.Stack<Integer> st1= new java.util.Stack<Integer>();
	int n=io.nextInt();
	
	while(n>0)
	{
		int optr=io.nextInt();
		
		switch (optr) {
		case 1:
			int x=io.nextInt();
			st.push(x);
			if(st1.isEmpty())st1.push(x);
			else if(x>st1.peek()) st1.push(x);
			else st1.push(st1.peek());
			break;
		case 2:
			st.pop();	
			st1.pop();
			break;
		case 3:
			
			System.out.println(st1.peek());
			break;

		default:
			break;
		}
		
		
		n--;
	}
	
	}
	
}
