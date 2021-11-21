package PracticePrograms;

import java.util.Scanner;

public class HowMuchScholarship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=1&&num<=50)
            System.out.println(100);
        else if(num>=51&&num<=100)
            System.out.println(50);  
        else
         System.out.println(0);

	}

}
