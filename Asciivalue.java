package practice;

import java.util.Scanner;

public class Asciivalue {

	public static void main(String args[])
	{
		
	Scanner sc=new Scanner(System.in);
	
	
	int count;  
	  
    for(count = 0; count <= 255; count++)  
    {  
        System.out.println("ASCII value of %c is %d\n"+count);  
        sc.close();
    }  
	}
}
