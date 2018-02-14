
package Code;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 * Lab Assignment 6* Reading files and handling exceptions
 * @author Joey Reidell
 * 11/10/15
 */
public class LabAssign6 {

    
    public static void main(String[] args) throws FileNotFoundException {
        Finch jerry = new Finch();
        File file;
        Scanner inputFile;
        int freq, duration;
        
        try{
         file = new File("Lab6Data.txt");
         inputFile = new Scanner(file);
         
        while(inputFile.hasNext())
        { 
            String cL = "";
           try{
            cL = inputFile.nextLine();
            String[] array = cL.split(" ");
            if(array.length == 2){
                freq = Integer.parseInt(array[0]);
                duration = Integer.parseInt(array[1]);
                jerry.setLED(Color.GREEN);
                System.out.println(cL);
                jerry.playTone(freq, duration);
            }
            else
            {
              System.out.println(cL); 
              jerry.setLED(Color.RED);
              jerry.saySomething("Bad Data");
              jerry.sleep(1000);  
            }
             
           }
           
           catch(NumberFormatException e)
           {
              System.out.println(cL); 
              jerry.setLED(Color.RED);
              jerry.saySomething("Bad Data");
              jerry.sleep(1000); 
           }
           
           
        }
        jerry.saySomething("Ending song");
        jerry.sleep(1000);
        
        inputFile.close();
        }
        
        catch(FileNotFoundException fe)
           {
               jerry.saySomething("This is not the file "
                       + "you are looking for");
               JOptionPane.showMessageDialog(null, "Cannot find file.");
               jerry.sleep(1500);
           }
         jerry.quit();
         System.exit(0);
         
        
       
        
        
        
        
        
        
        
    }
    
}
