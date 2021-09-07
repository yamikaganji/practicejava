package PracticePrograms;

import java.util.Scanner;
import java.util.*;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=0;
		int l=0;
		int j=0;
		for ( j=0;j<n;j++)
		{
			if(a[j]>m)
				m=a[j];
			l=j;
				
		}
		System.out.println(j);
	}

}
