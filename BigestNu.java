package practice;

import java.util.Scanner;

public class BigestNu {

	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	    int a, b, c, big ;
	 
	    System.out.println("Enter three numbers : ") ;
	 
	     a=sc.nextInt();
	     b=sc.nextInt();
	     c=sc.nextInt();

	    big = a > b ? (a > c ? a : c) : (b > c ? b : c) ;
	 
	   System.out.println("\nThe biggest number is :"+big);
	   
	   sc.close();
	}


}
