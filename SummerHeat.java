package PracticePrograms;

import java.util.Scanner;

public class SummerHeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0)
		{
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int sum = (a/x) + (b/y);
		    System.out.println(sum);
		}
	}

	

}
