
//Write a program to find the Binary equivalent of the entered number

package practice;

import java.util.Scanner;

public class Binaryequivalent {
	public static void main(String[] args) {
		
	
		int n,a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Decimal Number:");
        n = s.nextInt();
        while(n > 0)
        {
             a = n % 2;
            x = a + x;
            n = n / 2;
        }
        System.out.println("Binary of Given Number is="+x);
        s.close();
    }
}
	


