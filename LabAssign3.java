
package Code;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;

/**
 * Lab Assignment 3
 * @author Joey Reidell
 * 9/20/15
 */
public class LabAssign3 {
    /** 
     * This method goes to the main method and tells the Finch
     * to dance and change beak colors each time its goes in a different 
     * direction
     * @param jer allows to call Finch methods into this dance method 
     */ 
    public static void dance(Finch jer)
    {
        while(jer.isFinchLevel())
        {
        jer.saySomething("And here we go");
        jer.setLED(Color.YELLOW);
        jer.setWheelVelocities(200, 200, 500);
        jer.setLED(Color.CYAN); 
        jer.setWheelVelocities(-200, -200, 500);
        jer.saySomething("Lets go hammer time", 500);
        jer.setLED(Color.MAGENTA);
        jer.setWheelVelocities(200, -200, 500);
        jer.setLED(Color.ORANGE);
        jer.setWheelVelocities(-200, 200, 500);
        }
    }

   
    public static void main(String[] args) {
      Finch jerry = new Finch();
      
      dance(jerry);
      
      jerry.quit();
      System.exit(0);
    }
    
}
