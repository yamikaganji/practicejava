package PracticePrograms;

import java.util.Scanner;

public class Relativity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t,c,g,H;
		t=sc.nextInt();
		while(t>0){
		    g=sc.nextInt();
		    c=sc.nextInt();
		    //c=Math.pow(c,2);
		    
		    H  =  c*c/(2*g);
		    System.out.println(H);
		    t--;
		    
		}

	}

}
