import java.awt.Color;
public class Inherits-A8_HaB{
   public static void main(Strings[] arg){
      System.out.println("Hi");
   }
}
class Shape {
    private int xLoc;
    private int yLoc;
    // 1) Add an instance variable for Color...
    private Color color;


    public Shape( int xLocation, int yLocation ) {
    	xLoc = xLocation;
    	yLoc = yLocation;
    }
    public int getX() {return xLoc;}
    public int getY() {return yLoc;}
    }
    /**
     2) Write an alternate constructor that takes the x, y location AND
     	a color object and initializes all instance variables.
    */
    public( int xLocation, int yLocation, Color c)
    {
      xLoc = xLocation;
      yLoc = yLocation;
      color = c;
    }










} // end class Shape

/** 3) Write a class Circle that has an instance field for radius and
	   inherits the x,y and color from the Shape class. Write a
	   constructor for Circle that initializes all instance variables,
	   including location.
*/
