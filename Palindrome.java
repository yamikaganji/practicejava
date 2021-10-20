package PracticePrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		int r=0;
		int rev=0;
		while(n>0)
		{
			
		r=n%10;
		n=n/10;
		rev=rev*10+r;
	}
		System.out.println("reverse="+ rev);
		if(rev==t)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}

	

}
