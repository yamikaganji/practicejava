package PracticePrograms;

import java.util.Scanner;

public class RichrRich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = (b-a)/x ;
            System.out.println(y);
            
         
         
        }

	}

}
