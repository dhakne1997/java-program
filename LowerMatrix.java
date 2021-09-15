//Write a program in java to print or display Lower triangular matrix.

package practice;

import java.util.Scanner;

public class LowerMatrix {

public static void main(String[] args) {
	

	    int i,j,r,c;
	     Scanner sc =new Scanner(System.in); 

		    System.out.println("\n Enter the number of rows and columns of matrix\n");
		   r=sc.nextInt(); 
		   
		   c=sc.nextInt();
		   
		   
		   
		   int m[][]=new int[r][c];
		   
		   
		   
	   System.out.println("Enter a matrix of size :-\n");
	  for(i=0;i<r;i++)
	    {
	     for(j=0;j<c;j++)
	     {
	     m[i][j]=sc.nextInt();
	    }
	    }
	  
	  
	  
	  
	  System.out.println("The elements of the matrix") ;
		for(i = 0; i < r; i++)
		{
			for(j = 0;j<c;j++)
			{
				System.out.print(m[i][j]+"\t");
			}
	      System.out.println(""); 
			}
	  
	  
	  
	  
	  
	  
 	 System.out.println("Upper triangular matrix is as follows:");
 	for(i=0;i<r;i++)
    {
     for(j=0;j<c;j++)
     {
	  if(i<=j)
      	System.out.print("0 ");
      else
      	System.out.print(m[i][j]+" ");
     }
  System.out.println();
    }
	 sc.close();
}        
} 
    	      



	
	
