package PracticePrograms;

import java.util.Scanner;

public class Halfsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, temp;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the length of the array : ");
        int len = sc.nextInt ();
        int arr[] = new int[50];
        System.out.println ("Enter the element of the array : ");
    
        for (i = 0; i < len; i++)
            arr[i] = sc.nextInt ();
        
        for (i = 0; i < len; i++)
        {
            for (int j = i + 1; j < len; j++)
	        {
	            if (arr[i] > arr[j])
	            {
            		temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
	            }
    	    }
        }
        
        //printing first half of the array
        System.out.println ("Sorted array ");
        
        for (i = 0; i < len / 2; i++)
        {
        	System.out.println (arr[i]);
        }
        //printing second half of the array

        for (i = len - 1; i >= len / 2; i--)
        {
        	System.out.println (arr[i]);
        }

	}

}
