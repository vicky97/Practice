import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSort {
public static void main(String[] args) {
	Scanner io=new Scanner(System.in);
	int n=io.nextInt();
	String st[]=new String[n];
	for(int i=0;i<n;i++)
		st[i]=io.next();
		
	Arrays.sort(st,new Comparator<String>() {

		@Override
		public int compare(String s1, String s2) {
			// TODO Auto-generated method stub
			if(s2.length()<s1.length()) return 1;
			else if(s2.length()>s1.length()) return -1;
			else return(s1.compareTo(s2));
		}
	});
for(String s:st)
	System.out.println(s);
}


}
