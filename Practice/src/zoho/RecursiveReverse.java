package zoho;

import java.util.StringTokenizer;

public class RecursiveReverse {
	static String s="one two three four";
	static StringTokenizer st= new StringTokenizer(s," ");
	
	public static void main(String[] args) {
	
	reverseit(st.nextToken());
	}

	static void reverseit(String s) {
		// TODO Auto-generated method stub
		if(st.hasMoreTokens())
			{
			String temp=st.nextToken();
			
			reverseit(temp);
			}
		System.out.print(s+" ");

	}
}
