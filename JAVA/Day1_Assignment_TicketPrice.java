2.Ticket Price
==============
You are designing a ticket pricing program for a movie theater. The program should prompt the user for their age and the type of movie they want to watch (e.g., "regular" or "3D"). 
Based on the age and movie type, the program should calculate and output the ticket price according to the following rules:
Regular Movie:
Age < 18: $8
Age >= 18: $12
3D Movie:
Age < 18: $10
Age >= 18: $15

import java.util.Scanner;
class TicketPrice
    {
       public static void main(String[] args) 
      {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter the type of movie (regular/3D): 1 for regular 2 for 3D ");
        int  movie= sc.nextInt();
        int price = 0;

        if (movie==1) 
          {
            if (age < 18) 
            {
                price = 8;
            } 
            else 
            {
                price = 12;
            }
        } 
         else if (movie==2) 
            {
            if (age < 18) 
            {
                price = 10;
            } 
            else 
            {
                price = 15;
            }
        } 
           else 
           {
            System.out.println("Invalid movie type. Please enter 'regular' or '3D'.");
            }

        System.out.println("$" + price);
    }
}


