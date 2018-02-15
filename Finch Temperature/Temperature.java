package Code;


import java.text.DecimalFormat;


/**
 * This is a user defined class
 * @author Joey Reidell
 * 10/1/15
 */
public class Temperature {
    // field
    private double ftemp;
    // constructor
    public Temperature(double t)
    {
        ftemp = t;
    }
    // setter method
    public void setFahrenheit(double t)
    {
        ftemp = t;
    }
    // getter or accessor methods
    public double getFahrenheit()
    {
        return ftemp;        
    }
    
    public double getCelsius()
    {
        return (5.0 / 9.0) * (ftemp - 32);
    }
    
    public double getKelvin()
    {
        return ((5.0 / 9.0) * (ftemp - 32.0) + 273.0);
    }
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        return "Celsius temperature is " + df.format(getCelsius()) + 
                "\nFahrenheit temperature is " + df.format(ftemp);
    }
}
