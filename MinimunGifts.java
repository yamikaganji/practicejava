package PracticePrograms;

import java.util.Scanner;

public class MinimunGifts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of test cases:");
		int t=sc.nextInt();
		while(t>0)
		{
			System.out.println("enter no.of employees:");
			int n=sc.nextInt();
			int[] r=new int[n];
			for(int i=0;i<n;i++)
			{
			r[i]=sc.nextInt();
			}
			int count=n;
			for(int i=0;i<n-1;i++)
			{
				if(r[i]<r[i+1]) 
				{
					count++;
				}
					
			}
			System.out.println("the minimum gifts reqired:"+count);
			t--;
		}
		}

}
