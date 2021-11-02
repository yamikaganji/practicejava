package PracticePrograms;

import java.util.Scanner;

public class FoodChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int e=sc.nextInt();
		    int k=sc.nextInt();
		    int res=0;
		    while(e!=0)
		    {
		        res++;
		        e=e/k;
		    }
		    System.out.println(res);
		}

	}

}
