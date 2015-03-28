
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
	private double displayTemp;
	private double minTemp;
	private double displayMinTemp;
	private double maxTemp;
	private double displayMaxTemp;
	private String preferences;
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
        preferences = super.getPreferences();
        temperature = convertTemp(temp, preferences);
    }

    /**
     * @overrides the default mars constructor
     */
    public Mars(int air, double wind, double temp, double min, double max, int humid, String windDir, String sky, ImageIcon state) {
        super(air, wind,humid, windDir, sky, state);
        preferences = super.getPreferences();
        temperature = temp;
        displayTemp = convertTemp(temp, preferences);
        minTemp = min;
        displayMinTemp = convertTemp(min,preferences);
        maxTemp = max;
        displayMaxTemp = convertTemp(max,preferences);
    }
    /**
     * Returns value of temperature of the object
     *
     * @return The temperature of the data object
     */
    public double getTemperature() {
        return displayTemp;
    }
   /**
     * Sets the current temperature based off of a change in units from user preferences
     */
    public void setTempUnits()
    {
    	displayTemp = convertTemp(temperature, preferences);
    }
    /**
     * This method sets the current temperature for the abstract data object
     *
     * @param temp the temperature value to be set
     */
    public void setTemperature(double temp) {
    	temperature = temp;
        displayTemp = convertTemp(temp, preferences);
    }

    /**
     * Returns the minimum temperature of data object
     *
     * @return The minimum temperature for the abstract data object
     */
    public double getMinTemp() {
        return displayMinTemp;
    }

    /**
     * This method sets the minimum temperature for the abstract data object
     *
     * @param min the minimum temperature value to be set
     */
    public void setMinTemp(double min) {
    	minTemp = min;
        displayMinTemp = convertTemp(min, preferences);
    }
     /**
     * Sets the current minimum temperature based off of a change in units from user preferences
     */
    public void setMinTempUnits()
    {
    	displayMinTemp = convertTemp(minTemp,preferences);
    }
    /**
     * Returns max temperature of data object
     *
     * @return The max temperature of the abstract data object
     */
    public double getMaxTemp() {
        return displayMaxTemp;
    }

    /**
     * This method sets the maximum temperature value for the abstract data
     * object
     *
     * @param max the maximum temperature value to be set
     */
    public void setMaxTemp(double max) {
    	maxTemp = max;
        displayMaxTemp = convertTemp(max, preferences);
    }
     /**
     * Sets the current maximum temperature based off of a change in units from user preferences
     */
    public void setMaxTempUnits()
    {
    	displayMaxTemp = convertTemp(maxTemp,preferences);
    }
    
/**
 * 
 * @param temp the temperature to be converted
 * @param preferences The user preferences specifying what units to convert to
 * @return the converted temperature
 */
    public double convertTemp(double temp,String preferences)
    {
    	double temperature;
    	if (preferences.equals("K"))
    	{
    		temperature = temp + 273.15;
    	}
    	else if (preferences.equals("I"))
    	{
    		temperature = (((temp -32)*5)/9) + 273.15;
    	}
    	else
    	{
    		temperature = temp;
    	}
        temperature = Math.round(temperature * 100) / 100D;
    	return temperature;
    }
}
