package PracticePrograms;

import java.util.Scanner;

public class Stairs {
	public static int noofways(int n)
	{
		if(n<=1)
		return 1;
		else
			return noofways(n-1)+noofways(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int w=0;
		if(n>1&&n<25)
		{
			w=noofways(n);
			System.out.println(w);
			
		}
		else
		{
			System.out.println("invalid input");
		}

	}

}
