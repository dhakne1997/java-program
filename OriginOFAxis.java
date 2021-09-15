package practice;

import java.util.Scanner;

public class OriginOFAxis {

public static void main(String[] args) {
	

	
	    int x1, y1;
	    Scanner sc =new Scanner(System.in); 
	    
	    System.out.println("Enter the co-ordinates of point: ");
	    
	    x1=sc.nextInt();
	    	    y1=sc.nextInt();

	    if(x1 == 0 && y1 !=0)
	    	  System.out.println("Point  lies on y-axis"+x1+y1);
	    else if (x1 !=0 && y1 == 0)
	    	  System.out.println("Point lies on x-axis"+x1+y1);
	    else if (x1 == 0 && y1 == 0)
	    	  System.out.println("Point lies on the origin"+x1+y1);
	    else
	    	  System.out.println("Point  neither lie on x-axis nor on y-axis:" +x1 + y1);
	  sc.close();
	}
}
