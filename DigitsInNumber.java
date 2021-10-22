package PracticePrograms;

import java.util.Scanner;

public class DigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();int r;int sum=0;
		int count=0;
		int temp=n;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		int a=0;
		while(temp>0)
		{
		a=temp%10;
		System.out.println("the digit at positin"+count+"is:"+a);
		temp=temp/10;
		count--;
		}
	}
	

}
