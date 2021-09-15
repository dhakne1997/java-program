package practice;

import java.util.Scanner;

public class StraightLine {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		{
 int x1, y1, x2, y2, x3, y3;
  double ab, bc, ac, abc;

System.out.println("Enter the co-ordinates of first point(X1, Y1)=");
x1=sc.nextInt();
y1=sc.nextInt();
System.out.println("Enter the co-ordinates of second point (X2, Y2)= ");
 x2=sc.nextInt();
 y2=sc.nextInt();
 
System.out.println("Enter the co-ordinates of third point (X3, Y3)= ");
  x3=sc.nextInt();
  y3=sc.nextInt();

  ab = sqrt(pow(x2-x1,2)+pow(y2-y1,2));
  bc = sqrt(pow(x3-x2,2)+pow(y3-y2,2));
  ac = sqrt(pow(x3-x1,2)+pow(y3-y1,2));

  System.out.println("ab: %f\t bc: %f\t ac: %f\n"+ab+bc+ac);
  abc = ab+bc;
  if(abc==ac)
  {
     System.out.println("ab + bc = ac\n"+abc);
System.out.println("All the three points fall on one straight line");
  }
  else
System.out.println("All the three points are not present on one straight line");

  sc.close();

}
	}
	private static double sqrt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int pow(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}
