package zoho;

import java.util.HashSet;

public class MergeArray {

	public static void main(String[] args) {
		int a[]= {2,4,5,6,7,9,10,13};
		int b[]= {2,3,4,5,6,7,8,9,11,15};
		int c[]=new int[a.length+b.length];
		HashSet<Integer> hs=new HashSet<Integer>();
		int i=0,j=0;	
		while(i<a.length && j<b.length)
		{
			if(a[i]<=b[j])
				hs.add(a[i++]);
			
			else if((a[i]>b[j]))
				hs.add(b[j++]);
			
			}
				
		
		if(i<a.length)
			while(i<a.length)
				hs.add(a[i++]);
		if(j<b.length)
			while(j<b.length)
				hs.add(b[j++]);
			
	Integer d[]=hs.toArray(new Integer[0]);
	for(int x:d) System.out.print(x+" ");
	}
}
