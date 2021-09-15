package practice;

import java.util.Scanner;

public class InsideCircle {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
  int x1, y1, x2, y2, radius;
  float pc;

  System.out.println("Enter the center co-ordinates of the circle: ");
  x1=s.nextInt(); 
  y1=s.nextInt(); 
  System.out.println("Enter the radius of the circle: ");
  radius=s.nextInt();

  System.out.println("Enter the point co-ordinates: ");
 x2=s.nextInt();
 y2=s.nextInt();

  pc = sqrt(pow(x2-x1, 2)+pow(y2-y1,2));

  if(pc>radius)
	  System.out.println("Point (%d,%d) lies outside the circle."+x2+y2);
  else if(pc<radius)
	  System.out.println("Point (%d,%d) lies inside the circle."+x2+y2);
  else if(pc==radius)
	  System.out.println("Point (%d,%d) lies on the boundary of circle."+x2+y2);
  else
	  System.out.println("Wrong Entry");
	}

	private static float sqrt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int pow(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}
