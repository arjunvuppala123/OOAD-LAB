package learning;
import java.util.Scanner;
public class slopeintercept {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter y1  = ");
        Scanner sn1 = new Scanner(System.in);
        float y1 = sn1.nextInt();
        
        System.out.print("Enter y2  = ");
        Scanner sn2 = new Scanner(System.in);
        float y2 = sn2.nextInt();
        
        System.out.print("Enter x1  = ");
        Scanner sn3 = new Scanner(System.in);
        float x1 = sn3.nextInt();
        
        System.out.print("Enter x2  = ");
        Scanner sn4 = new Scanner(System.in);
        float x2 = sn4.nextInt();
		
        if (x1 == x2)
        	System.out.print("Slope is infinity");
        else {
        	float slope = (y2-y1)/(x2-x1);
        	float intercept = y1 - (slope*x1);
        	System.out.println("Slope of line is = "+slope);
        	System.out.println("Intercept of line is = "+ intercept);
        }
	}
}
