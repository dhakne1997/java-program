package practice;

import java.util.Scanner;

public class ApperStudent {
public static void main(String[] args) {
	
	
	int pera,perb;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter percentage of A and B: ");
	pera=sc.nextInt();
	perb=sc.nextInt();

	if(pera>=55&&perb>=45)
		System.out.println("\n Student is passed");

	else if(pera>=45&&pera<55&&perb>=55)
		System.out.println("\n Student is passed");

	else if(perb<45&&pera>=65)
		System.out.println("Student is allowed to reappear in an exam");

	else
		System.out.println("Student is failed");

	sc.close();
}
}
