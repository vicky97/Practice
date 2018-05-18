package zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class alternatesort {

	public static void main(String[] args) {
		int a[]={1, 2, 3, 4, 5, 6, 7};  //7162534
		Arrays.sort(a);
		
		int i=0,j=a.length-1;
		int b[]=new int [a.length];
		for(int k=0;k<b.length;k++) {
			if(k%2==0) { b[k]=a[j]; j--;}
			else {b[k]=a[i]; i++;}
		}
	for(int v:b)	
	System.out.println(v);	
	}
}
