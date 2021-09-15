package practice;

import java.util.Scanner;

public class SwitchAddition {

	public static void main(String[] args) {
		
	
	
	int a,b,c,sub,sum,mul,div;

Scanner sc=new Scanner(System.in);


System.out.println( "\n Enter the choise:"
		+ "1.Addition"+ "2.Subtraction"+"3.Multiplication"+"4.Division");





	c=sc.nextInt();
	 switch(c)


	{
	 case 1:
		 System.out.println("\n Enter the addition of two nu:");

	a=sc.nextInt();
	b=sc.nextInt();

	sum= a +b;

	System.out.println("Sum:"+sum);

	break;

	case 2:
		System.out.println("\n Enter the subtraction  of two nu:");

		a=sc.nextInt();
		b=sc.nextInt();

	sub= a - b;

	System.out.println("\n sub="+sub);

	break;



	case 3:
		System.out.println("\n Enter the multiplication   of two nu:");

		a=sc.nextInt();
		b=sc.nextInt();

	mul= a * b;

	System.out.println("\n mul="+mul);

	break;



	case 4:
		System.out.println("\n Enter the division  of two nu:");

		a=sc.nextInt();
		b=sc.nextInt();

	div= a / b;

	System.out.println("\n div="+div);
	sc.close();

	break;




	default:

		System.out.println("\n  wrong choise:");
	}
	}

}

