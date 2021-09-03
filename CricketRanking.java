package PracticePrograms;

import java.util.Scanner;

public class CricketRanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ss=new Scanner(System.in);
			int t=ss.nextInt();
			while(t>0)
			{
			    int r1=ss.nextInt(),w1=ss.nextInt(),c1=ss.nextInt();
			    int r2=ss.nextInt(),w2=ss.nextInt(),c2=ss.nextInt();
	            int s1=0,s2=0;
	            if(r1>r2) s1++;
	            else s2++;
	            if(c1>c2) s1++;
	            else s2++;
	            if(w1>w2) s1++;
	            else s2++;
	            if(s1>s2)
	            System.out.println("A");
	            else if(s2>s1)
	            System.out.println("B");
	            else
	            System.out.println("Both are equally good");
	            t--;
			}

	}

}
