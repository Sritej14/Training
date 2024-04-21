Task 4(1): Basic Exception Handling
================================
Write a program that attempts to divide by zero, catches the ArithmeticException, and provides a custom error message.
1) Create a CustomStack class with operations Push, Pop, Peek, and IsEmpty. Demonstrate its LIFO behavior by pushing integers onto the stack, then popping and displaying them until the stack is empty.


import java.util.LinkedList;
class CustomStack 
     {
    public LinkedList<Integer> list = new LinkedList<>();

    public void push(int value) 
     {
        list.addFirst(value);
    }

    public int pop() 
       {
        if (isEmpty()) 
        {
            throw new RuntimeException("Pop attempted on an empty stack");
        }
        return list.removeFirst();
    }

    public int peek() 
                {
        if (isEmpty()) 
          {
            throw new RuntimeException("Peek attempted on an empty stack");
          }
        return list.getFirst();
       }

    public boolean isEmpty() 
      {
        return list.isEmpty();
       }
    public String toString()
            {
              return "Stack: "+ list.toString();
           }
}

public class main
      {
       public static void main(String[] args) 
            {
             try 
                {
                  int result = 10 / 0;
                } 
         catch (ArithmeticException e) 
                   {
                    System.out.println("Error: Cannot divide by zero.");
                    }
                       System.out.println("Demonstrating CustomStack operations:");
                       CustomStack stack = new CustomStack();
                       stack.push(10);
                       stack.push(20);
                       stack.push(30);
                       System.out.println("Pushed in Stack:" +stack);
                       System.out.println("Popping from stack:");
        while (!stack.isEmpty()) 
             {
            System.out.println(stack.pop());
           }
    }
}