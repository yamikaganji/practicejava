package PracticePrograms;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int min=num1<num2?num1:num2,i;
		for(i=min;i>=1;i--)
		    if((num1%i==0) && (num2%i==0))
		        break;
		System.out.println("GCD of "+num1+" and "+num2+" is "+i);

	}

}
