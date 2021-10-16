package PracticePrograms;

import java.util.Scanner;

public class WildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            String str1=in.next();
            String str2=in.next();
            int i=0,count=0;
            if(str1.length()==str2.length())
            {
                for(i=0;i<str1.length();i++)
                {
                if(str1.charAt(i)==str2.charAt(i)||str1.charAt(i)=='?'||str2.charAt(i)=='?')
                {
                    count++;
                }
            }}
            if(str1.length()==count) System.out.println("Yes");
            else System.out.println("No");
        }

	}

}
