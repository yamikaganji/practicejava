package PracticePrograms;
import java.util.Scanner;



public class AdaSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		while(testcases-->0)
		{
		    int A = sc.nextInt(), B = sc.nextInt();
		    if(A%2!=0 && B%2!=0)
		    {
		        System.out.println("NO");
		    }
		    else
		    {
		        System.out.println("YES");
		    }
		}

	}

}
