package PracticePrograms;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(wordcount(s));
	}
		static int wordcount(String s)
		{
			int count=0;
		
		char[]c=new char[s.length()];
		
		
		for(int i=0;i<s.length();i++)
		{
		c[i]=s.charAt(i);
		if((i>0)&&(c[i]!=' ')&&(c[i-1]!=' ')||((c[0]!=' ')&&(i==0)))
	    count++;
		}
		
		return count;
		
	
		}
		

	
}
