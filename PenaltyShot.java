package PracticePrograms;

import java.util.Scanner;

public class PenaltyShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		for(int x=1;x<=y;x++)
		{
		  int team1 = 0;
		  int team2 = 0;
		   for(int a=1;a<=10;a++)
		   {
		    int m = sc.nextInt();
		    if(((a%2)==0)&&(m==1))  
		    team2 +=1;
		    else
		    if(((a%2)==1)&&(m==1))  
		    team1 +=1;
                      
		   }
		   if(team1==team2)
		   System.out.println(0);
		   else
		   if(team1>team2)
		   System.out.println(1);
		   else
		   System.out.println(2);
		}

	}

}
