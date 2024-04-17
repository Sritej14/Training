1.Grade Calculator
==================
1. You are tasked with creating a grade calculator program. The program should take a student's score as input and output their corresponding grade based on the following criteria:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: Below 60
Ensure that if the input score is not within the range of 0 to 100, the program outputs an error message.

import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();
 
        if (score < 0 || score > 100) {
            System.out.println("Error: Score must be between 0 and 100.");
        } else {
            if (score >= 90 && score<=100) 
              {
                System.out.println("Grade A");
              } 
            else if (score >= 80 && score<=89) 
              {
                System.out.println("Grade B");
            } 
            else if (score >= 70 && score<=79) 
            {
                System.out.println("Grade C");
            } 
            else if (score >= 60) 
            {
                System.out.println("Grade D");
            } 
             else 
             {
                System.out.println("Grade F");
            }
        scanner.close();
    }
}
}








