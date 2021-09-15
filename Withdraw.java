package practice;

import java.util.Scanner;

public class Withdraw {
	
	public static void main(String args[])
	{
		
		Scanner sc =new Scanner(System.in);

	
	
	int amount;
	
		System.out.println("Please input amount for withdraw : ");
		amount=sc.nextInt();

		
		System.out.println("\n\nRequired notes of Rs. 100  : "+amount / 100);
		System.out.println("\n\nRequired notes of Rs. 50   : "+(amount % 100) / 50);
		System.out.println("\n\nRequired notes of Rs. 10   : "+(((amount % 100) % 50) / 10));
		System.out.println("\n\nAmount still remaining Rs. : "+(((amount % 100) % 50) % 10));
	sc.close();
	}
	
}
