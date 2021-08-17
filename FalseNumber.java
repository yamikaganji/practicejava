package PracticePrograms;

import java.util.Scanner;

public class FalseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T --> 0)
		{
		 String A = sc.next();
		 char st[] = new char[A.length()];
		 
		for(int i=0;i < A.length();i++)
		   {
		       st[i] = A.charAt(i);
		   }
		   String real = "";
		   String st5 = "";
		  char ch = st[0];
		  if(ch > '1' ) {
		    real = '1' + A;
		   System.out.println(real+" ");
		    }
		   else {
		       real = '0' + A.substring(1 ,A.length());
		       st5 = ch + real;
		        System.out.println(st5+" ");
		   }

		}

	}

}
