package Hackerrank;

public class InsertionSort1 {
public static void main(String[] args) {
	int a[]= {2 ,3 ,4 ,5 ,6 ,7, 8, 9 ,10 ,1}; 
	int n=10,i;
	int x=a[n-1],flag=0;
      for(i=n-1;i>0;i--)
  {
      if(a[i-1]>x)       a[i]=a[i-1];
      else {a[i]=x; flag=1;}
          
          for(int c:a)
          System.out.print(c+" ");
          if(flag==1) break;
          System.out.println();
      
      }
      if(i==0)
    	  {
    	  a[0]=x;
    	   for(int c:a)
    	          System.out.print(c+" ");
    	       
    	  }
    	  
      
}
}
