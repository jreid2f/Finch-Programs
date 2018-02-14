
package Code;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 * Lab Assignment 7-GUI for the Finch
 * 4/20/16
 * @author Joey Reidell & Jonathan Rock & James Novakowski
 */
public class FinchGUI extends JPanel{
    private Finch jerry;
    private JPanel main, sensorPanel, speechPanel, colorPanel;
    private JCheckBox rightSensor, leftSensor, tempSensor, xSensor, 
            ySensor, zSensor ;
    private JTextField rightText, leftText, tempText, xText, yText, zText, 
            speech;
    private JButton speakButton, clearButton;
    private JLabel textLabel;
    private JRadioButton redButton, greenButton, blueButton, cyanButton, 
            yellowButton, pinkButton;
    
    public FinchGUI(){
        jerry = new Finch();
        main = new JPanel();
        sensorPanel = new JPanel();
        speechPanel = new JPanel();
        colorPanel = new JPanel();
        
        rightSensor = new JCheckBox("Right Light Sensor");
        leftSensor = new JCheckBox("Left Light Sensor");
        tempSensor = new JCheckBox("Temperature Sensor");
        xSensor = new JCheckBox("X Acceleration Value");
        ySensor = new JCheckBox("Y Acceleration Value");
        zSensor = new JCheckBox("Z Acceleration Value");
        
        speakButton = new JButton("Speak");
        clearButton = new JButton("Clear");
        rightText = new JTextField();
        leftText = new JTextField();
        tempText = new JTextField();
        xText = new JTextField();
        yText = new JTextField();
        zText = new JTextField();
        speech = new JTextField();
        textLabel = new JLabel("Enter Text:");
        textLabel.setForeground(Color.red);
        
        redButton = new JRadioButton("Red");
        greenButton = new JRadioButton("Green");
        blueButton = new JRadioButton("Blue");
        cyanButton = new JRadioButton("Cyan");
        yellowButton = new JRadioButton("Yellow");
        pinkButton = new JRadioButton("Pink");
        
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        add(main);
        
        sensorPanel.setBorder(new TitledBorder("Sensor Values"));
        sensorPanel.setLayout(new GridLayout(6, 2, 5, 5));
        
        sensorPanel.add(rightSensor);
        rightSensor.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rightSensor.isSelected()){
                rightText.setText(
                        Integer.toString(jerry.getRightLightSensor()));
                }
                else{
                    rightText.setText("");
                }
                
            }
        });
        rightText.setEditable(false);
        sensorPanel.add(rightText);
        
        sensorPanel.add(leftSensor);
        leftSensor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(leftSensor.isSelected()){
                leftText.setText(
                        Integer.toString(jerry.getLeftLightSensor()));
                }
                else{
                    leftText.setText("");
                }
                
            }
        });
        leftText.setEditable(false);
        sensorPanel.add(leftText);
        
        sensorPanel.add(tempSensor);
        tempSensor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tempSensor.isSelected()){
                tempText.setText(
                        Double.toString(jerry.getTemperature()));
                }
                else{
                    tempText.setText("");
                }
            }
        });
        tempText.setEditable(false);
        sensorPanel.add(tempText);
        
        sensorPanel.add(xSensor);
        xSensor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(xSensor.isSelected()){
                xText.setText(
                        Double.toString(jerry.getXAcceleration()));
                }
                else{
                    xText.setText("");
                }
            }
        });
        xText.setEditable(false);
        sensorPanel.add(xText);
        
        sensorPanel.add(ySensor);
        ySensor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ySensor.isSelected()){
                yText.setText(
                        Double.toString(jerry.getYAcceleration()));
                }
                else{
                    yText.setText("");
                }
            }
        });
        yText.setEditable(false);
        sensorPanel.add(yText);
        
        sensorPanel.add(zSensor);
        zSensor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zSensor.isSelected()){
                zText.setText(
                        Double.toString(jerry.getZAcceleration()));
                }
                else{
                    zText.setText("");
                }
            }
        });
        zText.setEditable(false);
        sensorPanel.add(zText);
        
        main.add(sensorPanel);
        
        speechPanel.setBorder(new TitledBorder("Speech"));
        speechPanel.setLayout(new GridLayout(2, 2, 5, 5));
        
        speechPanel.add(textLabel);
        speechPanel.add(speech);
        speechPanel.add(speakButton);
        speakButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(speech.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "No text was entered", 
                            "Text Missing", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    jerry.saySomething(speech.getText());
                }
            
            }
        });
        speechPanel.add(clearButton);
        clearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                speech.setText("");
            
            }
        });
        main.add(speechPanel);
        
        colorPanel.setBorder(new TitledBorder("Beak Color"));
        colorPanel.setLayout(new GridLayout(2, 3));
        ButtonGroup group = new ButtonGroup();
        redButton.setSelected(true);
        jerry.setLED(Color.RED);
        group.add(redButton);
        group.add(greenButton);
        group.add(blueButton);
        group.add(cyanButton);
        group.add(yellowButton);
        group.add(pinkButton);
        
        colorPanel.add(redButton);
        redButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jerry.setLED(Color.RED);
            }
        
        });
        
        colorPanel.add(greenButton);
        greenButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jerry.setLED(Color.GREEN);
            }
        
        });
        
        colorPanel.add(blueButton);
        blueButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jerry.setLED(Color.BLUE);
            }
        
        });
        
        colorPanel.add(cyanButton);
        cyanButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jerry.setLED(Color.CYAN);
            }
        
        });
        colorPanel.add(yellowButton);
        yellowButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jerry.setLED(Color.YELLOW);
            }
        
        });
        
        colorPanel.add(pinkButton);
        pinkButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jerry.setLED(Color.PINK);
            }
        
        });
        
        main.add(colorPanel);
    }

    }

