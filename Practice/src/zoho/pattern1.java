package zoho;

public class pattern1 {
 public static void main(String[] args) {
	String s="b3c6d15";
	char a[]=s.toCharArray();
	int num;
	for(int i=0;i<a.length;i++)
	{
		
		if(isnumber(a[i+2])) {num=Integer.parseInt(s.substring(i+1, i+3)); printsol(num,a[i]); i=i+2;} 
		else  {num=Integer.parseInt(s.substring(i+1, i+2));printsol(num,a[i]); i=i+1;}
		
		
	}

	
 }
 

 static boolean isnumber(char c) {
	// TODO Auto-generated method stub
if(c>='0' && c<='9') return true;
	 
	 return false;
}
 static void printsol(int num,char a)
 {
	 for(int j=1;j<=num;j++)
			System.out.print(a);
 }
}
