package Hackerrank;

import java.util.ArrayList;

public class TwoCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="beabeefeab";
		System.out.println(twoCharaters(s));
	}

	  static int twoCharaters(String s) {
		  int max=0;
		  	char c[]=s.toCharArray();
		  	ArrayList<Character>al=new ArrayList<Character>();
		  for(int i=0;i<c.length;i++)
			  if(!al.contains(c[i])) al.add(c[i]);
		  
		  
		  	for(int i=0;i<al.size()-1;i++)
		  {
		  		here:
			  for(int j=i+1;j<al.size();j++)
			  {
				  char lastseen = '\u0000';
	                int patternLength = 0;
				  for(char x:c)
				  {
					  if(x==al.get(i)||x==al.get(j))
					  {
						  
						if(x==lastseen)
							  continue here;
						patternLength++;
						lastseen=x;
					  }
				  }
				  max=(patternLength>max)?patternLength:max;
				  
			  }
		  }
		  
		  
		  
		  return max;
	    }

}
