/*
   R5.3 - 
   a. no then and x>0 needs to be in ().
   b. 1+ x needs to bein ().
   c. == no  =
   d.need to use .eauls() method
   e. use else if instead of all if
   
   R5.4 -
   a.-1
   b. 1
   c. 1
   
   R5.6-
   
   if (x>0)
   {
      y = x;
   }else{
      y = 0;
   }
   
   R5.12
   Check start 1 with 2 ->
   Start1 -> start2 ->s = start1
   ->s = start2
   Check end1 < end2 - > e = end1
   ->e = end!
   s < e -> The appointment overlap
   ->The appoitment does not overlap.
   
   R5.19-
   They differ becasue strings in java rely on hexidecimal. 
   
   R5.29 - 
   a- false
   b- true
   c- false
   d-true
   e-fasle
   f-true
   g-false
   h-false
   
   5.31
   a-if (n == 0) { b = true; } else { b = false; }
   b- if (n == 0) { b = false; } else { b = true; }
   c- b = fasle ; if(n>1 &&n < 2){ b = true;}
   d- if (n < 1) { b = true; } else { b = n > 2; }
   
*/
class Asg3Book{
   public static void main(String[] args)
   {
      Problems problem = new Problems();
      problem.orderNumber(1,2,3);
      System.out.println(problem.pay(69));
   }
}
class Problems{
   public void orderNumber(int a, int b, int c)
   {
      if(a <= b && b <= c)
      {
         System.out.println(a + " " + b + " " + c );
      }

   }
   public double pay (int hour)
   {
      double wage = 9.25;
      if(hour > 40)
      {
         double oldWage = 40*wage;
         hour = hour-40;
         return (hour*(1.5*wage))+oldWage;
      }else{
         return hour*wage;
      }
   }
}