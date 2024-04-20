Task 4: Arrays - Declaration, Initialization, and Usage
========================================================    
Create a program that declares an array of integers, initializes it with consecutive numbers, and prints the array in reverse order.

import java.util.*;
import java.util.Scanner;
public class ReverseofArray {
    public static void main(String[] args) 
      {
        int[] num= new int[4];
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the elements");
        for (int i = 0; i < num.length ; i++) {
            num[i] = a.nextInt();
        }

        
        System.out.println("Original Array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("\n Array in Reverse Order:");
        for (int i = num.length - 1; i >= 0; i--) 
         {
            System.out.print(num[i] + " ");
        }
              a.close();
    }
}
