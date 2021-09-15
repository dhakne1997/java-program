/*
Write a class Addition2 with add method (overloading) using varargs and enhanced for
loop
*/

package lab3;

public class AdditionVarg {



    public int sumNumber(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }

    public static void main( String[] args ) {
    	AdditionVarg add = new AdditionVarg();

        int sum2 =add.sumNumber(2, 4);
        System.out.println("sum2 = " + sum2);

        int sum3 = add.sumNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3);

        int sum4 = add.sumNumber(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);
    }
}