
//Write a program in java to find sum of  diagonals of a matrix.

package practice;

import java.util.Scanner;

public class DiangonalMatrix {

public static void main(String[] args) {
	
	int i, j , r, c,  Sum = 0;
	Scanner sc =new Scanner(System.in); 
	System.out.println("\n Please Enter Number of rows and columns  :  ");
	r=sc.nextInt();
	  c=sc.nextInt();

	   int A[][] = new int[r][c];
	  
	  
	System.out.println("\n Please Enter the Matrix Elements \n");
	for(i = 0; i < r; i++)
	{
		for(j = 0;j<c;j++)
		{	
			A[i][j]=sc.nextInt();
			  
		}
	}
	
	System.out.println("The elements of the matrix") ;
	for(i = 0; i < r; i++)
	{
		for(j = 0;j<c;j++)
		{
			System.out.print(A[i][j]+"\t");
		}
      System.out.println(""); 
		}
	
    
    	  
  
	for(i = 0; i < r; i++)
	{
		for(j = 0;j<c;j++)
		{	
	 if(i==j)
	 {
		 Sum = Sum + A[i][i];
		}
	}
}
	System.out.println("\n The Sum of Diagonal Elements of a Matrix ="+Sum );
	
	 
}
}