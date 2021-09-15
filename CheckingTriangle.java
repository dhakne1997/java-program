package practice;

import java.util.Scanner;

public class CheckingTriangle {

public static void main(String[] args) {
	
	
	   int angle1, angle2, angle3, sum;
	   
	   Scanner sc =new Scanner(System.in); 

	   System.out.println("Enter three angles of triangle: \n");
	    
	   angle1 =sc.nextInt();
	   angle2 =sc.nextInt();
	   angle3 =sc.nextInt();

	    sum = angle1 + angle2 + angle3; 

	    if(sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) 
	    {
	    	 System.out.println("Triangle is valid.");
	    }
	    else
	    {
	    	 System.out.println("Triangle is not valid.");
	    	 sc.close();
	    }

	   
	}

}
	
	
	
	
	
	
	
	
	
	
	
