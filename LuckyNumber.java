package PracticePrograms;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t= scan.nextInt();
		for(int l=0;l<t;l++)
		{
		    int a=scan.nextInt();
		     int b=scan.nextInt();
		      int c=scan.nextInt();
		      //int c1=0;
		      if(a==7||b==7||c==7)
		      System.out.println("YES");
		      else
		      System.out.println("NO");
		}

	}

}
