package PracticePrograms;

import java.util.Scanner;

public class VaccineDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int arr[]=new int[3];
		    for(int j=0;j<3;j++){
		        arr[j]=sc.nextInt();
		    }
		    int d=arr[0];
		    int l=arr[1];
		    int r=arr[2];
		    if(d>=l && d<=r){
		        System.out.println("Take second dose now");
		    }
		    else if(d>r){
		        System.out.println("Too Late");
		    }
		    else{
		        System.out.println("Too Early");
		    }

	}
	}

	}
