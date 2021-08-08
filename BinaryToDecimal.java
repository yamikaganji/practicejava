package PracticePrograms;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] b=new int[50];
		int i=0;
		while(n>0)
		{
			b[i++]=n%2;
			n=n/2;
		}
		System.out.println("binary representation is:");
		for(int j=i-1;j>=0;j--)
		{
			System.out.print( b[j]);
		}

	}

}
