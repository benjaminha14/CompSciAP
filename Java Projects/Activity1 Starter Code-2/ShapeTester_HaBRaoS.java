import java.awt.Color;
public class ShapeTester_HaBRaoS
{
   public static void main(String[] args)
   {
      //Make a circle object and a rectangle objects and a shape object
   }
}

class Shape {
    private int xLoc;
    private int yLoc;
    // 1) Add an instance variable for Color...
    private Color color;


    public Shape( int xLocation, int yLocation ){
    	xLoc = xLocation;
    	yLoc = yLocation;
    }
    public int getX() {return xLoc;}
    public int getY() {return yLoc;}
    
    /**
     2) Write an alternate constructor that takes the x, y location AND
     	a color object and initializes all instance variables.
    */
    public Shape(int xLocation, int yLocation, Color c)
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

class Circle extends Shape
{
   private int radius;
   public Circle(int xLocation,int yLocation, int radius, Color c)
   {
      super(xLocation,yLocation,c);
      this.radius = radius;
      
   }
   
}

class Rectangle extends Shape
{
   private int width;
   private int height;
   public Rectangle(int width, int height, int xLocation, int yLocation, Color c){
      super(xLocation,yLocation,c);
      this.width = width;
      this.height = height;
      
   }
   public int getArea(){return height*width;}
   public int getBottomRightY(){ return super.getY()-height;}
}
/** 4) Write a class Rectangle that inherits from Shape and has an instance
 		field for width, height, color and x,y location.
       (4b)Implement a suitable contructor
       for the class (that initializes all instance members.
       (4c) Add a method, int getArea() that returns the area of the
       Rectangle. (4d) Add a method, getBottomRightY that takes no
       parameters and returns the y coordinate of the bottom right
       corner of this rectangle.
*/


/** 5) Create a public tester class: ShapeTester_Lastna
       Create a few objects
*/