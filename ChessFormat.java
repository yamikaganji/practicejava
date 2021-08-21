package PracticePrograms;

import java.util.Scanner;

public class ChessFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i;
        for(i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int tot=a+b;
           if(tot>60)
            {
                System.out.println("4");
            }
            else
            if((tot>=11)&&(tot<=60))
            {
                System.out.println("3");
            }
            
            else
            if((tot>=3)&&(tot<=10))
            {
                System.out.println("2");
            }
            else
            if(tot<3)
            {
                System.out.println("1");
            }
        }
 

	}

}
