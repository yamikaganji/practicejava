package PracticePrograms;

import java.util.Scanner;

public class Solubility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum  = b+(100-a)*n;
            System.out.println(sum*10);
            t--;
        }

	}

}
