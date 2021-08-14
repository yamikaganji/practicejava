package PracticePrograms;

import java.util.Scanner;

public class Shoefit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0)
		{
			int d=0;
			int A=sc.nextInt();
			int B=sc.nextInt();
			int C=sc.nextInt();
			 d=A+B+C;
			if((d==1)||(d==2))
			{
				System.out.println("1");
			
			}
			else
			{
				System.out.println("0");
			}
		}

	}

}
