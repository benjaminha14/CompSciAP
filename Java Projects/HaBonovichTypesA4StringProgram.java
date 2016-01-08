//Robby Bonovich
//Ben _ha
//Period: 2

/**
This program takes the first character of the first name and the last name and makes it a teacher email.
*/
import java.util.Scanner;
public class HaBonovichTypesA4StringProgram
{
   //Email Generator
   public static void main (String args[])
   {
      Scanner userInput = new Scanner(System.in);
      System.out.println("This program generates a teacher email.");
      System.out.println("Enter your first name: ");
      String f = userInput.nextLine();
      System.out.println("Enter your last name: ");
      String l = userInput.nextLine();
      emailGen(f,l);
   }
   
   public static String emailGen(String firstName, String lastName)
   {
      /**
      @param String firstName, String lastName
      @return The complete email.
      */
      String output = (firstName.substring(0,1) + lastName + "@bcp.org");
      System.out.println(output.toLowerCase());
      return output;
   }
}
      
      
