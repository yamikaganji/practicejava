package PracticePrograms;

import java.util.Scanner;

public class DecimalToOCtal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] b=new int[50];
		int i=0;
		while(n>0)
		{
			b[i++]=n%8;
			n=n/8;
		}
		System.out.print("binary representation is:");
		for(int j=i-1;j>=0;j--)
		{
			System.out.print( b[j]);
		}


	}

}
