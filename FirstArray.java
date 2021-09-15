package practice;

import java.util.Scanner;

public class FirstArray
{
   public static void main(String args[])
   {
   
       int A[] = new int[50];
       int n, i;
       Scanner s = new Scanner(System.in);
	   
       System.out.print(" How Element  Store in Array ? ");
       n = s.nextInt();
	   
       System.out.print("Enter " + n + " Element to Store in Array : ");
       for(i=0; i<n; i++)
       {
           A[i] = s.nextInt();
       }
	   
       System.out.print("Elements in Array is :\n");
       for(i=0; i<n; i++)
       {
           System.out.print(A[i] + "  ");
           
           s.close();
       }
	   
   }
}