package PracticePrograms;
import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int n=sc.nextInt();
		    float HRA;
		    float DA;
		    if(n<1500){
		        
		        System.out.println( n + 0.9*n + 0.1*n);
		    }
		    else{
		        
		        System.out.println( n+ 0.98*n + 500);
		        
		    }
		    
		}
		

	}

}
