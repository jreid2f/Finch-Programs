
package Code;

import javax.swing.*;


/**
 * Lab Assignment 7-GUI for the Finch
 * 4/20/6
 * @author Joey Reidell & Jonathan Rock & James Novakowski
 */
public class LabAssign7 extends JFrame{
    
    public LabAssign7(){
        add(new FinchGUI());
    }

    
    public static void main(String[] args) {
        LabAssign7 frame = new LabAssign7();
        frame.setTitle("Finch GUI");
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
