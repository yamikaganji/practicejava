package PracticePrograms;

import java.util.Scanner;

public class Hypotenus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=(int) Math.sqrt((a*a)+(b*b));
		System.out.println(c);
	}

}
