package Hackerrank;

import java.io.*;
import java.util.*;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
      
        StringTokenizer st=new StringTokenizer(s, " !,?._@'");    	
        System.out.println(st.countTokens());
        while(st.hasMoreTokens())
        	System.out.println(st.nextToken());
        
        scan.close();
    }
}


