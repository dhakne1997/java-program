
//Write a program to find the range of a set of numbers. Range is the difference between the smallest and biggest number in the list.




package practice;

import java.util.Scanner;

public class RangeDiffernce {

public static void main(String[] args) {
	




	int i,num,max,min, how, range;
	
	@SuppressWarnings("resource")
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter how many number you want to enter : ");
	how=sc.nextInt();
	
	System.out.println("\n Enter the number : ");
	num=sc.nextInt();
	
	max=min=num;
	
	for( i = 1; i < how; i++)
	{
		System.out.println("\n Enter the number : ");
		num=sc.nextInt();
		if(num>max)
			max=num;
		if(num<min)
			min=num;
	}
	range = max - min;
	
	System.out.println("\n is the range of the data ="+range);
	sc.close();
}
}
