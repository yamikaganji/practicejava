package PracticePrograms;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int a=0,b=0;
		for(int i=1;i<n;i++)
		{
			if(i%2!=0)
			{
				if(i>1)
					a=a+2;
				System.out.println(a);;
			}
			else
			{
				b=a/2;
				System.out.println(b);
			}
		}
		
		/*if(n%2!=0)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}*/
		

	}

}
