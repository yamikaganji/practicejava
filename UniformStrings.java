package PracticePrograms;

import java.util.Scanner;

public class UniformStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        String s=sc.next();
	        int c=0;
	        for(int i=0;i<7;i++){
	            if(s.charAt(i)!=s.charAt(i+1)){
	                c++;
	            }
	        }
	        if(s.charAt(s.length()-1)!=s.charAt(0)){
	            c++;
	        }
	        if(c<=2){
	            System.out.println("uniform");
	        }
	        else{
	            System.out.println("non-uniform");
	        }
	    }

	}

}
