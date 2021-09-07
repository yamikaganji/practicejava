package PracticePrograms;

import java.util.Scanner;

public class Groups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number:");
		int n=sc.nextInt();
		int n1=0;
		int m=0;
		int r=0;
		if(n<=200)
		{
		if(n%4==0)
		{
			m=n/4;
			System.out.println("group1: "+ m +"\n"+"group2: "+m +"\n"+"group3: "+m+"\n"+"gruop4: "+m);
		}
		else
		{
			r=n%4;
			n1=n/4;
			System.out.println("group1: "+n1);
			System.out.println("group2: "+n1);
			System.out.println("group3: "+n1);
			System.out.println("group4: "+(n1+r));
		}
		
			
		}
		else
		{
			System.out.println("invalid input");
		}

	}

}
