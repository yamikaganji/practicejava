package PracticePrograms;

import java.util.Scanner;

public class GreatRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while((t--)>0) {
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] arr = new int[n];
		    int sum = 0;
		    for(int i=0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    for(int i=0; i<k; i++) {
		        sum+=arr[i];
		    }
		    int max = sum;
		  //  System.out.println(Arrays.toString(arr));
		    for(int i=k; i<n; i++) {
		        
		        sum = sum-arr[i-k];
		        sum = sum+arr[i];
		      //  System.out.println(arr[i-k]+" "+arr[i]);
		        if(max<sum) {
		            max = sum;
		        }
		    }
		    System.out.println(max);
		}

	}

}
