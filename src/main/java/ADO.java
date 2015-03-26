import java.io.*;
import javax.swing.ImageIcon;
import org.apache.commons.io.*;

/**
 * The superclass that contains all variables and methods common to all data
 * objects.
 *
 */
public class ADO implements java.io.Serializable {

    /**
     * Instance variables
     */
    private int airPressure;
    private double windSpeed;
    private double temperature;
    private double minTemp;
    private double maxTemp;
    private int humidity;
    private String windDirection;
    private String skyCondition;
    protected String userPreferences = "K";
    private ImageIcon skyState;

    /**
     * This serves as a general constructor for the abstract data object with no
     * parameters
     */
    public ADO() {
        deSerializePreferences();
    }

    /**
     * This serves as a constructor to be implemented in Daily.java
     *
     * @param temp the temperature to be set
     * @param min the minimum temperature
     * @param max the maximum temperature
     * @param sky the condition of the sky
     * @param state an icon representing the sky state
     */
    public ADO(double temp, double min, double max, String sky, ImageIcon state) {
        deSerializePreferences();
        temperature = convertTemp(temp, userPreferences);
        minTemp = convertTemp(min, userPreferences);
        maxTemp = convertTemp(max, userPreferences);
        skyCondition = sky;
        skyState = state;
    }

    /**
     * This serves as the constructor to be implemented in Mars.java
     *
     * @param air the air pressure to be set
     * @param wind the wind speed to be set
     * @param humid the humidity to be set
     * @param windDir the wind direction to be set
     * @param sky the current state of the sky
     * @param state an image that represents the sky state
     */
    public ADO(int air, double wind,int humid, String windDir, String sky, ImageIcon state) {
        deSerializePreferences();
        airPressure = air;
        windSpeed = convertWind(wind,userPreferences);
        humidity = humid;
        windDirection = windDir;
        skyCondition = sky;
        skyState = state;
    }

    /**
     * Constructor for the abstract data object that initializes instance
     * variables and loads the user preferences for units from a text file
     *
     * @param air the air pressure for the abstract data object
     * @param wind the wind speed for the abstract data object
     * @param temp the current temperature for the abstract data object
     * @param min the minimum temperature for the abstract data object
     * @param max the maximum temperature for the abstract data object
     * @param humid the humidity for the abstract data object
     * @param windDir the wind direction for the abstract data object
     * @param sky the sky condition for the abstract data object
     * @param state the image that goes along with the associated sky condition
     */
    public ADO(int air, double wind, double temp, double min, double max, int humid, String windDir, String sky, ImageIcon state) {
        deSerializePreferences();
        airPressure = air;
        windSpeed = convertWind(wind,userPreferences);
        temperature = convertTemp(temp, userPreferences);
        minTemp = convertTemp(min, userPreferences);
        maxTemp = convertTemp(max, userPreferences);
        humidity = humid;
        windDirection = windDir;
        skyCondition = sky;
        skyState = state;
    }

    /**
     * Returns integer air pressure of data object.
     *
     * @return The air pressure of the abstract data object
     */
    public int getAirPressure() {
        return airPressure;
    }

    /**
     * Sets the air pressure for the data object
     *
     * @param pressure the air pressure value
     */
    public void setAirPressure(int pressure) {
        airPressure = pressure;
    }

    /**
     * Returns value of wind speed
     *
     * @return The wind speed of the abstract data object
     */
    public double getWindSpeed() {
        return windSpeed;
    }

    /**
     * This method sets the wind speed for the abstract data object
     *
     * @param wind the wind speed value to be set
     */
    public void setWindSpeed(double wind) {
        windSpeed = convertWind(wind,userPreferences);
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
        temperature = convertTemp(temp, userPreferences);
    }

    /**
     * Returns the minimum temperature of data object
     *
     * @return The minimum temperature for the abstract data object
     */
    public double getMinTemp() {
        return minTemp;
    }

