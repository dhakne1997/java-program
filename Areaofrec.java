package practice;

import java.util.Scanner;

public class Areaofrec
{
    	public static void main( String[] args ) 
    	{
		Scanner reader = new Scanner(System.in);
	
		int length, breadth, perimeter, area;
		System.out.print("\nEnter length and breadth:\n");
		length = reader.nextInt();
		breadth = reader.nextInt();
	
		area = length*breadth;
		perimeter = 2 * (length + breadth);
	
		System.out.print("Area is : " + area);
		System.out.print("\nPerimeter is : " + perimeter);
	
		if (area>perimeter)
			System.out.print("\nArea is greater than perimeter");
		else if (perimeter<area)
			System.out.print("Area is lesser than perimeter");
		else
			System.out.print("Area and perimeter are equal");
		
		reader.close();
    	}

}