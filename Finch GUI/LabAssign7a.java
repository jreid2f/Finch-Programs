
package Code;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

/**
 * Lab Assignment 7/GUI with Layout Manager
 * @author Joey Reidell
 * 11/19/15
 */
public class LabAssign7a extends JFrame implements ActionListener {
    private Finch jerry;
    private JButton forwardButton;
    private JButton backwardButton;
    private JButton leftButton;
    private JButton rightButton;
    private JButton danceButton;
    private JPanel mainPanel;
    private JPanel panel1; 
    private JPanel panel2; 
    private JPanel panel3; 
    private JPanel panel4; 
    private JPanel panel5;
    private final int WINDOW_WIDTH = 250;
    private final int WINDOW_HEIGHT = 155;

    public LabAssign7a()
    { 
      // sets title for JFrame
        setTitle("Dance Finch Dance");
        
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       // Creates a finch object
        jerry = new Finch();
        
      // Creates the main panel 
        mainPanel = new JPanel(); 
        
      // Creates five subpanels.
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();

      // Create five buttons.
        forwardButton = new JButton("Forward");
        backwardButton = new JButton("Backward");
        leftButton = new JButton("Left");
        rightButton = new JButton("Right");
        danceButton = new JButton("Dance");
       
      // Add the buttons to the panels.
        panel1.add(forwardButton);
        panel2.add(backwardButton);
        panel3.add(rightButton);
        panel4.add(leftButton);
        panel5.add(danceButton);
        
      // Register's the actions of the buttons
        forwardButton.addActionListener(this);
        backwardButton.addActionListener(this);
        leftButton.addActionListener(this);
        rightButton.addActionListener(this);
        danceButton.addActionListener(this);
        
      // Sets the background and foreground of the buttons 
        forwardButton.setBackground(Color.YELLOW);
        backwardButton.setBackground(Color.YELLOW);
        rightButton.setBackground(Color.YELLOW);
        leftButton.setBackground(Color.YELLOW);
        danceButton.setBackground(Color.YELLOW);
        
        
        // Sets the background of the subpanels to black
        panel1.setBackground(Color.black);
        panel2.setBackground(Color.black);
        panel3.setBackground(Color.black);
        panel4.setBackground(Color.black);
        panel5.setBackground(Color.black);
        
         // Adds the panels onto the main panel
        mainPanel.setLayout(new BorderLayout(5,5));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        mainPanel.setBackground(Color.yellow);
        mainPanel.add(panel1, BorderLayout.NORTH);
        mainPanel.add(panel2, BorderLayout.SOUTH);
        mainPanel.add(panel3, BorderLayout.EAST);
        mainPanel.add(panel4, BorderLayout.WEST);
        mainPanel.add(panel5, BorderLayout.CENTER);
        
        add(mainPanel);
        
        setResizable(false);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
       if(e.getSource() == forwardButton)
       {
           jerry.setLED(Color.BLUE);
           jerry.setWheelVelocities(200, 200, 500);
           jerry.setLED(Color.BLACK);
       }
       else if(e.getSource() == backwardButton)
       {
           jerry.setLED(Color.RED);
           jerry.setWheelVelocities(-200, -200, 500);
           jerry.setLED(Color.BLACK);
       }
       else if(e.getSource() == leftButton)
       {
          jerry.setLED(Color.GREEN);
          jerry.setWheelVelocities(-200, 200, 500);
          jerry.setLED(Color.BLACK);
       }
       else if(e.getSource() == rightButton)
       {
          jerry.setLED(Color.ORANGE);
          jerry.setWheelVelocities(200, -200, 500);
          jerry.setLED(Color.BLACK);
       }
       else if(e.getSource() == danceButton)
       {
         jerry.setLED(Color.YELLOW);
         jerry.setWheelVelocities(-200, 200, 500);
         jerry.setLED(Color.CYAN);
         jerry.setWheelVelocities(200, -200, 500);
         jerry.setLED(Color.MAGENTA);
         jerry.setWheelVelocities(-200, -200, 500);
         jerry.setLED(Color.PINK);
         jerry.setWheelVelocities(-200, 200, 500);
         jerry.setLED(Color.BLUE);
         jerry.setWheelVelocities(200, 200, 500);
         jerry.setLED(Color.WHITE);
         jerry.setWheelVelocities(200, -200, 500);
         jerry.setLED(Color.GRAY);
         jerry.setWheelVelocities(200, 200, 500);
         jerry.setLED(Color.BLACK);
       }
    }
    
    public static void main(String[] args) {
       
        new LabAssign7a();
    }
    
}
