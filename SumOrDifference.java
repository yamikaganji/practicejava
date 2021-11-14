package PracticePrograms;

import java.util.Scanner;

public class SumOrDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key=new Scanner(System.in);
		int c=0;
				int a=key.nextInt();
				int b=key.nextInt();
				if(a>b)
				 c=a-b;
				 else
				 c=a+b;
				System.out.println(c);

	}

}
