Task 7b: Array Sorting and Searching
====================================
b) Write a function named PerformLinearSearch that searches for a specific element in an array and returns the index of the element if found or -1 if not found.
 

import java.util.Arrays;
public class ArraySortingSearching
   {
    public static int Search(int[] array, int target) 
      {
        Arrays.sort(array); 
        System.out.println("Sorted Array:"+Arrays.toString(array));
        for (int i = 0; i < array.length; i++) 
            {
                if (array[i] > target) 
                {
                 break;
                 }
                if (array[i] == target) 
                 {
                return i;
               }
            }
              return -1;
        }

    public static void main(String[] args) 
       {
        int[] array = {5, 10, 15, 20, 25};
        int target = 15;
        int result = Search(array, target);
        if (result != -1) 
           {
            System.out.println("Element " + target + " found at index: " + result);
           } 
        else 
           {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}

