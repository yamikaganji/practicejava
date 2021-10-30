package PracticePrograms;

import java.util.Scanner;

public class ColdPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				for(int x=1;x<=n;x++)
				{
				   
				    int M = sc.nextInt();
				    int S = sc.nextInt();
				    int t = (M/S);
				    
				    System.out.println(t);
				     
				 }      
				}catch(Exception e){
				return;
				}

	}

}
