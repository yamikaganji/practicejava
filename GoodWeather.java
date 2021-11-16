package PracticePrograms;

import java.util.Scanner;

public class GoodWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int sunny = 0 , rainy = 0;
		    for(int i = 1 ; i <= 7 ; i++){
		        int input = sc.nextInt();
		        if(input == 1){
		            sunny++;
		        }else{
		            rainy++;
		        }
		    }
		    System.out.println(sunny > rainy ? "YES" : "NO");
		}
		sc.close();
	

	}

}
