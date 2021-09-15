
//Write a program to find the octal equivalent of the entered number

package practice;

import java.util.Scanner;

public class OctalEquivalent {

	public static void main(String[] args) {
		
		

   int num, oct = 0, rem = 0, place = 1;  
		  
   do
   {
   Scanner sc =new Scanner(System.in);
   
		   System.out.println("Enter a decimal number\n");  
		    num=sc.nextInt();  
		  
		    System.out.println("\nOctal Equivalent of  is: "+num);  
   }
		    while(num<num) ; 
		    {  
		        rem = num % 8;  
		        oct = oct + rem * place;  
		        num = num / 8;  
		        place = place * 10;  
		    }  
		    System.out.println("\n"+oct);  
		  
	
		
	
	
	
	
   }
	
	
	
	}


