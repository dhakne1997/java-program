	//Write a program in java to find transpose of a given matrix.


package practice;

import java.util.Scanner;

public class TransposeMatrix {

public static void main(String[] args) {
	

	 int i,j,r,c;
	
	 Scanner sc =new Scanner(System.in); 

	    System.out.println("\n Enter the number of rows and columns of matrix");
	   r=sc.nextInt(); 
	   
	   c=sc.nextInt();
	
	
	   int A[][] = new int[r][c];
	   int T[][] = new int[r][c];
	   int T1[][] = new int[r][c];
	   int m[][]=new int[r][c];
	   
	   
	   
	   System.out.println("Enter a matrix of size :-\n");
		  for(i=0;i<r;i++)
		    {
		     for(j=0;j<c;j++)
		     {
		     m[i][j]=sc.nextInt();
		    }
		    }
		  
	   
		  System.out.println("Enter a matrix A of size :-\n");
		  for(i=0;i<r;i++)
		    {
		     for(j=0;j<c;j++)
		     {
		     A[i][j]=sc.nextInt();
		    }
		    }
		  
	   
	   
	   
	   
	   
	   System.out.println("\n The elements of the matrix ") ;
		for(i = 0; i < r; i++)
		{
			for(j = 0;j<c;j++)
			{
				System.out.print(m[i][j]+"\t");
			}
	      System.out.println(""); 
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
	
	
	
			
			for(i=0;i<r;i++)
		    {
		        for(j=0;j<c;j++)
		        {
		            T[j][i]=m[i][j];
		        }
		    }

	

			for(i=0;i<r;i++)
		    {
		        for(j=0;j<c;j++)
		        {
		            T1[j][i]=A[i][j];
		        }
		    }

			
			
			
			 System.out.println(" Transpose matrix is :");
			 	for(i=0;i<r;i++)
			    {
			     for(j=0;j<c;j++)
			     {
				 
			      
			  
			      	System.out.print(T[i][j]+" ");
			     }
			  System.out.println("");
			    }
				 sc.close();
			       
			
			    	      




System.out.println(" Transpose matrix A is :");
	for(i=0;i<r;i++)
{
 for(j=0;j<c;j++)
 {
 
  

  	System.out.print(T1[i][j]+" ");
 }
System.out.println("");
}
 sc.close();
}        
} 
	      



	




