package practice;

import java.util.Scanner;

public class Interchange {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
	    int C, D;
	    
	     System.out.println("Enter the value of C: ");
	     C=sc.nextInt();

	     System.out.println("Enter the value of D: ");
	     D=sc.nextInt();

	     C = C+D; 
	     D = C-D;
	     C = C-D; 


	     System.out.println("\n The value of C: "+C);
	     
	    System.out.println("\n The value of D: "+ D);
	     
	    sc.close();
	}
}
