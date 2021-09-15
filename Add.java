package practice;

import java.util.Scanner;

public class Add {
	
		
		Scanner s = new Scanner(System.in);
		
		int n;

		static int c;
		
		{	
		System.out.println("Enter 1st Array elments:");
		n = s.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter 2nd Array elments:");
		n = s.nextInt();
		int b[] = new int[n];
		
        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();
            b[i] = s.nextInt();

            int c = (int) (a[i] + b[i]);

        }
		}
	
		public static void main(String[] args) {
	
		
	System.out.println("Sum of Array is: "   + c);
	
	}

}