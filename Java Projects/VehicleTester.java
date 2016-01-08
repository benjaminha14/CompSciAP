public class VehicleTester
{
   public static void main(String []args)
   {
      Vehicle vehicle = new Vehicle();
      Vehicle vehicle2 = new Vehicle();
      vehicle.setMake("Honda");
      vehicle.setLicense("1234");
      vehicle.dirtify();
      vehicle.dirtify();
      vehicle.dirtify();
      vehicle.dirtify();
      vehicle.dirtify();
      vehicle.print();
     vehicle2.setMake("Toyota");
     vehicle2.setLicense("134trgt34");
     vehicle2.dirtify();
     vehicle2.dirtify();
     vehicle2.dirtify();
     vehicle2.dirtify();
     vehicle2.dirtify();
     vehicle2.print();

      
   }
   
}


/**
  Represents the important aspects of a vehicle, such as license #, make and how dirty the Vehicle
  is.
*/
class Vehicle
{
  // instance variables
  private String license;
  private String make;
  private int dirtLevel;
  
  // Constructors (initialize an object of this class)
  /**
     Initializes the Vehicle with default values.
  */
  public Vehicle( )
  {
      license = "N/A";
      make = "N/A";
      dirtLevel = 0;
  }
  
  // Accessors

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
  public void print()
  {
   System.out.println("The dirt Level is : "+ getDirtLevel());
   System.out.println("The License Is : "+ getLicense());
   System.out.println("The make is : "+ getMake());
   
  }
  
  
  /**
     Mutator method that dirties the car by incrementing the dirtLevel
  */
  public void dirtify( ) 
  {
      dirtLevel++;
  }
  
  public void wash( )
  {
      dirtLevel = dirtLevel - 2;
      if( dirtLevel < 0 )
      {
         dirtLevel = 0;
      }
  }
  public void setLicense(String license)
  {
      this.license = license;
  
  }
  public void setMake(String make)
  {
     this.make = make;
  }
  
 
 
} // end class Vehicle