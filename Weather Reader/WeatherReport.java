package Code;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.rss.readers.WeatherReader;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class WeatherReport
   {
   public static void main(final String[] args)
      {
      // returns degrees in Fahrenheit, "the current temperature in..."    
      // Instantiating the Finch object
      Finch myFinch = new Finch();
      String input;
      WeatherReader getW;
      input = JOptionPane.showInputDialog(null, "Enter a city for "
              + "a weather report", "Title Bar", JOptionPane.PLAIN_MESSAGE);
      getW = new WeatherReader(input);
      myFinch.setLED(Color.BLUE);
      myFinch.saySomething(getW.getConditions() + getW.getTemperature(), 5000);
      myFinch.sleep(3000);

      // Write some code here!

      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
   }

