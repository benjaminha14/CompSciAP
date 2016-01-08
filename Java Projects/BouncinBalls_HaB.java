//Benjamin Ha
import acm.graphics.*;
import acm.program.GraphicsProgram;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;


public class BouncinBalls_HaB extends GraphicsProgram {
	public static void main(String[] args) {
      new BouncinBalls_HaB().start(args);
 
 
	
         
	}


    
	public void run() {
	    GRect rect = new GRect(100,50,600,300);
  		 setTitle("Bouncing Balls");
       String numberOfBalls = optionPane();
       add(rect);
       GOval[] ovalArray = new GOval[Integer.parseInt(numberOfBalls.trim())];
       
       for(int i = 0; i < ovalArray.length;i++){
         System.out.println("RandomX:" + generateRandomX(100,700));
         ovalArray[i] = new GOval(generateRandomX(100,700),generateRandomY(50,350),50,50);
         
         add(ovalArray[i]);
         
       }
       
       

      
              
       
	}
   public int generateRandomX(int min, int max){
      int randomX = (int)(Math.random()*max-min+min);
      System.out.println(randomX);
      return randomX;
   }
   public int generateRandomY(int min, int max){
      int randomY = (int)(Math.random()*max-min+min);
      return randomY;
   }
   public moveBalls(){
   
   }
   public String optionPane(){
	   JOptionPane pane = new JOptionPane();

	   String numberOfTurtles = JOptionPane.showInputDialog(null, "How many turtles do you want?");

	   return numberOfTurtles;

   }

}

