package PracticePrograms;

import java.util.Scanner;

public class Playoffs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	   int t= sc.nextInt();
	    while(t>0){
		 int x = sc.nextInt(); 
	    int y = sc.nextInt(); 
	     int z = sc.nextInt();
	     int m = x + ( z*2 );

if(y>=0 && y<= m )
{
  System.out.println("yes");
}
else
{
System.out.println("no");
}
t-- ;
	}	

	}

}
