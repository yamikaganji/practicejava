package PracticePrograms;

import java.util.Scanner;

public class ThreeFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    while(t-- > 0){
	      int x = input.nextInt();
	      int y = input.nextInt();
	      int z = input.nextInt();
	      int sum = Math.abs(x) + Math.abs(y) + Math.abs(z);
	      if(sum == 2 * Math.max(Math.max(Math.abs(x),Math.abs(y)),Math.abs(z)))
	      {
	        System.out.println("yes");
	      }else{
	        System.out.println("no");
	      }
	    }

	}

}
