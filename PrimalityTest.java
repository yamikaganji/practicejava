package PracticePrograms;

import java.util.Scanner;

public class PrimalityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=0;i<t ;i++ ){
			int n=sc.nextInt();
			String ans="yes";
			if(n==1){
    		    ans="no";
			}
			else{
			for (int j = 2; j <= n/2; j++) {
				if (n%j==0) {
					ans="no";
					break;
				}
			}}
			System.out.println(ans);
	}

	}

}
