package PracticePrograms;

import java.util.Scanner;

public class Wordiskey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"break","case","continue","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"};
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int flag=0;
		for(int i=0;i<16;i++)
		{
			
			if(str[i].equals(s.toLowerCase()))
			{
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("is a key word");
		}
		else
		{
			System.out.println("is not a key word");
		}
		
	}

}
