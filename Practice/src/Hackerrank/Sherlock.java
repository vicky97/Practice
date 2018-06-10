package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sherlock {

    static String solve(int[] a){
        // Complete this function
    
    	int first=0;
    
    int last=a.length-1;
    int leftsum=0,rightsum=0;
    //System.out.println(first+ "    "+ last);
    while(first<last)
    {	
    	if(leftsum<rightsum)
    	{
    		leftsum+=a[first];
    		first++;
    	}
    	else
    	{
    		rightsum+=a[last];
    		last--;
    	}
    	
    }
    
    leftsum+=a[first];
    rightsum+=a[last];
    System.out.println(leftsum+ " "+rightsum);
    if(leftsum==rightsum)
    	return"Yes";
    else
    	
    return "No";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}