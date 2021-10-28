package PracticePrograms;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0){
		    int n= s.nextInt();
		    int x = s.nextInt();
		    int p  =s.nextInt();
		    int correct = x*3;
		    int wrong = (n-x);
		    if(correct-wrong>=p){
		        System.out.println("pass");
		    }else{
		        System.out.println("Fail");
		    }
		}

	}

}
