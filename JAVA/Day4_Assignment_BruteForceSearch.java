Task 7a: Array Sorting and Searching
====================================
a) Implement a function called BruteForceSort that sorts an array using the brute force approach. Use this function to sort an array created with InitializeArray.


public class BruteForceSearch 
{
 public static void bubbleSort(int[] arr)
        {
           int n=arr.length;
           for(int i=0;i<n-1;i++)
            {
             for(int j=0;j<n-i-1;j++)
              {
                if(arr[j]>arr[j+1])
              {
                   int t=arr[j];
                   arr[j]=arr[j+1];
                    arr[j+1]=t;
             }
           }
       }
}
    public static void printArray(int[] arr)
        {
         for(int num:arr)
             {
            System.out.print(num+" ");
           }
           System.out.println();
       }
    public static void main(String[] args)
        {
          int arr[]= {5,3,7,1,9,2};
          System.out.println("Array before Sorting");
          printArray(arr);
          bubbleSort(arr);
          System.out.println("Array After Sorting");
          printArray(arr);
}
}

