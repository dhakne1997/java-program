package rectangle;

import java.util.Scanner;

public class distance {

    public static void main(String[] args) {

    int km,m,cm ,mm;
 
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter length in kiloimeters : ");
         km = (int) in.nextDouble();
        

       m = km * 1000;
        cm    = m * 100;
        mm   = cm* 10;
        
        
        System.out.println( " km is equal to " + m + " m");
        System.out.println( " km is equal to " + cm    + " cm");
        System.out.println( " km is equal to " + mm + " mm");
    }
}