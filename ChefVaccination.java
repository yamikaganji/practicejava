package PracticePrograms;

import java.util.Scanner;

public class ChefVaccination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int p=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt(),sum=0;
		    int a[]=new int[n];
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		    for(int k=0;k<p;k++)
		    {
		        if(a[k]==0)
		        {
		            sum+=x;
		        }
		        else
		        sum+=y;
		    }
		    System.out.println(sum);
		}
	


	}

}
