package codes;
import java.util.Scanner;

public class TQManager {
    static TestQuestion[] questions = new TestQuestion[20];
    int numOfQuestions = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of questions: ");
        int numOfQuestions = sc.nextInt();
        for (int i = 0; i < numOfQuestions; i++) {
            System.out.println("Enter the type of question (Enter 1 for Short Answer, Enter 2 for Long Answer and Enter 3 for MCQ): ");
            int type = sc.nextInt();
            if (type == 1 ) {
                questions[i] = new ShortAnswer();
                questions[i].readQuestion();
                questions[i].tostring();
            } else if (type == 2) {
                questions[i] = new LongAnswer();
                questions[i].readQuestion();
                questions[i].tostring();
            } else if (type == 3) {
                questions[i] = new MCQ();
                questions[i].readQuestion();
                questions[i].tostring();
            }
        }
    }
}
