package PracticePrograms;

import java.util.Scanner;

public class GradeTheSteel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1;i<=n;i++){
		    int h=sc.nextInt();
		    float c=sc.nextFloat();
		    int t=sc.nextInt();
		    if(h>50 && c<0.7 && t>5600){
		        System.out.println(10);
		    }
		    else if(h>50 && c<0.7 ){
		        System.out.println(9);
		    }
    		    else if( c<0.7 && t>5600){
    		        System.out.println(8);
    		    }
        		    else if(h>50  && t>5600){
        		        System.out.println(7);
        		    }
            		    else if(h>50 || c<0.7 ||t>5600){
            		        System.out.println(6);
            		    }
                		    else{
                		        System.out.println(5);
                		    }
		}

	}

}
