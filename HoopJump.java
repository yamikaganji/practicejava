package PracticePrograms;

import java.util.Scanner;

public class HoopJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    int N= sc.nextInt();
		    int x= (N/2)+1;
		    System.out.println(x);
		}

	}

}
