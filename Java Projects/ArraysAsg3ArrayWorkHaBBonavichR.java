/*With a partner you select (create a group in Canvas  People->Groups):

The following may be done as static methods in one class.

Write a method createIncreasingArray that takes an int as parameter and creates an array of that size with increasing even numbers starting at 0.
Create a method sumArray that calculates the sum of the elements of an int array (of any size) passed in as a parameter.
Create a main method that tests out the 2 methods above.
If you finish in class, create method printMaxMin that takes an int array parameter and prints out the maximum and minimum values in the array.
Turn in your java file. You need not javadoc your file.*/
import java.util.Arrays;
public class ArraysAsg3ArrayWorkHaBBonavichR
{
  static int array[];
 
   static void createIncreasingArray(int number)
   {
      array = new int[number];
      for (int i = 0; i < number; i++)
      {
          array[i] = i*2;
      }
      System.out.println("Array: "+Arrays.toString(array));
   }
   static int sumOfArray(int first, int second)
   {
       int num1 = array[first];
       int num2 = array[second];
       int sum = num1 + num2;
       return sum;
   }
   static void printMaxMin()
   {
     int min = array[0];
     int max  = array.length;
     System.out.println("Min: "+min + " Max: " + max); 
   }
   public static void main (String args[])
   {
      createIncreasingArray(7);
      System.out.println("Sum: "+sumOfArray(1,4));
      printMaxMin();
    
   }
}