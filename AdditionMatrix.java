//Write a program in java to find Addition of a matrix.

package practice;

import java.util.Scanner;

public class AdditionMatrix {

public static void main(String[] args) {
	
	  int r, c, i, j;
	    Scanner sc =new Scanner(System.in); 

	    System.out.println("\n Enter the number of rows and columns of matrix\n");
	   r=sc.nextInt(); 
	   
	   c=sc.nextInt();
	   
	
	 
	   int A[][] = new int[r][c];
	   int B[][] = new int[r][c];
	   int sub[][] = new int[r][c];
	   
	   System.out.println("\n Enter the elements of first :A matrix\n");
	   
	   for (i = 0; i < r; i++)
	      for (j = 0; j<c;j++)
	       A[i][j]=sc.nextInt();
	 
	   System.out.println("\n Enter the elements of second :B matrix\n");
	 
	    for (i = 0; i < r; i++)
	    {
	      for (j = 0; j < c;j++)
	      {
	    	  B[i][j]=sc.nextInt();	   
	      }
	    }
	    
	    
	    
	    System.out.println("The elements of the matrix A") ;
		for(i = 0; i < r; i++)
		{
			for(j = 0;j<c;j++)
			{
				System.out.print(A[i][j]+"\t");
			}
	      System.out.println(""); 
			}
	    
	    
		System.out.println("The elements of the matrix B") ;
		for(i = 0; i < r; i++)
		{
			for(j = 0;j<c;j++)
			{
				System.out.print(B[i][j]+"\t");
			}
	      System.out.println(""); 
			}
	    
	    
	    
	    
	    
	    
	   
	    for (i = 0; i<r; i++)
	 
		
	      for (j = 0;j<c;j++)
	      	
	         sub[i][j] = A[i][j]+B[i][j];
	         
	         System.out.println("\n Sub of entered matrices:\n");
	         
	         for (i = 0; i < r; i++)
	         {
	   	      for (j = 0; j<c;j++)
	   	      {
	         System.out.print(sub[i][j]+"\t");
	   	      }
		      System.out.println(""); 
	         }
	     
	     
	   
	}

}




	
	
	
	
	
	
	
	
	

