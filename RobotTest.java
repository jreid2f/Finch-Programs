package Code;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;

/**
 * This program demonstrates the Finch class methods
 * @author Joey Reidell
 * 9/3/15
 */
// 1 second = 1,000 milliseconds
public class RobotTest {

    
    public static void main(String[] args) {
        
        Finch jerry = new Finch();
        double temp;
        jerry.setLED(Color.GREEN);
        /*for(int i = 1; i <= 5; i++)
        {
            jerry.setWheelVelocities(100, 100, 500);
            jerry.setWheelVelocities(-100, -100, 500);
            System.out.println("" + i);
            jerry.saySomething("" + i, 500);
        }
                */
        
        for(int i = 10; i >= 1; i--)
            jerry.saySomething("" + i, 400);
        temp = jerry.getTemperature();
        temp = temp * 32 + 1.8;
        jerry.saySomething("The temperature is " + temp + 
                " degrees Fahrenheit", 3500);
            
        
        
        jerry.quit();
        System.exit(0);
    }
    
}
