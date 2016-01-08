// Benjamin Ha and Joshua Joseph
// Types-Asg5: Colors


import java.awt.Color;
import javax.swing.JFrame;
public class brighterDemoJoshJoHa{
   public static void main(String []args){
      int red,green,blue,newRed,newBlue,newGreen;
      red = 50;
      green = 100;
      blue = 150;
      Color color = new Color(red,green,blue);
      Color newColor = color.brighter();
      JFrame frame = new JFrame();
      frame.setSize(150,250);
      newRed = newColor.getRed();
      newBlue = newColor.getBlue();
      newGreen = newColor.getGreen();
      frame.getContentPane().setBackground(newColor);
      frame.setVisible(true);
      
      
      System.out.println("Red: "+newRed + " Green: "+newGreen+" Blue: "+newBlue);

      
                      
      
   }
}
