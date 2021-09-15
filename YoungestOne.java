package practice;

import java.util.Scanner;

public class YoungestOne {

public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
	int Ram,Shyam,Ajay;
	   System.out.println("Enter the Ages of Ram,Shyam,Ajay=");
	Ram=sc.nextInt();
	Shyam=sc.nextInt();
	Ajay=sc.nextInt();
	
	
	
	if(Ram<Shyam && Ram<Ajay)
	{
		   System.out.println("Ram is youngest");
	}
	if(Shyam<Ram && Shyam<Ajay)
	{
		   System.out.println("Shyam is youngest");
	}
	else if(Ajay<Ram && Ajay<Shyam)
	{
		   System.out.println("Ajay is youngest");
		   sc.close();
	}
}
}