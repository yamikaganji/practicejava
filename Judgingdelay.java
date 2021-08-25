package PracticePrograms;

import java.util.Scanner;

public class Judgingdelay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String stc = scanner.nextLine();
		int tc = Integer.parseInt(stc);

        for(int i=0;i<tc;i++) {
        	
        	String N = scanner.nextLine();
        	int n = Integer.parseInt(N);
        	int count = 0;
        	
        	for(int k=0;k<n;k++) {
        		
        		String[] sj = scanner.nextLine().split(" ");
            	
            	int s = Integer.parseInt(sj[0]);
            	int j = Integer.parseInt(sj[1]);
            	
            	int t = j - s;
            	
            	if(t > 5)
            		count++;
        	}
        	
        	System.out.println(count);
        }
	}
		

	}


