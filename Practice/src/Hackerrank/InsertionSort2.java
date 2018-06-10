package Hackerrank;

public class InsertionSort2 {

	public static void main(String[] args) {
		int n=5;
		int a[]= {2,1,3,1,2};
		insertionSort2(n, a);
	}
	
	 static void insertionSort2(int n, int[] a) {
		 
		 for(int i=1;i<n;i++)
		 {
			int temp=a[i];
			 for(int j=i-1;j>=0;j--)
			 {
				 if(a[j]<=temp) 
					 {
					 a[j+1]=temp;
					 break;
					 }
				 
				 a[j+1]=a[j];
				 
				 if(j==0)
					 a[0]=temp;
			 }
			 
			 for(int x:a)
				 System.out.print(x+" ");
			 System.out.println();
		 }
		 
	 }
}
