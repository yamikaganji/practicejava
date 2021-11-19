package PracticePrograms;

import java.util.Scanner;

public class NoTimeToWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
      
         int n=sc.nextInt();
         int tr=sc.nextInt();
         int th=sc.nextInt();
         int[] A=new int[n];
         int flag=0;
         for(int i=0;i<n;i++){
             A[i]=sc.nextInt();
             A[i]=A[i]+th;
             if(tr<=A[i]){
                 flag=1;
             }
         }
         if(flag==1){
             System.out.println("YES");
         }
         else{
             System.out.println("NO");
         }

	}

}
