package PracticePrograms;

import java.util.Scanner;

public class FindDirection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++)
		{
		    int X=sc.nextInt();
		    int k=X%4;
		    if(k==0)
		    {
		        System.out.println("North");
		    }
		    else if(k==1)
		    {
		        System.out.println("East");
		    }
		    else if(k==2)
		    {
		        System.out.println("South");
		    }
		    else{
		        System.out.println("West");
		    }
		}

	}

}
