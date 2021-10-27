package PracticePrograms;

import java.util.Scanner;

public class BuyingNewTablet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int b=sc.nextInt();
		    int max=0;
		    for(int i=0;i<n;i++)
		    {
		       int w=sc.nextInt();
		       int h=sc.nextInt();
		       int p=sc.nextInt();
		       if(max<h*w && p<=b)
		       {
		           if(max<h*w)
		           max=h*w;
		       }
		    }
		    if(max==0)
		    System.out.println("no tablet");
		    else 
		    System.out.println(max);
		    
		}

	}

}
