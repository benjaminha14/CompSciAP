//Benjamin Ha
//Class-Asg2: Die Class Lab -main
import java.util.Scanner;
public class DieTester_HaB
{
  public static void main(String [] args)
  {      
      Scanner userInput = new Scanner(System.in);
      Die die1 = new Die();
      Die die2 = new Die();
      die1.roll();
      die1.print();
      die2.roll();
      die2.print();

  }  
}

class Die
{
   // Instance Variables
   private int faceValue;
   private int numSides;
   // Constructor
   Die()
   {
      faceValue = 6;
      numSides = changeNumSides(6);
      
   
   }
   // Accesor Method
   public int getFaceValue()
   {
      return faceValue;
       
   }
   public String toString()
   {
      
      return Integer.toString(faceValue);
   }
   public void print()
   {
      toString();
     
         
      System.out.println("Face Value for Dice using getFaceValue():  " + getFaceValue());
     
   
   }
   
  
   // Mutator Methods
   public int roll()
   {
      faceValue = (int)(Math.random()*6) + 1;
      return faceValue;
   }
   public int changeNumSides(int numSides)
   {
      return numSides;
   }
   
}