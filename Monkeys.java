package PracticePrograms;

import java.util.Scanner;

public class Monkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int j=sc.nextInt();
		int m=sc.nextInt();
		int p=sc.nextInt();
		int banana=0;
		int peanut=0;
		if(n<0||k<0||j<0||m<0||p<0)
		{
			System.out.println("invalid input");
		}
		if(k>0)
		{
			banana=m/k;
		}
		if(j>0)
		{
			peanut=p/j;
		}
		n=n-banana-peanut;
		System.out.println("number of monkeys left on tree"+ n);

	}

}
