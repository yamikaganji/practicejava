package PracticePrograms;

import java.util.Scanner;

public class BearAndCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        if (sc.hasNext()) {
	            int t = sc.nextInt();

	            while (t--!=0){
	                int a = sc.nextInt();
	                int b = sc.nextInt();

	                int sumA = 0, sumB = 0;

	                for (int i = 1; sumA<=a; i+=2){
	                    sumA+=i;
	                }
	                for (int i = 2; sumB<=b; i+=2){
	                    sumB+=i;
	                }

	                if (sumA > sumB){
	                    System.out.println("Limak");
	                }else{
	                    System.out.println("Bob");
	                }
	            }
	        }

	}

}
