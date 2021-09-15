package practice;

import java.util.Scanner;

public class ReverseNu {

public static void main(String[] args) {
	

   int num,a,b,c,d,reverse,d1,d2,d3,d4,d5;
   
   Scanner sc=new Scanner(System.in);
   
	   System.out.println("Enter a 5 digit number\n");
	    
	  num=sc.nextInt();

	    a=num/10;
	    d5=num%10;

	    b=a/10;
	    d4=a%10;

	    c=b/10;
	    d3=b%10;

	    d=c/10;
	    d2=c%10;

	    d1=d%10;

	    reverse=d5*10000 + d4*1000 + d3*100 + d2*10 + d1*1;
	    System.out.println("\n Reverse number of is \n"+reverse);
	    

	    if (num==reverse)
	    	System.out.println("Both the numbers are equal");
	    else
	    	System.out.println("Both the numbers are not equal");
	
	    sc.close();
}
}