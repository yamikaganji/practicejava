package PracticePrograms;

import java.util.Scanner;

public class GCD3 {
	//java program to find the gcd of two numbers

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
                int num3=sc.nextInt();
		int min=Math.min(num1,Math.min(num2,num3));
                int i;
		for(i=min;i>=1;i--)
		    if((num1%i==0) && (num2%i==0) && (num3%i==0))
		        break;
		System.out.println("GCD of "+num1+", "+num2+" and "+num3+" is "+i);


	}

}
