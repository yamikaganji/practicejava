package PracticePrograms;

import java.util.Scanner;

public class WashingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the weight of clothes in grams:");
		int n=sc.nextInt();
		time(n);
	}
	int time=0;
	public static void time(int n)
	{
		
		if(n==0)
		{
			System.out.println("time is:0");
		}
		else if((n>0)&&(n<2000))
		{
			System.out.println("time is: 25 minutes");
		}
		else if((n>2000)&&(n<4000))
		{
			System.out.println("time is: 35 minutes");
		}
		else if((n>4000)&&(n<7000))
		{
			System.out.println("time is: 45 minutes");
		}
		else
		{
			System.out.println("INVALID INPUT");
		}
		
	}

}
