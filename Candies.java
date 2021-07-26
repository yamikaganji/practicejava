package PracticePrograms;

import java.util.Scanner;

public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total candies the jar has:");
		int n=sc.nextInt();
		System.out.println("the jar has :"+n +"candies");
		System.out.println("enter k value:");
		int k=sc.nextInt();
		System.out.println("enter no.of candies to purchase:");
		int c=sc.nextInt();
		int h=n-k;
		if(c>0&&c<=h)
		{
			System.out.println("no.of candies sold:"+c);
			System.out.println("no.of candies available:"+(n-c));
		}
		else
		{
			System.out.println("invalid input");
			System.out.println("no.of candies available:"+n);
		}
	}

}
