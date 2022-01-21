/**
 * 
 */
package learning;
import java.util.Scanner;

public class greaterofthreenums {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first number  = ");
        Scanner sn1 = new Scanner(System.in);
        int num1 = sn1.nextInt();
        
        System.out.print("Enter the second number  = ");
        Scanner sn2 = new Scanner(System.in);
        int num2 = sn2.nextInt();
        
        System.out.print("Enter the third number = ");
        Scanner sn3 = new Scanner(System.in);
        int num3 = sn3.nextInt();
		
	    if( num1 >= num2 && num1 >= num3)
	    	System.out.println(num1+" is the largest Number");

	    else if (num2 >= num1 && num2 >= num3)
	    	System.out.println(num2+" is the largest Number");

	    else
	    	System.out.println(num3+" is the largest Number");
	}

}
