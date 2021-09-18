package PracticePrograms;

import java.util.Scanner;

public class TravelPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while(t-- > 0){
	            int n,a,b;
	            n = sc.nextInt();
	            a = sc.nextInt();
	            b = sc.nextInt();
	            sc.nextLine();
	            String s = sc.nextLine();
	            char[] charArr = s.toCharArray();
	            int countZero=0,countOne=0;
	            for(int i=0;i<n;i++){
	                if(charArr[i]=='0')countZero++;
	                else countOne++;
	            }
	            System.out.println(a*countZero + b*countOne);
	        }

	}

}
