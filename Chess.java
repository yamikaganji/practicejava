
package PracticePrograms;

import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//codechef Problem Code: CHSFORMT
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt();
		for(int i =1; i<=rep; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a+b<3) {
				System.out.println("1");
			} else if(3<=a+b && a+b<=10) {
				System.out.println("2");
			} else if(11<=a+b && a+b<=60) {
				System.out.println("3");
			} else {
				System.out.println("4");
			}
			
			
		}

	}

}
