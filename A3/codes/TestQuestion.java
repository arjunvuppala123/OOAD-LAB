package codes;
import java.util.Scanner;

abstract class TestQuestion{
    String question;
    abstract void readQuestion();
    abstract void tostring();
}

class ShortAnswer extends TestQuestion{
    int numLines = 1;
    void readQuestion(){
        Scanner sc= new Scanner(System.in);  
        System.out.println("Enter the question: ");
        question = sc.nextLine();  
        numLines = 1;
    }
    void tostring(){
        System.out.println("Question: " + question);
    }
}

class LongAnswer extends TestQuestion{
    int numLines;
    void readQuestion(){
        Scanner sc= new Scanner(System.in);  
        System.out.println("Enter the question: ");
        question = sc.nextLine();  
        Scanner sc1 = new Scanner(System.in);  
        System.out.println("Enter the number of Lines: ");
        numLines = sc1.nextInt(); 
    }
    void tostring(){
        System.out.println("Question: " + question);
        System.out.println("Number of Lines: " + numLines);
    }
}

class MCQ extends TestQuestion{
    int numOfChoices;
    String[] choices = new String[4];
    void readQuestion(){
        Scanner sc= new Scanner(System.in);  
        System.out.println("Enter the question: ");
        question = sc.nextLine();  
        Scanner sc1 = new Scanner(System.in);  
        System.out.println("Enter the number of choices: ");
        numOfChoices = sc1.nextInt(); 
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Please enter mcq choices: ");
        for (int i = 0; i < numOfChoices; i++) {
            choices[i] = sc3.nextLine();
        }
    }
    void tostring(){
        System.out.println("Question: " + question);
        System.out.println("Number of Choices: " + numOfChoices);
        for (int i = 0; i < numOfChoices; i++) {
            System.out.println("Choice " + (i+1) + ": " + choices[i]);
        }
    }
}