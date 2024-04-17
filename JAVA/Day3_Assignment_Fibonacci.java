Task 8b: Advanced Array Operations
=================================
8b) Create a recursive function to find the nth element of a Fibonacci sequence and store the first n elements in an array.
 
 
public class Fibonacci 
   {
    public static int fibonacci(int n) 
       {
        if (n <= 1) 
          {
            return n;
        } 
        else 
          {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) 
       {
        int n = 10; 
        int[] fibonacciSequence = new int[n];
         for (int i = 0; i < n; i++) 
         {
            fibonacciSequence[i] = fibonacci(i);
        }

        System.out.println("First " + n + " elements of Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSequence[i] + " ");
        }
        System.out.println();
        int nth = fibonacci(n-1); 
        System.out.println("The " + n + "th element of Fibonacci sequence: " +nth);
    }
}
