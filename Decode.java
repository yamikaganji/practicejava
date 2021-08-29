package PracticePrograms;

import java.util.Scanner;

public class Decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the message to encode");
		String str1=sc.nextLine();
		String strencode="";
		for(int i=0;i<str1.length();i++)
		{
			strencode=strencode+(char)(str1.charAt(i)+5);
		}
		System.out.println("the encrypted code is:"+strencode);

	}

}
