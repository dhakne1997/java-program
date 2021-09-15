package practice;

import java.util.Scanner;

public class DisplayNu {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
	int num,res = 0;



	System.out.println("Enter any five digit number: "); 
	
	
	num=sc.nextInt();
			
	num= num-res;
	res=num+11111;

	System.out.println("Output is "+res+num);
sc.close();
	}
	
	
}
