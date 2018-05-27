package Hackerrank;

public class Lexography {

	public static void main(String[] args) {
	String s="welcometojava";
	int k=3;
	System.out.println(lexography(s,k));
}

	 static String lexography(String s,int k) {
		// TODO Auto-generated method stub
		String smallest="";
		String largest="";
		String temp="";
		smallest=largest=s.substring(0, k);
		int x;
		for(int i=1;i<=s.length()-k;i++)
		{
			temp=s.substring(i,i+k);
			
			x=temp.compareTo(smallest);
			if(x<0) smallest=temp;
			x=temp.compareTo(largest);
			if(x>0) largest=temp;
			
			
		}
		
		
		
		 return smallest+"\n"+largest;
	}
}
