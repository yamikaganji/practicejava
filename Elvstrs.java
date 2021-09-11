package PracticePrograms;

import java.util.Scanner;

public class Elvstrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int v1 = sc.nextInt();
		    int v2 = sc.nextInt();
		    
		    if(v2>(int)(v1*Math.sqrt(2))){
		        System.out.println("Elevator");
		    }
		    else{
		        System.out.println("Stairs");
		    }
		}

	}

}
