package PracticePrograms;

import java.util.Scanner;
import java.lang.*;

public class Repeatedword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence:");
		String s=sc.next();
		System.out.println("enter the target word:");
		String s1="is";
		String[] strary=s.split("");
		int k=0; 
		for(int i=0;i<strary.length;i++)
		{
			if(strary[i].equals(s1))
			{
				k++;
			}
		}
		System.out.println(k);
	}

}
