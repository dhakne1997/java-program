package practice;

import java.util.Scanner;

public class PowerOfNu {

	public static void main(String[] args) {
		
	
		
		  int a, b, c, x;
Scanner sc =new Scanner(System.in);
System.out.println("\n Enter the value of a: ");
		   
		    a=sc.nextInt();
		    System.out.println("\n Enter the value of b: ");
		    b=sc.nextInt();
		    c = 1;
		    x = b;
		    while(b!=0)
		    {
		        c = c * a;
		        b = b - 1;
		    }
		    System.out.println("\n raised to the power "+c);
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}