Task 2: Operators
=================
Create a program that simulates a simple calculator using command-line arguments to perform and print the result of addition, subtraction, multiplication, and division.

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter the first operand: ");
        double m=a.nextDouble();
        System.out.println("Enter the operators(+,-,*,/):");
        char op =a.next().charAt(0);
        System.out.println("Enter the second operand: ");
        double n= a.nextDouble();
        double result = 0;
        switch (op) 
            {
            case '+':
                result = m + n;
                break;
            case '-':
                result = m - n;
                break;
            case '*':
                result = m * n;
                break;
            case '/':
                if (n == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = m / n;
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
        a.close();
    }
}
