
/**
 * March 23, 2015 CS 2212
 *
 * @author team 6 This class represents the weather object for Mars and contains
 * all methods contained within the ADO class
 */
import java.util.*;
import javax.swing.ImageIcon;
import org.apache.commons.io.*;

public class Mars extends ADO {
	/**
	 * Instance variables
	 */
	private double temperature;
	/**
	 * Default constructor for Mars
	 */
	public Mars()
	{
		super();
	}
    /**
     *
     * @param air the air pressure on mars
     * @param wind the wind speed on mars
     * @param temp the temperature on mars
     * @param humid the expected humidity on mars
     * @param windDir the wind direction on mars
     * @param sky the state of the sky on mars
     * @param state an image representing the sky state
     */
    public Mars(int air, double wind, double temp, int humid, String windDir, String sky, ImageIcon state) {
        super(air, wind, humid, windDir, sky, state);
        temperature = convertTemp(temp, this.getPreferences());
    }

    /**
     * @overrides the default mars constructor
     */
    public Mars(int air, double wind, double temp, double min, double max, int humid, String windDir, String sky, ImageIcon state) {
        super(air, wind,humid, windDir, sky, state);
	 temperature = convertTemp(temp, this.getPreferences());
    }
    /**
     * Returns value of temperature of the object
     *
     * @return The temperature of the data object
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * This method sets the current temperature for the abstract data object
     *
     * @param temp the temperature value to be set
     */
    public void setTemperature(double temp) {
        temperature = convertTemp(temp, this.getPreferences());
    }
    
/**
 * 
 * @param temp the temperature to be converted
 * @param preferences The user preferences specifying what units to convert to
 * @return the converted temperature
 */
    private double convertTemp(double temp,String preferences)
    {
    	double temperat;
    	if (preferences.equals("K"))
    	{
    		temperat = temp + 273.15;
    	}
    	else if (preferences.equals("I"))
    	{
    		temperat = (((temp -32)*5)/9) + 273.15;
    	}
    	else
    	{
    		temperat = temp;
    	}
        temperat = Math.round(temperat * 100) / 100D;
    	return temperat;
    }
}
