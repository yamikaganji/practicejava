package PracticePrograms;

import java.util.Scanner;

public class VowelString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		s=s.replaceAll("[aAEeiIOouU]","@");
		System.out.println(s);
		
	}

}
