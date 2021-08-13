package PracticePrograms;

import java.util.Scanner;

public class Chefland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t-->0){
		        int x1=sc.nextInt(),x2=sc.nextInt(),y1=sc.nextInt(),y2=sc.nextInt(),z1=sc.nextInt(),z2=sc.nextInt();
		        if(x2>=x1 && y2>=y1 )
		    {
		        if(z2<=z1)
		        System.out.println("yes");
		        else
		        System.out.println("no");
		    }
		    else
		    {
		        System.out.println("no");
		    }
		    }
		}
		catch(Exception e){
		    return;
		}

	}

}
