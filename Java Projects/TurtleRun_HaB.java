//Benjamin Ha
import acm.graphics.*;
import acm.program.GraphicsProgram;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;

public class TurtleRun_HaB extends GraphicsProgram {
	public static void main(String[] args) {
		new TurtleRun_HaB().start(args);
	}

	/*
	*Run initialization of program
	* @param  None
	* @return None
   */
    
	public void run() {
		String userInput = optionPane();
      int i = Integer.parseInt(userInput.trim());
      
		GLine finishLine = new GLine(500, 0, 500, 1250);
		add(finishLine);
		setTitle("Turtle Race");
      System.out.println(i);
		GTurtle[] turtleArray = new GTurtle[i];
      int startingPosition = 50;
      for(int position = 0; position < turtleArray.length; position++)
      {
         
			turtleArray[position] = new GTurtle(100, startingPosition);
			startingPosition+= 50;
			turtleArray[position].setSize(50);
			add(turtleArray[position]);
      }
      raceTurtles(turtleArray,100);
	
	}


   /**
   * Returns the updated turtles poisiton  
   *@param  Object turtle 1
   * @param  Object turtle 2
   * @param  Object turtle 3
   * @param  A max speed so that the turtles can not go over
   * @return      an GTurtle object
   */
   void raceTurtles(GTurtle[] array, int maxSpeed) {
	   Random rand = new Random();
      boolean running = true;
      boolean[] isRunning = new boolean[array.length+1]; 
      int i = 0;
      int winnerCheck = 0;
      GTurtle winner = null;
      
      while(running)
      {
      
         

         for(GTurtle turtle : array)
         {
            
            if(turtle.getX()<=550)
            {
            turtle.forward(rand.nextInt(maxSpeed));
            pause(50);
            
            
            }else{
               winnerCheck++;
                if(winnerCheck == 1) winner = turtle;
                
               isRunning[i] = true;
               
               i++;
               
            }
            
            if(allTrue(isRunning) == true)
            {
               
               running =false;
            }else{
               running = true;
            }
            
         }
         
      }
      pause(50);
      winnerDance(winner);
  
}

	/**
   * Checks if all of the turtles have crossed the line  
   *@param  Array with bool if a turtle is crossed the line or not
   * @return true if it all turtles have crossed
   */
	   
   boolean allTrue (boolean[] values) {
    for (boolean value : values) {
        if (!value)
            return false;
    }
    return true;
   }
   /**
   *Performs dance for winning turtle
   *@param takes in the winning turtle
   *@return none
   */
   void winnerDance(GTurtle winTurtle)
   {
      pause(1000);
      winTurtle.setLocation(100,250);
      for(int i = 0; i < 5; i++)
      {
         winTurtle.forward(20);
         pause(50);
      }
      System.out.println("Winner");
   }

	/**
   *Takes in user input of how many turtles to race
   to use
   *@param none
   *@return The user input
   */
   String optionPane(){
	   JOptionPane pane = new JOptionPane();

	   String numberOfTurtles = JOptionPane.showInputDialog(null, "How many turtles do you want?");

	   return numberOfTurtles;

   }
}

