package Code;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;

/**
 * This program demonstrates the Finch class methods
 * @author Joey Reidell
 * 10/1/15
 */
public class RobotTemperature {

   
    public static void main(String[] args) {
        
        Finch jerry = new Finch();
        double temp;
        Temperature tempValue;
        
        jerry.setLED(Color.GREEN);
        // get 3 readings
        for(int i = 1; i <= 3; i++)
        {
            temp = jerry.getTemperature();
            tempValue = new Temperature(temp * 1.8 + 32);
            System.out.println(tempValue);
            jerry.saySomething(tempValue.toString(), 6500);
            
        }
        jerry.quit();
        System.exit(0);
    }
    
}
