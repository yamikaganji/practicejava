package PracticePrograms;

import java.util.Scanner;

public class Lifelimited {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String s1=sc.next();
		    String s2=sc.next();
		    String s3=sc.next();
		    int flag=0;
		    for(int i=0;i<2;i++){
		        char c1=s1.charAt(i);
		        char c2=s2.charAt(i);
		        char c3=s2.charAt(i+1);
		        if(c1=='l' && c2=='l' && c3=='l'){
		            flag++;
		        }
		    }
		    for(int i=0;i<2;i++){
		        char c1=s2.charAt(i);
		        char c2=s3.charAt(i);
		        char c3=s3.charAt(i+1);
		        if(c1=='l' && c2=='l' && c3=='l'){
		            flag++;
		        }
		    }
		    if(flag!=0){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }

	}
	}

	}
