package PracticePrograms;

import java.util.Scanner;

public class Directions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		getDistance(t);
	}
	public static void getDistance(int n)
	{
		int x=0;
		int y=0;
		int distance=10;
		char c='r';
		while(n>0)
		{
			switch(c)
			{
			case 'r':
				x=x+distance;
				distance=distance+10;
				c='u';
				break;
				
			case 'u':
				y=y+distance;
				distance=distance+10;
				c='l';
				break;
				
			case 'l':
				x=x-distance;
				distance=distance+10;
				c='d';
				break;
				
			case 'd':
				y=y-distance;
				distance=distance+10;
				c='a';
				break;
				
			case 'a':
				x=x+distance;
				distance=distance+10;
				c='r';
				break;
			}
			n--;
		}
		System.out.println(x+" "+y);
	}

}
