package PracticePrograms;

import java.util.Scanner;

public class GoldMining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i=0;i<testcases;i++)
        {
            int friends = sc.nextInt();
            int gold = sc.nextInt();
            int carry = sc.nextInt();
            if((friends+1)*carry>=gold)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }

	}

}
