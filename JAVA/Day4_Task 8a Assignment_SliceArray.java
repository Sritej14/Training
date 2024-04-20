Task 8a: Advanced Array Operations
=================================
a)  Implement a method SliceArray that takes an array, a starting index, and an end index, 
then returns a new array containing the elements from the start to the end index

 import java.util.Arrays;
 public class SliceArray {
    public static int[] SliceArray(int[] arr, int start, int end) 
        {
        if (start < 0 || end >= arr.length || start > end) 
         {
            throw new IllegalArgumentException("Invalid start or end index");
         }
          int length = end - start + 1;
          int[] slicedArray = new int[length];
          System.arraycopy(arr, start, slicedArray, 0, length);
          return slicedArray;
       }
 public static void main(String[] args) 
       {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 2;
        int end = 6;
        int[] slicedArray = SliceArray(arr, start, end);
        System.out.println("The New Array elements from start to end:"+Arrays.toString(slicedArray)); 
    }
}
