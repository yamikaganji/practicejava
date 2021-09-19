package PracticePrograms;

import java.util.Scanner;

public class Direction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i=0;
		int[] d = new int[100];
		while(i<t){
		     d[i]=sc.nextInt();
		    i++;
		}
		
		for(int j=0;j<t;j++){
		    int k=d[j];
		    if(k>=4){
		        k%=4;
		    }
		    switch(k){
		        case 0:
		            System.out.println("North");
		            break;
		        case 1:
		            System.out.println("East");
		            break;
		        case 2:
		            System.out.println("South");
		            break;
	            case 3:
		            System.out.println("West");
		            break;
		    }
		}

	}

}
