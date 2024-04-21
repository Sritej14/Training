Task 9: String Operations
=========================
Write a method that takes two strings, concatenates them, reverses the result, and then extracts the middle substring of the given length. Ensure your method handles edge cases, such as an empty string or a substring length larger than the concatenated string.


public class StringManipulation 
      {
   public static String manipulateStrings(String str1, String str2, int length) 
       {
        String concatenated = str1 + str2;
        StringBuilder reversed = new StringBuilder();
        reversed.append(concatenated);
        reversed = reversed.reverse();
        int middleIndex = reversed.length() / 2;
        length = Math.min(length, reversed.length());
        int startIndex = middleIndex - length / 2;
        int endIndex = startIndex + length;
        return reversed.substring(startIndex, endIndex);
       
     }

      public static void main(String[] args) 
             {
               String str1 = "hello";
               String str2 = "world";
               int length = 3;
               String result = manipulateStrings(str1, str2, length);
               System.out.println("Result: " + result);
    }

}
