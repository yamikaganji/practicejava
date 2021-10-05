package PracticePrograms;

import java.util.Scanner;

public class HelpingChef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i<num; i++){
		    int x = sc.nextInt();
		    
		    if(x<10){
		        System.out.println("Thanks for helping Chef!");
		    }else{
		        System.out.println("-1");
		    }
		}

	}

}
