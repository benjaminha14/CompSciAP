//Benjamin Ha
// Class- Asg4 : Die Class- print
public class DieTester_HaB
{
  //Die die1 = new Die();
  public static void main(String [] args)
  {
  
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
      numSides = 6;
      faceValue = 0;
   
   }
   // Accesor Method
   public int getValue()
   {
      return faceValue;
   }
   // Mutator Methods
   public void roll()
   {
      faceValue = (int)Math.random()*numSides + 1;
      
   }
   
   

}