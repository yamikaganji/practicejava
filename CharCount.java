package PracticePrograms;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("enter a character to search:");
		char c=sc.next().charAt(0);
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
