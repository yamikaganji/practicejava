package PracticePrograms;

import java.util.Scanner;

public class LazyChef {
	 public static  int laziness (int x, int m, int d){
	        int r = 0;

	        if(x*m<=d+x){
	            r = m*x;
	        }
	        else{
	            r = d+x;
	        }
	        return r ;
	    }
	    
	    
		public static void main (String[] args) throws java.lang.Exception{
		    Scanner sc = new Scanner(System.in);
	        int T  = sc.nextInt();
	        int arr[][] = new int[T][3];

	        for(int i=0;i<T;i++){
	           for(int j = 0;j<3;j++){
	               arr[i][j] = sc.nextInt();
	           }
	        }

	        for(int i = 0;i<T;i++){
	            System.out.println(laziness(arr[i][0],arr[i][1],arr[i][2]));
	        }



		}

}
