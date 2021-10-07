package PracticePrograms;

import java.util.Scanner;

public class CarsAndBikes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    int N = sc.nextInt();
		    if(N%4 == 2){
		        System.out.println("YES");
		    }else System.out.println("NO");
		    T--;
		}

	}

}
