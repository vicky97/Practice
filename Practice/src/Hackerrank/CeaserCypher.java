package Hackerrank;

public class CeaserCypher {
 
	public static void main(String[] args) {
	String s="middle-Outz";
	int n=2;
	
	System.out.println(fun1(s,n));
}

	static String fun1(String s, int k) {
		// TODO Auto-generated method stub
	
		char c[]=s.toCharArray();
		String s2="";
		for(char x:c)
		{
			if(Character.isAlphabetic(x))
			{
				if (Character.isUpperCase(x))
		            s2 += (char) ((x+k-65)%26+65);
				else
					s2+=(char)((x+k-97)%26+97);
				
			}
			else
			{
				s2+=x;
			}
		}
		
		return s2;
	}
}
