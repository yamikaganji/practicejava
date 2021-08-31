package PracticePrograms;

import java.util.Scanner;

public class Replacebykth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to decode");
		String str=sc.nextLine();
		String  ns="";
		for(int i=0;i<str.length();i++)
		{
			int val=str.charAt(i);
			if(val>=90)
			{
				ns=ns+(char)((str.charAt(i)+5)-26);
			}
			else
			{
				ns=ns+(char)(str.charAt(i)+5);
			}
		}
		System.out.println("the message is:"+ns);

	}

}
