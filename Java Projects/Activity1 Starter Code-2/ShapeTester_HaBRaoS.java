import java.awt.Color;
public class ShapeTester_HaBRaoS
{
   public static void main(String[] args)
   {
      //Make a circle object and a rectangle objects and a shape object
      
      Shape shape = new Shape(0,5,new Color(56,12,0));
      System.out.println("Shape: "+shape.getX() + "," + shape.getY() + ", Color "+shape.getColor());
      Circle circle = new Circle(9,7,4,new Color(0,0,0));
      System.out.println("Circle: "+ circle.getX() + "," + circle.getY() + ", radius: "+
                          circle.getRadius()+", Color: "+ circle.getColor());
      Rectangle rectangle = new Rectangle(2,10,9,0,new Color(5,3,6));
     
      System.out.println("Rectangle "+"Width: "+ rectangle.getWidth() + " Height: "
                          +rectangle.getHeight()+ " Location: "+ rectangle.getX() +
                          ","+rectangle.getY() +" Bottom Left: "+rectangle.getBottomRightY()
                          + " Area: "+rectangle.getArea() + " Color: "
                          +rectangle.getColor());
      
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
    public Color getColor(){return color;}
    
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
   public int getRadius(){return radius;}
   
   
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
   public int getWidth(){return width;}
   public int getHeight(){return height;}
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