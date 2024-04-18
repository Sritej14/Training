Task 5: Two-Sum Problem
=======================
a) Given an array of integers, write a program that finds if there are two numbers that add up to a specific target. You may assume that each input would have exactly one solution, and you may not use the same element twice. Optimize the solution for time complexity.

import java.util.*;
public class TwoSum 
   {
    public static void main(String[] args) 
      {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int num = a.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < num; i++)
            arr[i] = a.nextInt();
            System.out.println("Enter the target sum:");
            int target = a.nextInt();
            System.out.println("Pairs with sum equal to " + target + ":");
            for (int i = 0; i < num; i++) 
           {
            for (int j = i + 1; j < num; j++) 
               {
                if (arr[i] + arr[j] == target)
                    System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
}
