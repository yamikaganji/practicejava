package PracticePrograms;

import java.util.Scanner;

public class HardestProblemBet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    if(a<b&&a<c)
		        System.out.println("Draw");
	        else if(b<a&&b<c)
	            System.out.println("Bob");
            else
                System.out.println("Alice");
		}

	}

}
