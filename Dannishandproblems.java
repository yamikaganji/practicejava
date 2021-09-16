package PracticePrograms;

import java.util.Scanner;

public class Dannishandproblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a-->0)
		{
		    int t[]=new int[10];
		    for(int i=0;i<10;i++)
		    {
		        t[i]=sc.nextInt();
		        
		    }
		    int k=sc.nextInt();
		    for(int j=9;j>=0;j--)
		    {
		          k=k-t[j];
		        if(k<0)
		        {
		          
		            System.out.println(j+1);
		            break;
		        }
		    }
		    
		    
		}

	}

}
