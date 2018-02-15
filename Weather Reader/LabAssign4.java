
package Code;

import edu.cmu.ri.createlab.rss.readers.WeatherReader;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Lab Assignment 4
 * @author Joey Reidell
 * 10/6/16
 */
public class LabAssign4 {

   
    public static void main(String[] args) {
        // 2 arrays, String city name, double temperature
        Finch jerry = new Finch();
        final int ARRAY_SIZE = 5;
        WeatherReader getW;
        String input, repeat = "yes", recap = "";
        // Array for city names
        String[] cityNames = new String[ARRAY_SIZE];
        // Array for city temperatures 
        double[] temp = new double[ARRAY_SIZE];
        
       
        for(int index = 0; index < cityNames.length && 
                repeat.equalsIgnoreCase("Yes"); index++)
        {
             
             input = JOptionPane.showInputDialog(null, "Enter a city "
                    + "and state abbreviation to get a forecast." + 
                    "\nSeperate city and state with a coma and white space."
                    + "\nExample: 'Pittsburgh, PA'" + 
                    "\nEnter up to 5 locations", "Location " + (index + 1),
                    JOptionPane.PLAIN_MESSAGE);
            cityNames[index] = input;
            getW = new WeatherReader(input);
            temp[index] = getW.getTemperature();
            jerry.setLED(Color.RED);
            jerry.saySomething("The current temperature in " + input + 
                    " is" + getW.getTemperature() + " degrees Fahrenheit"
                    , 5000);
            jerry.setLED(Color.BLACK);
           
            repeat = JOptionPane.showInputDialog(null, 
                     "Would you like weather " + 
                     "information for another city?" 
                     + "\nEnter \"YES\" to repeat --> ", 
                     JOptionPane.QUESTION_MESSAGE);
          
        
          
        }
        for(int x = 0; x < cityNames.length; x++)
        {
            if(cityNames[x] == null)
                break;
            else
            {
            recap = recap + cityNames[x] + "        " + temp[x] + "\n";
            }
        
        }
        
        JOptionPane.showMessageDialog(null, 
                "        City               Temperature     \n" 
                    + recap, "Recap", JOptionPane.PLAIN_MESSAGE);
        
        double highestTemp = temp[0];
        double lowestTemp = temp[0];
        int highestCity = 0;
        int lowestCity = 0;
        
        for(int x = 0; x < temp.length; x++)
        {
            if((cityNames[x] != null) && (temp[x] > highestTemp))
            {
                highestTemp = temp[x];
                highestCity = x;
            }
            
            if((cityNames[x] != null) && (temp[x] < lowestTemp))
            {
                lowestTemp = temp[x];
                lowestCity = x;
            }
            
        }
        jerry.saySomething("The highest temperature is " + 
                cityNames[highestCity], 5000);
        jerry.saySomething("The lowest temperature is " + 
                cityNames[lowestCity], 5000);
        
        jerry.quit();
        System.exit(0);        
        
        
        
    }
    
}
