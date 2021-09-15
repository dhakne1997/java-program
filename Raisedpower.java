
		//Two numbers are entered through the keyboard. 
		//Write a program to find the value of one number raised to the power of another.




package practice;

import java.util.Scanner;

public class Raisedpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
   int a, b;
		    double  pnum = 1;
		    
		    Scanner sc =new Scanner(System.in);
		    
		   System.out.println("Enter the value of A :");
		   
		a=sc.nextInt();
		    
		    System.out.println("Enter the value of B :");
		    b=sc.nextInt();
		    if (b > 0)
		    {
		        for (int i = b; i>0; i--)
		            pnum = pnum * a;
		    }
		    else if(b < 0)
		    {
		        for(int i=b; i<0; i++)
		            pnum = pnum/a;
		    }

		    System.out.println("Raised to the Power of %d is"+pnum);

		   
		}
		
	
}
