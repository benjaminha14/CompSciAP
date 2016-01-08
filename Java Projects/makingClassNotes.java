public class makingClassNotes
{
   // instance variables here:
   private String license;
   private String make;
   private int dirtLevel;
   //public methods
   // Constructors (initialize an object of this class)
   /** 
      Initalize the Vehicle with default values
   **/
   
   public makingClassNotes( )
   {
      license = "N/A";
      make = "N/A";
      dirtLevel = 0;
   }
   
   // accessors
   
   // returns the license
   
   public String getLicense()
   {
      return license;
   }
   public String getMake()
   {
      return make;
   }
   public int getDirtLevel()
   {
      return dirtLevel;
   }
   public void dirtify()
   {
      dirtLevel++;
   }
   public void wash()
   {
      dirtLevel = dirtLevel - 2;
      if (dirtLevel < 0)
      {
         dirtLevel = 0;
      }
   }
   public static void main(String[] args)
   {
      makingClassNotes v1 = new makingClassNotes();
      v1.dirtify();
      v1.dirtify();
      v1.dirtify();
      v1.wash();
      System.out.println(v1.dirtLevel);
      
   }
   

}