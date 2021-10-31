package PracticePrograms;

import java.util.Scanner;

public class PairMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			for(int i=0;i<t;i++){
			    int x = sc.nextInt();
			    int y = sc.nextInt();
			    int z = sc.nextInt();
			    if(x == y+z){
			        System.out.println("YES");
			    }
			    else if(y == x+z){
			        System.out.println("YES");
			    }
			    else if(z == x+y){
			        System.out.println("YES");
			    }
			    else{
			        System.out.println("NO");
			    }
			}
		
	}

}
