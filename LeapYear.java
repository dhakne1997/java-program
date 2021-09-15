//whether a year entered through the keyboard is a leap year or not.



package practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
  int year;

 
 System.out.println("Enter any year: ");
  year=sc.nextInt();

  System.out.printf("%s",(year%4==0) ? 
                  "LEAP YEAR" : (year%400 ==0 ) ? 
                      "LEAP YEAR" : "NON LEAP YEAR");
  sc.close();
	}

}