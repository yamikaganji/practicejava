package PracticePrograms;

import java.util.Scanner;

public class Medel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-- >0)
		{
		    int n=sc.nextInt();
		    int nums[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        nums[i]=sc.nextInt();
		    }
		    int min=nums[0],max=nums[0];
		    for(int k=0;k<n;k++)
		    {
		        if(max<nums[k])
		         {
		             max=nums[k];
		         }
		         if(min>nums[k])
		         {
		             min=nums[k];
		         }
		    }
		   for(int k=0;k<n;k++)
		   {
		       if(nums[k]==max)
		       {
		           System.out.print(nums[k] + " ");
		       }
		       else if(nums[k]==min)
		       {
		           System.out.print(nums[k] + " ");
		       }
		   }
		   System.out.println();
		}

	}

}
