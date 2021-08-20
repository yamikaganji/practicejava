package PracticePrograms;

import java.util.Scanner;

public class Mutatedminions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t-->0){
		        int n=sc.nextInt();
		int k=sc.nextInt();
		
		int arr[]=new int[n];
		int arr1[]=new int[n];
		int c=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			arr1[i]=arr[i]+k;
		}

		for(int i=0;i<n;i++) {
			if(arr1[i]%7==0) {
				c++;
			}
		}
		System.out.println(c);
		    }
		}catch(Exception e){
		    return;
		}
	}

	

}
