package PracticePrograms;

import java.util.Scanner;

public class WhichDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int r=sc.nextInt();
		    if(r>=2000)
		        System.out.println("1");
		    else if(r>=1600 && r<2000)
		        System.out.println("2");
		    else
		        System.out.println("3");
		}

	}

}
