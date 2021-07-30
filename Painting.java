package PracticePrograms;

import java.util.Scanner;

public class Painting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of interior walls:");
		int in=sc.nextInt();
		System.out.println("enter number of exterior walls:");
		int ex=sc.nextInt();
		if(in<0||ex<0)
		{
			System.out.println("invaid input");
		}
		else if(in==0&&ex==0)
		{
			System.out.println("totalcost is: 0.0");
		}
		System.out.println("enter the surfacearea of each interior wall:");
		double sum1=0.0;
		for(int i=0;i<in;i++)
		{
			
			double s=sc.nextDouble();
			sum1=sum1+s;
		}
		System.out.println(sum1);
		double cost=sum1*18;
		System.out.println("the cost of interior wall painting is:"+ cost);
		System.out.println("enter the surface area of exterior wall:");
		double sum2=0;
		for(int i=0;i<ex;i++)
		{
			double s1=sc.nextDouble();
			sum2=sum2+s1;
		}
		System.out.println(sum2);
		double cost2=sum2*12;
		System.out.println(" the cost of exterior wall painting is: "+ cost2);
		double totalcost=cost+cost2;
		System.out.println("the total cost is "+ totalcost);
	}

}
