import java.util.Scanner; // Needed for the Scanner class

/**
 *  This program demonstrates switch statement.
 */
public class Main
{
   public static void main(String[] args)
   {
      int day;    // to hold day value

      // Create a Scanner object for keyboard input.
      Scanner console = new Scanner(System.in);

      // Get day.
      System.out.print("Enter number 1-7 : ");
      day = console.nextInt();

      // Determine the corresponding week's day
      switch (day)
      {
      case 1 :
         System.out.println("Sunday");

         break;

      case 2 :
         System.out.println("Monday");

         break;

      case 3 :
         System.out.println("Tuesday");

         break;

      case 4 :
         System.out.println("Wednesday");

         break;

      case 5 :
         System.out.println("Thursday");

         break;

      case 6 :
         System.out.println("Friday");

         break;

      case 7 :
         System.out.println("Saturday");

         break;

      default :
         System.out.println("Invalid input");
      }
   }
} 

import java.util.Scanner;    // Needed for the Scanner class

/**
 * This program demonstrates the switch statement.
 */
public class Main
{
   public static void main(String[] args)
   {
      char choice;    // To store the user's choice

      // Create a Scanner object to read input.
      Scanner console = new Scanner(System.in);

      // Ask the user to enter y or n.
      System.out.print("Enter Y or N: ");
      choice = console.next().charAt(0);

      // Determine which character the user entered.
      switch (choice)
      {
      case 'Y' :
      case 'y' :
         System.out.println("You entered Y.");

         break;

      case 'N' :
      case 'n' :
         System.out.println("You entered N.");

         break;

      default :
         System.out.println("Incorrect Input!");
      }
   }
}