package PracticePrograms;

import java.util.Scanner;

public class Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ItemNum[]= {101,102,103,104};
		String ItemName[]= new String[105];
		ItemName[101]="milk";
		ItemName[102]="ghee";
		ItemName[103]="oil";
		ItemName[104]="coffe powder";
		int stock[]= new int[105];
		stock[101]=20;
		stock[102]=22;
		stock[103]=32;
		stock[104]=21;
		int Price[]= new int[105];
		Price[101]=2;
		Price[102]=3;
		Price[103]=4;
		Price[104]=5;
		System.out.println("enter the item number:");
		int ino=sc.nextInt();
		System.out.println("enter the quantity:");
		int Qty=sc.nextInt();
		int total=0;
		if(stock[ino]>=Qty)
		{
			total=Price[ino]*Qty;
			System.out.println("total amount is:"+total);
			stock[ino]=stock[ino]-Qty;
			System.out.println("the available stock is:"+stock[ino]);
		}
		if(stock[ino]<Qty)
		{
			System.out.println(ItemName[ino]+"no stock");
			System.out.println(stock[ino]+"are available"+ItemName[ino]);
		}
		
	}

}
