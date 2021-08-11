package practice;

import java.util.Scanner;

public class Interist  
{  
  public static void main (String args[])  
  
   {  
	  Scanner sc = new Scanner(System.in);
	  
	  
	  float p, r,  t,  si; // principal amount, rate, time and simple interest respectively  

	  System.out.println("Enter the profit \t loss \t time : "); 
	  
	 p = sc.nextFloat();
	 
	 r = sc.nextFloat();
	 
	 
	t = sc.nextFloat();
              si  = (p*r*t)/100;   
             System.out.println("Simple Interest is: " +si);  
             
             sc.close();
   }}  