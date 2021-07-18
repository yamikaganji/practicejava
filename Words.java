package PracticePrograms;

import java.util.Scanner;

public class Words {
	public static int wordCount(String s)
	{
	int count=1;
	//char[] ch=new char[s.length()];
	for(int i=0 ;i<s.length();i++)
	{
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
				{
			count++;
				}
				
	}
	return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int words =wordCount(s);
		System.out.println("total"+words+"words");
	
	}

}
