public class InheritanceProject_HaB{
   public static void main (String[] args){
     ParallelResonantCircut parallel = new ParallelResonantCircut();
     parallel.setB(4.6);
     parallel.setW(9.8);
     parallel.setK(6.7);
     parallel.display();
     
     SeriesResonantCircut series = new SeriesResonantCircut();
     series.setB(4.12);
     series.setW(32.5);
     series.setK(8.9);
     series.display();
     
   }
}
/**
 * Represents a general resonant circuit class
 * Holds all generic attributes
 */
class ResonantCircuit{
   private double b;
   private double w;
   private double k;

   public void setB(double input){
      this.b = input;
   }
   public void setW(double input){
      this.w = input;
   }
   public void setK(double input){
      this.k = input;
   }
   public double getB(){
      return b;
   }
   public double getW(){
      return w;
   }
   public double getK(){
      return k;
   }
  
   public void display(){
      System.out.println("B is "+b);
      System.out.println("W is "+w);
      System.out.println("K is "+k);
   }
   
}
/**
 * Represents a parallel circuit
 * Holds all specific parallel circuit attributes
 */
class ParallelResonantCircut extends ResonantCircuit{
    private double calculateR(){
      return super.getK();
    }
   private double calculateL(){
      return 1/((super.getW()*super.getW())*calculateC());
   }
   private double calculateC(){
      return 1/(super.getB()*calculateR());
   }
   @Override
   public void display(){
      System.out.println("Variables detail");
      super.display();
      System.out.println("Formula For Parallel Calculations");
      System.out.println("R is "+calculateR());
      System.out.println("C is "+calculateL());
      System.out.println("L is "+calculateL());

   }
}
/**
 * Represents a Series Circuit
 * Holds specific series circuit attributes
 */
class SeriesResonantCircut extends ResonantCircuit{
   private double calculateR(){
      return 1/super.getK();
   }
   private double calculateL(){
     return calculateR()/super.getB();
   }
   private double calculateC(){
      return 1/(super.getW()*super.getW())*calculateL();
   }
   
   @Override
   public void display(){
      System.out.println("Variables detail");
      super.display();
      System.out.println("Formula for Series Calculations");
      System.out.println("R is "+calculateR());
      System.out.println("C is "+calculateL());
      System.out.println("L is "+calculateL());

   }

}