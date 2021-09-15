package practice;

import java.util.Scanner;

public class AbsuluteValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int n, num;
    System.out.println("Enter a number: ");
    
 n=sc.nextInt();
    num = n;
    
    if(num<0)
    {
        num = (-1)*num;
    }
    
    System.out.println("The absolute value of %d is %d"+n+num);
    sc.close();
	}
}
