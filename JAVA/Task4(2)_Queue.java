Task 4(2): Basic Exception Handling
===================================
Write a program that attempts to divide by zero, catches the ArithmeticException, and provides a custom error message.

2) Develop a CustomQueue class with methods for Enqueue, Dequeue, Peek, and IsEmpty. Show how your queue can handle different data types by enqueuing strings and integers, then dequeuing and displaying them to confirm FIFO order


import java.util.LinkedList;
class CustomQueue<T> 
    {
    public LinkedList<T> list = new LinkedList<>();

    public void enqueue(T item) 
       {
        list.addLast(item);
      }

    public T dequeue() 
       {
        if (isEmpty()) 
         {
            throw new RuntimeException("Queue is empty, cannot dequeue.");
        }
        return list.removeFirst();
    }

    public T peek() 
        {
        if (isEmpty()) 
          {
            throw new RuntimeException("Queue is empty, cannot peek.");
        }
        return list.getFirst();
    }

    public boolean isEmpty() 
      {
        return list.isEmpty();
    }
    public String toString() 
      {
        return "Queue: " + list.toString();
    }
}

public class QueueDemo 
   {
    public static void main(String[] args) 
     {
        try 
          {
            int result = 10 / 0;
        } 
         catch (ArithmeticException e) 
          {
            System.out.println("Caught an ArithmeticException: Cannot divide by zero.");
        }
        CustomQueue<String> Queue = new CustomQueue<>();
        Queue.enqueue("Hello");
        Queue.enqueue("World");
        CustomQueue<Integer> queue = new CustomQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("String Queue before dequeuing: " + Queue);
        while (!Queue.isEmpty()) 
         {
            System.out.println("Dequeued from string queue: " + Queue.dequeue());
        }
        System.out.println("Integer Queue before dequeuing: " + queue);
        while (!queue.isEmpty()) 
          {
            System.out.println("Dequeued from integer queue: " + queue.dequeue());
        }
    }
}


