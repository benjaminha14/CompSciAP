/* 
   R6.1b -  
   int n = 100;
   int x = 0;
   while(x<n)
   {
   while(x&10 == 0)
   {
      System.out.println(x);
      
   
   }
   n++;
   }

   
R6.2c
   int x = 1;
   int y = 1;
   int a = 0;
   int b = 10;
   while (x > a && x < b)
   {
      while(x%2 ==1)
      {
         int y = y + x;
         
      }
      x++;
   
   }
   System.out.println(y);
   
 R6.4a, c, f
   a- 1 2 3 4 5 6 7 8 9
   c- 10 9 8 7 6 5 4 3 2 1
   f- 2 4 6 8 
 R6.10a, d, g
   a- 10
   d-11
   g - 20
 R6.11
   
   println "Su M T W Th F Sa";
   for (in day; day < 32;day++)
      print "   "+ day
   
   
 R6.15
   int s = 0;
   int i = 1;
   while(i <= 10)
   {
      i++;
      s = s+ i;
   }
 R6.16
   int n = in.nextInt();
   double x = 0;
   double s;
   while(s > 0.01)
   {
      s = 1.0/ (1 + n*n);
      n++;
      x = x + s;
   }
R6.19b,d
   b- 3
   d- 0
 R6.27
   int j = 1
   for(int i = 1 ; i < = height; i++ )
   {
      if ( j <= width)
      {
         j++;
         System.out.println("*");
      }
      System.out.println();
   }
  
 then do the running Java program that satisfies both:
 E6.9
 E6.15
*/
import java.util.Scanner;
class LoopsAsg1Ch6BookHa
{
   public static void main(String [] args)
   {
      Scanner userInput = new Scanner(System.in);
      System.out.println("Type a word: ");
      String word = userInput.nextLine();
      ExamplePrograms examplePrograms = new ExamplePrograms();
      examplePrograms.printCharacterOfWord(word);
      System.out.println("Type a number: ");
      int number = userInput.nextInt();
      examplePrograms.printSquares(number);
   }

}
class ExamplePrograms
{
   public void printCharacterOfWord(String userInput)
   {
      for(int i =0; i< userInput.length(); i++)
      {
         System.out.println(userInput.substring(i,i+1));
      
      }
   
   }
   
   public void printSquares(int length)
   {
         
         for(int i = 1 ; i <= length; i++ )
         {
            for (int j = 1; j<= length; j++)
            {
               
               System.out.print("*");
            }
            System.out.println();
         }
  
   }

}

