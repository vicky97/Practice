package zoho;

public class SortOddEven {
public static void main(String[] args) {
	int a[]= { 1,2,3,4,5,6,7,8,9};
int temp;
	for(int i=0;i<a.length-2;i++)
	{
		for(int j=i+2;j<a.length;j+=2)
		{
			if(i%2==0)
			{
				if(a[j]>a[i])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			else
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.print(a[i]+" ");
	}
	System.out.print(a[a.length-2]+" "+a[a.length-1]);
}
}
