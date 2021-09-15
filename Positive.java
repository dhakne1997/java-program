package practice;

import java.util.Scanner;

public class Positive {


	public static void main(String args[])
	
	
	{
		
	Scanner sc=new Scanner(System.in);
int num;

System.out.println("\n Enter the any value");

num=sc.nextInt();

if  (num>0)
{ 
System.out.println("possitive");
}

else if  (num < 0)
{ 
System.out.println("Negative");
}


else if  (num ==0)
{ 
System.out.println("nutral");

sc.close();
}
	}
}

