package zoho;

public class PatternDiagonal {
public static void main(String[] args) {
	String s="geeksforgeeks";
	char a[]=s.toCharArray();
	int n=a.length;
	int first=0,last=n-1;
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(j==first ||j==last) System.out.print(a[j]);
			else System.out.print(" ");
		}
		first++;
		last--;
		System.out.println();
		
	}
	
}
}
