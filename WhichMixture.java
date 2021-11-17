package PracticePrograms;

import java.util.Scanner;

public class WhichMixture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=s.nextInt();
		    int b=s.nextInt();
		    if(a>0 && b>0)
		    {
		        System.out.println("Solution");
		    }
		    else if(b==0 && a>0)
		    {
		         System.out.println("Solid");
		    }
		    else if(a==0 && b>0)
		    {
		        System.out.println("Liquid");
		    }
		}

	}

}
