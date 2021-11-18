package PracticePrograms;

import java.util.Scanner;

public class ChefOnIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t!=0)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int x1=sc.nextInt();
		    int y1=sc.nextInt();
		    int d=sc.nextInt();
		    
		    int cal1=x/x1;
		    int cal2=y/y1;
		    
		    if(cal1 >=d && cal2>=d)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    t--;
		}

	}

}
