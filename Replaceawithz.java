package PracticePrograms;

import java.util.Scanner;

public class Replaceawithz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ns="";
	
		for(int i=0;i<s.length();i++)
		{
		
			
			ns=ns+(char)(219-(s.charAt(i)));
		}
		System.out.println(ns);
	}

}
