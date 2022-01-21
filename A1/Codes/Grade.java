package learning;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the marks  = ");
        Scanner sn1 = new Scanner(System.in);
        int marks = sn1.nextInt();
        String grade = null;
        switch(marks/10) {
        
        case 10:
        case 9:
           grade = "S";
           break;
        case 8:
           grade = "A";
           break;
        case 7:
           grade = "B";
           break;
        case 6:
           grade = "C";
           break;
        case 5:
           grade = "D";
           break;
        case 4:
            grade = "E";
            break;
        default:
           grade = "F";
           break;
      }
        System.out.println("Grade = " + grade);
	}
}
