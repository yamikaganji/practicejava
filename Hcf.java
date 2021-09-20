package PracticePrograms;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers to find the hcf");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		while(n1!=n2)
		{
		if(n1>n2)
		{
			n1=n1-n2;
		}
		else
		{
			n2=n2-n1;
		}
		}
		System.out.println(n1);
	}

}
