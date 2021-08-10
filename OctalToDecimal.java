package PracticePrograms;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int d=0;
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			 d=d+r*(int)Math.pow(8, i++);
		}
		System.out.println("decimal number is:"+ d);

	}

}
