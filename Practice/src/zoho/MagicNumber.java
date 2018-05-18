package zoho;

public class MagicNumber {
 public static void main(String[] args) {
	int n=4;
	
	long l=findnumber(n);
	System.out.println(l);
}

 static long findnumber(int n) {
	// TODO Auto-generated method stub
	if(n==1) return 3;
	if(n==2) return 4;
	int count =2;
	for(int i=33;count<=n;i++)
	{
		boolean check=true;
		
		int temp=i;
		
		while(temp!=0)
		{
			if(temp%10!=3 && temp%10!=4) {check=false; break;}
			
			temp=temp/10;
		}
		if(check)
		count++;
		
		if(count==n) return i;
		
	}
	
	
	return 0;
}
}
