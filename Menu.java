package PracticePrograms;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("coffee \n 1.espresoocoffee \n 2.cappuchino coffee \n 3.Lotte coffee");
		System.out.println("Tea \n 1.plain tea \n 2.Assam tea \n 3.Ginger tea \n 4.cardamon tea \n 5.masala tea \n 6.lemon tea \n 7.Green tea \n 8.organic darjeeling tea");
		System.out.println("Soups \n 1. Hot and sour soup\n 2. veg corn soup \n 3. Tomato soup \n 4. Spicy tomato soup");
		System.out.println("Beverages \n 1.Hot choclate Drink\n 2.Badam Drink\n 3.Badam -Pista drink");
		String[] C= {"Espressoocoffee","Cappuchinocoffee","Lotte coffee"};
		String[] T= {"plai tea","Assam tea","ginger tea","Cardamon tea","masala tea","lemon tea","green tea","organic darjling tea"};
		String[] S= {"Hot and sour Soup","veg corn soup","Tomato soup","spicy tomato soup"};
		String[] B= {"Hot chocolate Drink","Badam Drink","Badam-pistha Drink"};
		System.out.println("enter the first letter of main menu  in capitals to choose a item:");
		Scanner sc=new Scanner(System.in);
		char op=sc.nextLine().charAt(0);
		System.out.println("enter the number tochoose sub menu:");
		int  o=sc.nextInt();
		int i;
		if(op=='C')
		{
			for( i=0;i<3;i++)
			{
				if(o==i+1)
				{
					System.out.println("Welcome to CCD! \n Enjoy your"+C[i]);
					break;
				}
			}
			if(i==3)
			{
				System.out.println("Invalid input");
			}
		}
		if(op=='T')
		{
			for( i=0;i<8;i++)
			{
				if(o==i+1)
				{
					System.out.println("Welcom to CCD!\n Enjoy your"+T[i]);
					break;
				}
			}
			if(i==8)
			{
				System.out.println("Invalid input");
			}
			
		}
		if(op=='S')
		{
			for( i=0;i<4;i++)
			{
				if(o==i+1)
				{
					System.out.println("Welcome to CCD!\n Enjoy your"+S[i]);
					break;
				}
			}
			if(i==4)
			{
				System.out.println("Invalid input");
			}
		}
		if(op=='B')
		{
			for( i=0;i<3;i++)
			{
				if(o==i+1)
				{
					System.out.println("Welcome to CCD! \n Enjoy your"+B[i]);
					break;
				}
			}
			if(i==3)
			{
				System.out.println("invalid input");
			}
		}
	}
	

}
