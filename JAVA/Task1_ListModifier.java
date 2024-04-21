Task 1: List interface
======================
Implement a method that takes a List as an argument and removes every second element from the list, then prints the resulting list.
   
 import java.util.List;
 import java.util.ArrayList;
 class ListModifier
     {
        public static <Integer> void removeEverySecondElement(List<Integer> list) 
        {
         for (int i = 1; i < list.size(); i++) 
          {
            list.remove(i);
          }
        }
       public static void main(String[] args) 
         {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 10; i++)
             {
               numbers.add(i);
             }
             System.out.println("Original list: " + numbers);
             removeEverySecondElement(numbers);
             System.out.println("After Modifiying the list elements: " + numbers);
        }
    }




