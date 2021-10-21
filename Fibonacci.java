package PracticePrograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stubr 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println("the fibonacci series is:");
		System.out.print(a+" "+b+" ");
		
		/*for(int i=0;i<=n;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
			
		}*/
		int c=0;
				while(c<n)
				{
					 c=a+b;
						a=b;
						b=c;
						System.out.print(c+" ");
					
				}

	}

}
