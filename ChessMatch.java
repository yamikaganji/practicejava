package PracticePrograms;

import java.util.Scanner;

public class ChessMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();
		    arr[i]=2*(180+a)-(b+c);
		}
		for(int i=0;i<n;i++) System.out.println(arr[i]);
		

	}

}
