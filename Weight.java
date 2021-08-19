package PracticePrograms;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int w1=sc.nextInt();
		    int w2=sc.nextInt();
		    int x1=sc.nextInt();
		    int x2=sc.nextInt();
		    int m=sc.nextInt();
		    int inc=w2-w1;
		    int min=x1*m;
		    int max=x2*m;
		    if(inc>=min && inc<=max)
		    {
		        System.out.println("1");
		        
		    }
		    else{
		        System.out.println("0");
		        
		    }
		}
	}
}

