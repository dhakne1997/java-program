package practice;

import java.util.Scanner;

public class SteelGade {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    float h, cc, ts;
    int h_f=0, cc_f=0, ts_f=0; 
    int grade = 0;
    System.out.println("Enter the value of Hardness: ");
  h=sc.nextFloat();

    System.out.println("Enter the value of Carbon Content: ");
    cc=sc.nextFloat();

    System.out.println("Enter the value of Tensile Strength: ");
    ts=sc.nextFloat();
    if (h>50)
        h_f=1;
    if (cc<0.7)
        cc_f=1;
    if (ts>5600)
        ts_f=1;
        
    if(h_f==0 && cc_f==0 && ts_f==0)
        grade = 5;

    if(h_f==1 || cc_f==1 || ts==1)
        grade = 6;

    if(h_f==1 && cc_f==0 && ts_f==1)
        grade = 7;

    if(h_f==0 && cc_f==1 && ts_f==1)
        grade = 8;

    if(h_f==1 && cc_f==1 && ts_f==0)
        grade = 9;

    if(h_f==1 && cc_f==1 && ts_f==1)
        grade = 10;

    System.out.println("The grade of steel is: "+grade);
    sc.close();
}
}