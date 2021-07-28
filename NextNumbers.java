package PracticePrograms;

import java.util.Scanner;

public class NextNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program to print next 10 numbers
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n+10;
		for(int i=n+1;i<m;i++)
		{
			System.out.println(i);
		}
	}

}
