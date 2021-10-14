package PracticePrograms;

import java.util.Scanner;

public class BalsaForThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0) {
            long num = input.nextLong() + 1;
            while(true) {
                long temp = num , count = 0;
                while(temp != 0) {
                    if (temp%10 == 3) {
                        count++;
                    }
                    temp /= 10;
                }
                if (count >= 3) {
                    System.out.println(num);
                    break;
                } else {
                    num++;
                }
            }

        }

	}

}
