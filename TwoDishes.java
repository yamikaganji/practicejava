package PracticePrograms;

import java.util.Scanner;

public class TwoDishes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    int a,b,c,n,t;
         t = sc.nextInt();
         for(int i=0; i<t; i++){
             n = sc.nextInt();
             a = sc.nextInt();
             b = sc.nextInt();
             c = sc.nextInt();
             if((a+c)>=b){
                 if(b>=n){
                     System.out.println("YES");
                 }
                 else{
                     System.out.println("NO");
                 }
             }
             else{
                  if((a+c)>=n){
                     System.out.println("YES");
                 }else{
                     System.out.println("NO");
                 }
             }
         }

	}

}
