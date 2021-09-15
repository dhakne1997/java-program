package practice;

import java.util.Scanner;

public class SidesOFTriangle {

public static void main(String[] args) {
	
	   int x, y, z;
	    int max, valid = 0;
	    
	    Scanner sc =new Scanner(System.in);
	    
	   System.out.println("Enter the first side of triangle: ");
	    x=sc.nextInt();
	    System.out.println("Enter the second side of triangle: ");
	    y=sc.nextInt();

	   System.out.println("Enter the third side of triangle: ");
	    z=sc.nextInt();


	    max = x;
	    if(max<y)
	        max=y;

	    if(max<z)
	        max=z;
	   if(max == x && x < (y+z))
	        valid = 1;

	    if(max == y && y < (x+z))
	        valid = 1;

	    if(max == z && z < (x+y))
	        valid = 1;

	if (valid==1)
		 System.out.println("Triangle is valid");
	else
		 System.out.println("Triangle is not valid");
	sc.close();
}
}