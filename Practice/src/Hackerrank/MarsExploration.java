package Hackerrank;

public class MarsExploration {
	public static void main(String[] args) {
		String s="SOSSOT";
		System.out.println(marsExploration(s));
	}

	 static int marsExploration(String s) {
		// TODO Auto-generated method stub
		char a[]= {'S','O','S'};
		int i=0;
		int count=0;
		char c[]=s.toCharArray();
		
		for(char x:c) {
			if(x!=a[i]) count++;
			
			i=(i+1)%3;
		}
		 
		 return count;
	}
}