    /**
     * This method sets the minimum temperature for the abstract data object
     *
     * @param min the minimum temperature value to be set
     */
    public void setMinTemp(double min) {
        minTemp = convertTemp(min, userPreferences);
    }

    /**
     * Returns max temperature of data object
     *
     * @return The max temperature of the abstract data object
     */
    public double getMaxTemp() {
        return maxTemp;
    }

    /**
     * This method sets the maximum temperature value for the abstract data
     * object
     *
     * @param max the maximum temperature value to be set
     */
    public void setMaxTemp(double max) {
        maxTemp = convertTemp(max, userPreferences);
    }

    /**
     * Returns the humidity of data object
     *
     * @return The humidity of the data object
     */
    public int getHumidity() {
        return humidity;
    }

    /**
     * This method sets the humidity for the abstract data object
     *
     * @param humid the humidity value to be set
     */
    public void setHumidity(int humid) {
        humidity = humid;
    }

    /**
     * Returns the direction of the wind for the data object
     *
     * @return The wind direction of the abstract data object
     */
    public String getWindDirection() {
        return windDirection;
    }

    /**
     * This method sets the wind direction for the abstract data object
     *
     * @param direction The wind direction to be set
     */
    public void setWindDirection(String direction) {
        windDirection = direction;
    }

    /**
     * Sets the sky condition for the abstract data object
     *
     * @param condition The sky condition to be set
     */
    public String getSkyCondition() {
        return skyCondition;
    }

    /**
     * This method sets the sky condition for the abstract data object
     *
     * @param condition The sky condition to be set
     */
    public void setSkyCondition(String condition) {
        skyCondition = condition;
    }

    /**
     * Returns a string of the user preference for temperature
     *
     * @return The current user preferences for the units to be used for the
     * temperature
     */
    public String getPreferences() {
        return userPreferences;
    }

    /**
     * Returns an image icon of the sky state of the object
     *
     * @return the image associated with the current sky state
     */
    public ImageIcon getCondition() {
        return skyState;
    }

    /**
     *
     * @param newState the new image to represented the updated sky state
     */
    public void setCondition(ImageIcon newState) {
        skyState = newState;
    }

    /**
     * This method converts the temperature value from kelvin to celsius, kelvin
     * to fahrenheit or leaves it in kelvin based on user preferences
     *
     * @param temp The temperature value to be converted
     * @param userPreferences The user preferences that indicate which type of
     * units the user would like for the temperature to be displayed with
     */
    private double convertTemp(double temp, String preferences) {
        double temperature;
        if (preferences.equals("I")) {
            temperature = ((temp - 273.15) * 1.8) + 32;
        } else if (preferences.equals("M")) {
            temperature = temp - 273.15;
        } else {
            temperature = temp;
        }
        temperature = Math.round(temperature * 100) / 100D;
        return temperature;
    }

    private double convertWind(double wind, String preferences)
    {
    	double windy;
    	if (preferences.equals("M")|| preferences.equals("K"))
    	{
    		windy = (wind * 1000)/3600;
    	}
    	else if (preferences.equals("I"))
    	{
    		windy = wind * 2.23694;
    	}
    	else
    	{
    		windy = wind;
    	}
    		windy = Math.round(windy*100)/100D;
    		return windy;
    }
    /**
     * This method saves the user preferences to an external text file
     *
     * @param preferences The user preferences to be saved to an external text
     * file
     */
    public void serializePreferences(String preferences) {
        try {
            FileOutputStream fout = new FileOutputStream("preferences.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(preferences);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        userPreferences = preferences;
    }

    /**
     * This method deserializes the user preferences contained in the text file
     * and loads them to the class
     */
    public void deSerializePreferences() {
        userPreferences = "S";
        try {
            FileInputStream fin = new FileInputStream("preferences.ser");
            ObjectInputStream in = new ObjectInputStream(fin);
            userPreferences = (String) in.readObject();
            if (userPreferences == null) {
                userPreferences = "";
            }
            in.close();
            fin.close();
        } catch (FileNotFoundException e) {
            serializePreferences(userPreferences);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
