package zoho;

public class Substring {

	public static void main(String[] args) {
	String s1="test123string";
	String s2="1234";

	System.out.println(find(s1,s2));
	
	
	
	
	}

 static int find(String s1, String s2) {
		// TODO Auto-generated method stub
		int size=s2.length();
		
		for(int i=0;i<s1.length()-size;i++)
		{
			if(s1.substring(i, i+size).equals(s2))
			return i;
		}	
	 return -1;
	}
}
