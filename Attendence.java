package PracticePrograms;

import java.util.Scanner;

public class Attendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String[] fn = new String[n];
            String[] ln = new String[n];
            for(int i=0;i<n;i++){
                fn[i] = sc.next();
                ln[i] = sc.next();
            }
            for(int i=0;i<n;i++){
                int count = 0;
                for(int j=0;j<n;j++){
                    if(fn[i].equals(fn[j])){
                        count++;
                    }
                }
                if(count ==1){
                    System.out.print(fn[i] );
                    System.out.println();

                }else{
                    System.out.print(fn[i]+" "+ln[i]);
                    System.out.println();

                }
            }

        }

	}

}
