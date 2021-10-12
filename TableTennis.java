package PracticePrograms;

import java.util.Scanner;

public class TableTennis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		while(n-->0)
		{
			System.out.println("enter the input string");
			String s=sc.next();
			int count1=0;
			int count0=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='1')
				{
					count1++;
				}
				else
				{
					count0++;
				}
			}
				if(count1>count0)
				{
					System.out.println("win");
				}
				else
				{
					System.out.println("loose");
				}
				
			}
		

	}

}
