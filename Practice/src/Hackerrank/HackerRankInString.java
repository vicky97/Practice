package Hackerrank;

public class HackerRankInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hackerrankaa";
		System.out.println(hackerrankInString(s));
	}

	 static String hackerrankInString(String s) {
		// TODO Auto-generated method stub
		char[]c=s.toCharArray();
		char []a= {'h','a','c','k','e','r','r','a','n','k'};
		int i=0;
		for(char x:c)
		{
			if(x==a[i])
			{
				i++;
				if(i==a.length) return "YES";
			}
				
		}
		
				 return "NO";
	}

}
