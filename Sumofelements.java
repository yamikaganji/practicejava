package PracticePrograms;

import java.util.Scanner;

public class Sumofelements {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array:");
	int n=sc.nextInt();
	int Arr[]=new int[n];
	int flag=0;
	for(int i=0;i<n;i++)
	{
		Arr[i]=sc.nextInt();
	}
	for(int i=0;i<n-1;i++)
	{
		int sum=0;
		for(int j=i+1;j<n;j++)
		{
			sum=sum+Arr[j];
		}
			if(Arr[i]+sum==0)
			{
				flag=1;
				break;
			}
	}

		System.out.println(flag);
	}

}
