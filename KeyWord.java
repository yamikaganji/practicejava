package PracticePrograms;

import java.util.Scanner;



public class KeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] keywords= {"break","else","for","default"};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String s=sc.nextLine();
		int l=keywords.length;
		boolean flag=false;
	for(int i=0;i<l;i++)
	{
		if(keywords[i].equals(s))
		{
			System.out.println(keywords[i]);
			flag=true;
		}
	}
	if(flag==true)
	{
		System.out.println("it is a keyword");
	}
	else
	{
		System.out.println("it is not a keyword");
	}
	}

}
