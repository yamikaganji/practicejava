package PracticePrograms;

import java.util.Scanner;

public class VowelChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("the original string is:"+ s);
		System.out.println("the string after replacing is:" +s.replaceAll("a","A").replaceAll("e","E").replaceAll("i","I").replaceAll("o","O").replaceAll("u","U"));
		
	}

}
