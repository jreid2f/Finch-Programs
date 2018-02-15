
package Code;

import javax.swing.JOptionPane;

/**
 * Song Bird/Lab Assignment 5
 * @author Joey Reidell
 * 10/25/15
 */
public class LabAssign5 {

    
    public static void main(String[] args) {
        String input, repeat;
        SongBird jerry = new SongBird();
        
        do
        {
        input = JOptionPane.showInputDialog(null, 
         "Enter a group of notes from letters A-G to play a song \n"
       + "Use either an Uppercase letter or a Lowercase letter \n" 
               + "Example: 'A' or 'a'", "Let's Play a Song", 
               JOptionPane.PLAIN_MESSAGE);
       
       jerry.parseNote(input);
       
       repeat = JOptionPane.showInputDialog(null, "Would you like to "
               + "play another song?", "Let's go again", 
               JOptionPane.QUESTION_MESSAGE);
        }while(repeat.equalsIgnoreCase("Yes"));
        
        jerry.stopSong();
    }
    
}
