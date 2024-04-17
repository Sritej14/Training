Task 1:
======= 
Data Types/Variables
Write a program that declares two integer variables, swaps their values without using a third variable, and prints the result.

public class Swap{
    public static void main(String[] args) {
        int n = 10;
        int m = 20;
        System.out.println("Before swapping:");
        System.out.println("value of n is:" + n);
        System.out.println("value of m is:" + m);
        n = n + m;
        m = n - m;
        n= n - m;
        System.out.println("\nAfter swapping:");
        System.out.println("value of n is:" + n);
        System.out.println("value of m is:" + m);
    }
}
