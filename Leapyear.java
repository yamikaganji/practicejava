package PracticePrograms;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Year");
			int year = sc.nextInt();
	                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
	                        System.out.println(year + " is a leap year.");
			else
				System.out.println(year + " is not a leap year.");

	}

}
