
package Code;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;

/**
 * Song Bird/Lab Assignment 5
 * @author Joey Reidell
 * 10/25/15
 */
public class SongBird {
    
    private Finch jerry;
    // Constructor that creates an instance of the Finch object
    public SongBird()
    {
      jerry = new Finch();    
    }
    // takes a character as input and plays the note
    private boolean playNote(char note)
    {
          switch(note)
          {
              case 'A':
                  jerry.setLED(Color.RED);
                  jerry.playTone(440, 1000);
                  return true;
              case 'B':
                  jerry.setLED(Color.BLUE);
                  jerry.playTone(494, 1000);
                  return true;
              case 'C':
                 jerry.setLED(Color.YELLOW);
                 jerry.playTone(262, 1000);
                 return true;
              case 'D':
                  jerry.setLED(Color.ORANGE);
                  jerry.playTone(294, 1000);
                  return true;
              case 'E':
                 jerry.setLED(Color.MAGENTA);
                 jerry.playTone(330, 1000);
                  return true;
              case 'F':
                  jerry.setLED(Color.CYAN);
                  jerry.playTone(349, 1000);
                  return true;
              case 'G':
                  jerry.setLED(Color.PINK);
                  jerry.playTone(392, 1000);
                  return true;
              
           }
      
          
          switch(note)
          {
              case 'a':
                  jerry.setLED(Color.RED);
                  jerry.playTone(440, 500);
                  return true;
              case 'b':
                  jerry.setLED(Color.BLUE);
                  jerry.playTone(494, 500);
                  return true;
              case 'c':
                  jerry.setLED(Color.YELLOW);
                  jerry.playTone(262, 500);
                  return true;
              case 'd':
                  jerry.setLED(Color.ORANGE);
                  jerry.playTone(294, 500);
                  return true;
              case 'e':
                  jerry.setLED(Color.MAGENTA);
                  jerry.playTone(330, 500);
                  return true;
              case 'f':
                  jerry.setLED(Color.CYAN);
                  jerry.playTone(349, 500);
                  return true;
              case 'g':
                  jerry.setLED(Color.PINK);
                  jerry.playTone(392, 500);
                  return true;
              default:
                  return false;   
                
          } 
    }
    // checks each character in the String and stops if it's a bad note
    public void parseNote(String song)
    {
      char[] array;
      array = song.toCharArray();
      
      for(int i = 0; i < array.length; i++)
      {
          if(playNote(array[i]) == true)
              continue;
          
          if(playNote(array[i]) == false)
          {
              jerry.saySomething("Invalid Note, stopping song");
              System.out.println("Invalid Note, stopping song!");
              break;
           }
      }
      
    }
      
    
    public void stopSong()
    {
        jerry.quit();
        System.exit(0);
    }
    
}
