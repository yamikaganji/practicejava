package PracticePrograms;

import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int num=sc.nextInt();
		int[] arr=new int[num];
		System.out.println("enter the elements of the array");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("enter the size of sub array");
		int num2=sc.nextInt();
		System.out.println("enter the element to search:");
		int s=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<num;i=i+s)
		{
			flag=false;
			for(int j=i;j<i+s&&j<num;j++)
			{
			if(arr[j]==num2)
				flag=true;
			
			}
			if(flag)
				continue;
			else
			{
				System.out.println(0);
				System.exit(0);
			}
		
			
		}
		System.out.println("1");
		
	}

}
