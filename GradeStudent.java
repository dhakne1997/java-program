package practice;

import java.util.Scanner;

public class GradeStudent {
	public static void main(String[] args) {
		


	float m1,m2,m3,m4,per;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("\n Enter the marks of students:");



	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	m4=sc.nextInt();
	
	per=m1+m2+m3+m4/5;


	if(per >=70)
	{
	System.out.println("grade:A");


	}

	else if(per <60 &per>=65)
	{
		System.out.println("grade:B");

	}

	else if(per <45 &per>=60)
	{
		System.out.println("grade:B");

	}


	else if(per <60 &per>=65)
	{
		System.out.println("grade:B");

	}



	else if(per <35 &per>=45)
	{
		System.out.println("grade:C");

	}


	else if(per <=35)
	{
		System.out.println("Fail");

	}


}

	}
