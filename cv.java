package PracticePrograms;

import java.util.Scanner;

public class cv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int x=1; x<=T; x++) {
            int n = sc.nextInt();
            String A = sc.next();
            int count=0;
            for(int i=0; i<n-1; i++) {
                if(!vowel(A.charAt(i)) && vowel(A.charAt(i+1))) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
    public static boolean vowel(char c) {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
            return true;
        }
        else if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
            return true;
        }
        else {
            return false;
        }

	}

}
