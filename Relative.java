package PracticePrograms;

import java.util.Scanner;

public class Relative {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++){
		    int g =sc.nextInt();
		    int c = sc.nextInt();
		    if(g>=1 && g<=10 && c>=1000 && c<=3000){
		        int H = c*c;
		        int V = 2*g;
		        int res = H/V;
		        System.out.println(res);
		    }
		}

	}

}
