package Hackerrank;

import java.util.Arrays;

public class Pangrams {
	
	public static void main(String[] args) {
	
		System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
	}

	 static String pangrams(String s) {
		// TODO Auto-generated method stub
		 char[] a= "abcdefghijklmnopqrstuvwxyz".toCharArray();
		s= s.toLowerCase();
		 for(char x:a)
		 {
			 if(!s.contains(x+""))return "not pangram";
		 }
		 
		 
		 return "pangram";
		 
		 
	}
}
