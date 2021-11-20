package PracticePrograms;

import java.util.Scanner;

public class GoodJoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int ans=0;
			for (int i = 0; i < n; i++) {
				int x=sc.nextInt();
				int y=sc.nextInt();
			}
			for (int i = 1; i <= n; i++) {
				ans^=i;
			}
			System.out.println(ans);
		}



	}

}
