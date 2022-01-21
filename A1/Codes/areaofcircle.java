package learning;

import java.util.Scanner;

public class areaofcircle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.print("Enter the radius of  = ");
            Scanner sn = new Scanner(System.in);
            Double radius = sn.nextDouble();
            Double area = 3.14*radius*radius;
            System.out.print("Area of circle is = " + area);
	}
}
