package PracticePrograms;

import java.util.Scanner;

public class PeakFinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int max=0;
		    int a;
		    for(int i=0;i<n;i++){
		        a=sc.nextInt();
		        if(a>max){
		            max=a;
		        }
		    }
		    System.out.println(max);
		}

	}

}
