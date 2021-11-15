package PracticePrograms;

import java.util.Scanner;

public class DrunkAlcoholic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt(),result;
            if(n%2==0)
            {
                result = (n/2)*2;
            }
            else
            {
                result = (n/2)*2+3;
            }
            System.out.println(result);
        }

	}

}
