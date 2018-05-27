package Hackerrank;

import java.util.Scanner;

public class HourGlass {
	public static void main(String[] args) {
        int[][] a = new int[6][6];
        Scanner io=new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
            a[i][j]=io.nextInt();
            }}
        int sum=0;
        int max=0;
        for(int i=0;i<=3;i++)
        {
        	for(int j=0;j<=3;j++)
        	{sum=0;
        		sum+=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
        		
        		if(sum>max) max=sum;
        		
        	}
        }
        System.out.println(max);
}
}
