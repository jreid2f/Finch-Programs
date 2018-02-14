package Code;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Lab Assignment 2
 * @author Joey Reidell
 * 9/6/15
 */
public class LabAssign2 {

    
    public static void main(String[] args) {
        Finch jerry = new Finch();
        Random rand = new Random();
        int tone = 400;
        
        // The Finch says what the window shows 
        jerry.saySomething("Place the Finch on its tail", 50);
        JOptionPane.showMessageDialog(null, "Place the Finch on its tail"); 
        
        jerry.saySomething("When you can no longer hear the "
                + "tone, put the Finch on its wheels", 50);
        JOptionPane.showMessageDialog(null, "When you can no longer hear the "
                + "tone, put the Finch on its wheels");
        
        // Tests whether or not the beak of the Finch is up or down
        while(jerry.isBeakUp())
          {
            // Randomizes the number in the color scale and applys to the LED  
            System.out.println("Frequency is " + tone + " Hz");
            tone = tone + 200; // Tone starts at 400 and adds 200 each time
            jerry.setLED(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)
                    , 500);
            jerry.playTone(tone, 500);
          }
       
        // Once beak is down, program ends
        jerry.quit();
        System.exit(0);
    }
    
}
