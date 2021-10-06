package PracticePrograms;

import java.util.Scanner;

public class Preparations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    if(k * n < m){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}

}
