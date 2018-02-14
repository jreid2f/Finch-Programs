
package Code;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 * GUI with Sliders
 * @author Joey Reidell & Jonathan Rock & James Novakowski
 * 4/25/16
 */
public class FinchSlider extends JFrame{
    private JSlider leftVelocity, rightVelocity, 
            redSlider, greenSlider, blueSlider;
    private JPanel sliderPanel, leftPanel, rightPanel, 
            redPanel, greenPanel, bluePanel;
    private JLabel leftLabel, rightLabel, redLabel, greenLabel, blueLabel;
    private Finch jerry;
    private int left, right, red, green, blue;
    
    
    public FinchSlider(){
        jerry = new Finch();
        leftVelocity = new JSlider(JSlider.HORIZONTAL);
        rightVelocity = new JSlider(JSlider.HORIZONTAL);
        redSlider = new JSlider(JSlider.HORIZONTAL);
        greenSlider = new JSlider(JSlider.HORIZONTAL);
        blueSlider = new JSlider(JSlider.HORIZONTAL);
        sliderPanel = new JPanel();
        leftPanel = new JPanel();
        rightPanel = new JPanel();
        redPanel = new JPanel();
        greenPanel = new JPanel();
        bluePanel = new JPanel();
        leftLabel = new JLabel("Left Wheel Velocity", JLabel.CENTER);
        rightLabel = new JLabel("Right Wheel Velocity", JLabel.CENTER);
        redLabel = new JLabel("Red");
        redLabel.setForeground(Color.RED);
        greenLabel = new JLabel("Green");
        greenLabel.setForeground(Color.GREEN);
        blueLabel = new JLabel("Blue");
        blueLabel.setForeground(Color.BLUE);
        
        
        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(leftLabel, BorderLayout.NORTH);
        leftVelocity.setMaximum(250);
        leftVelocity.setMinimum(-250);
        leftVelocity.setPaintLabels(true);
        leftVelocity.setPaintTicks(true);
        leftVelocity.setMajorTickSpacing(100);
        leftVelocity.setValue(0);
        leftVelocity.addChangeListener(new ChangeListener(){

            @Override
            public void stateChanged(ChangeEvent e) {
                left = leftVelocity.getValue();
                jerry.setWheelVelocities(left, right);
            }
        
        });
        leftPanel.add(leftVelocity);
        
        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(rightLabel, BorderLayout.NORTH);
        rightVelocity.setMaximum(250);
        rightVelocity.setMinimum(-250);
        rightVelocity.setPaintLabels(true);
        rightVelocity.setPaintTicks(true);
        rightVelocity.setMajorTickSpacing(100);
        rightVelocity.setValue(0);
        rightVelocity.addChangeListener(new ChangeListener(){

            @Override
            public void stateChanged(ChangeEvent e) {
                right = rightVelocity.getValue();
                jerry.setWheelVelocities(left, right);
            }
        
        });
        rightPanel.add(rightVelocity);
        
        redPanel.setLayout(new BorderLayout());
        redPanel.add(redLabel, BorderLayout.WEST);
        redSlider.setMaximum(250);
        redSlider.setMinimum(0);
        redSlider.setPaintLabels(true);
        redSlider.setPaintTicks(true);
        redSlider.setMajorTickSpacing(50);
        redSlider.setMinorTickSpacing(10);
        redSlider.setValue(0);
        redSlider.addChangeListener(new ChangeListener(){

            @Override
            public void stateChanged(ChangeEvent e) {
                red = redSlider.getValue();
                jerry.setLED(red, green, blue);
            }
        
        });
        redPanel.add(redSlider);
        
        greenPanel.setLayout(new BorderLayout());
        greenPanel.add(greenLabel, BorderLayout.WEST);
        greenSlider.setMaximum(250);
        greenSlider.setMinimum(0);
        greenSlider.setPaintLabels(true);
        greenSlider.setPaintTicks(true);
        greenSlider.setMajorTickSpacing(50);
        greenSlider.setMinorTickSpacing(10);
        greenSlider.setValue(0);
        greenSlider.addChangeListener(new ChangeListener(){

            @Override
            public void stateChanged(ChangeEvent e) {
                green = greenSlider.getValue();
                jerry.setLED(red, green, blue);
            }
        
        });
        greenPanel.add(greenSlider);
        
        bluePanel.setLayout(new BorderLayout());
        bluePanel.add(blueLabel, BorderLayout.WEST);
        blueSlider.setMaximum(250);
        blueSlider.setMinimum(0);
        blueSlider.setPaintLabels(true);
        blueSlider.setPaintTicks(true);
        blueSlider.setMajorTickSpacing(50);
        blueSlider.setMinorTickSpacing(10);
        blueSlider.setValue(0);
        blueSlider.addChangeListener(new ChangeListener(){

            @Override
            public void stateChanged(ChangeEvent e) {
                blue = blueSlider.getValue();
                jerry.setLED(red, green, blue);
            }
        
        });
        bluePanel.add(blueSlider);
        
        sliderPanel.setLayout(new GridLayout(5, 1));
        sliderPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
        sliderPanel.add(leftPanel);
        sliderPanel.add(rightPanel);
        sliderPanel.add(redPanel);
        sliderPanel.add(greenPanel);
        sliderPanel.add(bluePanel);
        add(sliderPanel);
    }
   
    public static void main(String[] args) {
       FinchSlider frame = new FinchSlider();
       frame.setTitle("Drive the Finch");
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300, 450);
       frame.setVisible(true);
    }
    
}
