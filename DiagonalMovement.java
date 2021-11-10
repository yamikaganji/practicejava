package PracticePrograms;

import java.util.Scanner;

public class DiagonalMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		String arr[]=new String[t];
		for(int i=0;i<t;i++)
		{
		    int a=s.nextInt();
		    int b=s.nextInt();
		     int c=a+b;
		     if(c<0) c=-c;
		     if(c%2==0) arr[i]="YES";
		     else arr[i]="NO";
		}
		for(int i=0;i<t;i++) System.out.println(arr[i]);

	}

}
