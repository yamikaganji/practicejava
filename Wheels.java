package PracticePrograms;

import java.util.Scanner;

public class Wheels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        int dealership=sc.nextInt();
        while(dealership-->0)
       {
            int cars=sc.nextInt();
            int bikes=sc.nextInt();
            System.out.println(cars*4+bikes*2);           
       }

	}

}
