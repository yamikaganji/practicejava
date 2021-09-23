package PracticePrograms;

import java.util.Scanner;

public class Validpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();                 //a,b,c-colour of socks
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a==b || b==c || c==a)
		System.out.println("YES");
		else
		System.out.println("NO");

	}

}
