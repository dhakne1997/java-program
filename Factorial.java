
//Write a program to find the factorial value of any number entered through the keyboard.




package practice;

import java.util.Scanner;

public class Factorial {



public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);
  int n, i;
   long fact = 1;
  System.out.println("Enter an integer: ");
  n=s.nextInt();

  if (n < 0)
	  System.out.println("Error! Factorial of a negative number doesn't exist.");
  else {
      for (i = 1; i <= n; ++i) {
          fact *= i;
      }
      System.out.println("Factorial of value is = "+fact);
      s.close();
  }

}
}