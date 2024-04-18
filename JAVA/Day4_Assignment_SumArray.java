Task 6: Understanding Functions through Arrays
==============================================
a) Write a recursive function named SumArray that calculates and returns the sum of elements in an array, demonstarte with example.

import java.util.Scanner;

public class SumArray 
    {
    public static void main(String[] args) 
      {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int numElements = scanner.nextInt();
        int[] array = new int[numElements];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numElements; i++) 
          {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int sum = sumOfArray(array, numElements);
        System.out.println("Sum of array elements: " + sum);
        scanner.close();
    }

    public static int sumOfArray(int[] array, int length) 
      {
        int sum = 0;
        for (int i = 0; i < length; i++) 
          {
            sum += array[i];
        }
        return sum;
    }
}
