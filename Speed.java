package practice;

import java.util.Scanner;

public class Speed
{
	public static void main(String args[])
	
	{
		int km,m,cm,mm;
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the distace of kilometer");



km=sc.nextInt();

m =(km*1000);
 cm =(m*100);
 mm =(cm*10);

 
System.out.printf("\n  distance in meter  "+m );

System.out.printf("\n distance in centimeter "+cm);

System.out.printf("\n distance in milimeter "+mm);

sc.close();
 }
 
}