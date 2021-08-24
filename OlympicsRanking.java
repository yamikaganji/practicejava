package PracticePrograms;

import java.util.Scanner;

public class OlympicsRanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int p=1;p<=t;p++)
		{
		    int g1=sc.nextInt();
		    int s1=sc.nextInt();
		    int b1=sc.nextInt();
		    int g2=sc.nextInt();
		    int s2=sc.nextInt();
		    int b2=sc.nextInt();
		    
		    if((s1+g1+b1)>(s2+g2+b2))
		    System.out.println("1");
		    else
		    System.out.println("2");
		}
		

	}

}
