
// 2021 dhakne balaji computer engg All Rights Reserved





import java.util.*;

		public class rectangle {

		    public static void main(String[] args) {
		        
		       int length  , width  , area, perimeter;

		        
		        Scanner in = new Scanner(System.in);


		        System.out.print(" Enter length of rectangle: ");
		        length = in.nextInt();
		        System.out.print(" Enter width of rectangle: ");
		        width = in.nextInt();
		        
		        perimeter = 2 * (length + width);

		        area = length * width;

		        
		        System.out.println("/n Perimeter of rectangle is " + perimeter + " units.");
		        System.out.println("\n Area of rectangle is " + area + " sq. units.");
		    }
		}
