package PracticePrograms;

import java.util.Scanner;

public class PrimeTwist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int n=sc.nextInt();
		check(n);
	}
	public static void check(int m)
	{
		
		if(m<0)
		{
			System.out.println("enter a positive number");
		}
		else
		{
			prime(m );
		}
	}
	public static void prime(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count>=1)
		{
			System.out.println("it is not a prime number");
		}
		else
		{
			System.out.println("it is a prime number");
		}
	}
	

}
