package PracticePrograms;

import java.util.Scanner;

public class TwovsTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0)
		{
		    int n = sc.nextInt();
		    if(n%10==0)
		    {
		        System.out.println(0);
		    }
		    else if(n%5==0)
		    {
		        System.out.println(1);
		    }
		    else
		    {
		        System.out.println(-1);
		    }
		    t--;
		}

	}

}
