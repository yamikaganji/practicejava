package PracticePrograms;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");				
		int n = sc.nextInt();
		int a = 1, b = 1;
		if(n % 2 == 0)
		{
			for(int i = 1 ; i <= (n-2) ; i = i+2)
			{
				a = a * 2;
				b = b * 3;
			}
			System.out.print(n+" element of the series is = "+b);
		}
		else
		{
			for(int i = 1 ; i < (n-2) ; i = i+2)
			{
				a = a * 2;
				b = b * 3;
			}
			a = a * 2;
			System.out.print(n+" element of the series is = "+a);

	}

}
}
