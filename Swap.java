package PracticePrograms;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int t=0;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);

	}

}
