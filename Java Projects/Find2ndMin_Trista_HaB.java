//Kaito Trias and Benjamin Ha
//AList-A3: Find2ndMin-PP

import java.util.*;
public class Find2ndMin_Trista_HaB
{
   public static void main (String[]args)
   {
      ArrayList<Integer> stuff = new ArrayList<Integer>();
      stuff.add(-2);
      stuff.add(12);
      stuff.add(22);
      stuff.add(17);
      stuff.add(19);
      stuff.add(-10);
      stuff.add(-2);
      System.out.println("Test 1: 2nd smallest is: " + find2ndMin(stuff) );

      stuff = new ArrayList<Integer>();
      stuff.add(-2);
      stuff.add(12);
      stuff.add(22);
      stuff.add(17);
      stuff.add(19);
      stuff.add(-1);
      stuff.add(-2);
      System.out.println("Test 2: 2nd smallest is: " + find2ndMin(stuff) );

      stuff = new ArrayList<Integer>();
      stuff.add(-2);
      stuff.add(12);
      stuff.add(22);
      stuff.add(17);
      stuff.add(19);
      stuff.add(-1);
      stuff.add(999999);
      System.out.println("Test 3: 2nd smallest is: " + find2ndMin(stuff) );
  }
   public static int find2ndMin(ArrayList<Integer> ints)
   {
      int min = 0;
      int secondmin = 0;
      for(int i = 0; i<ints.size(); i++)
      {
         if(ints.get(i)<min)
         {
            secondmin = min;
            min = ints.get(i);
         }
         else if(ints.get(i)<secondmin)
         {
            secondmin = ints.get(i);
         }
      }
      return secondmin;
   }
}