package PracticePrograms;

import java.util.Scanner;
import java.util.*;

public class Overridden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=1;
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			if(arr[i]==count)
			{
				count++;
			}
			else
			{
				System.out.println(count);
				System.exit(0);
			}
		}

	}

}
