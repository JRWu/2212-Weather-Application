import java.io.*;
import javax.swing.ImageIcon;
import org.apache.commons.io.*;
/**
* March 8, 2015
* CS 2212
* @author Team 6
* This class represents the general instances variables and classes shared between the different objects
*/
public class ADO implements java.io.Serializable
{

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
	private String userPreferences = "";
	private ImageIcon skyState;
/**
* This serves as a general constructor for the abstract data object with no parameters
*/
	public ADO(){};
/**
* Constructor for the abstract data object that initializes instance variables and loads the user preferences for units from a text file
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
	public ADO (int air, double wind, double temp, double min, double max,int humid, String windDir, String sky, ImageIcon state)
	{
		deSerializePreferences();
		airPressure = air;
		windSpeed = wind;
		temperature = convertTemp(temp,userPreferences);
		minTemp = convertTemp(min, userPreferences);
		maxTemp = convertTemp(max, userPreferences);
		humidity = humid;
		windDirection = windDir;
		skyCondition = sky;
		skyState = state;
	}
/**
*
* @return The air pressure of the abstract data object
*/
	public int getAirPressure()
	{
		return airPressure;
	}
/**
* This method sets the air pressure for the abstract data object
* @param pressure the air pressure value to be set
*/
	public void setAirPressure(int pressure)
	{
		airPressure = pressure;
	}
/**
*
* @return The wind speed of the abstract data object
*/
	public double getWindSpeed()
	{
		return windSpeed;
	}
/**
* This method sets the wind speed for the abstract data object
* @param wind the wind speed value to be set
*/
	public void setWindSpeed(double wind)
	{
		windSpeed = wind;
	}
/**
*
* @return The current temperature of the abstract data object
*/
	public double getTemperature()
	{
		return temperature;
	}
/**
* This method sets the current temperature for the abstract data object
* @param temp the temperature value to be set
*/
	public void setTemperature (double temp)
	{
		temperature = convertTemp(temp,userPreferences);
	}
/**
*
* @return The minimum temperature for the abstract data object
*/
	public double getMinTemp()
	{
		return minTemp;
	}
/**
* This method sets the minimum temperature for the abstract data object
* @param min the minimum temperature value to be set
*/
	public void setMinTemp(double min)
	{
		minTemp = convertTemp(min,userPreferences);
	}
/**
*
* @return The max temperature of the abstract data object
*/
	public double getMaxTemp()
	{
		return maxTemp;
	}
/**
* This method sets the maximum temperature value for the abstract data object
* @param max the maximum temperature value to be set
*/
	public void setMaxTemp(double max)
	{
		maxTemp = convertTemp(max,userPreferences);
	}
/**
*
* @return The humidity of the abstract data object
*/
	public int getHumidity()
	{
		return humidity;
	}
/**
* This method sets the humidity for the abstract data object
* @param humid the humidity value to be set
*/
	public void setHumidity(int humid)
	{
		humidity = humid;
	}
/**
*
* @return The wind direction of the abstract data object
*/
	public String getWindDirection()
	{
		return windDirection;
	}
/**
* This method sets the wind direction for the abstract data object
* @param direction The wind direction to be set
*/
	public void setWindDirection(String direction)
	{
		windDirection = direction;
	}
/**
*
* @return The condition of the sky for the abstract data object
*/
	public String getSkyCondition()
	{
		return skyCondition;
	} 
/**
* This method sets the sky condition for the abstract data object
* @param condition The sky condition to be set 
*/
	public void setSkyCondition(String condition)
	{
		skyCondition = condition;
	}

/**
*
* @return The current user preferences for the units to be used for the temperature
*/
	public String getPreferences()
	{
		return userPreferences;
	}	
	
/**
*
* @return the image associated with the current sky state
*/
	public ImageIcon getCondition()
	{
		return skyState;
	}
/**
*
* @param newState the new image to represented the updated sky state
*/
	public void setCondition(ImageIcon newState)
	{
		skyState = newState;
	}
/**
* This method converts the temperature value from kelvin to celsius, kelvin to fahrenheit or leaves it in kelvin based on user preferences
* @param temp The temperature value to be converted 
* @param userPreferences The user preferences that indicate which type of units the user would like for the temperature to be displayed with
*/
	private double convertTemp(double temp, String preferences)
	{
        double temperature;
		if (preferences.equals("fahrenheit"))
		{
                    temperature = ((temp -273.15)*1.8) + 32;
		}
        else if (preferences.equals("celsius"))
		{
                    temperature = temp - 273.15;
		} else {
                    temperature = temp;
                }
		temperature = Math.round(temperature*100)/100D;
		return temperature;
	}
/**
* This method saves the user preferences to an external text file
* @param preferences The user preferences to be saved to an external text file
*/
	public void serializePreferences (String preferences)
	{
		try 
		{
			FileOutputStream fout = new FileOutputStream("preferences.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(preferences);
			oos.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		userPreferences = preferences;
	}

/**
* This method deserializes the user preferences contained in the text file and loads them to the class
*/
		public void deSerializePreferences()
		{
			userPreferences = "";
			try
		{
			FileInputStream fin = new FileInputStream("preferences.ser");
			ObjectInputStream in = new ObjectInputStream (fin);
			userPreferences = (String)in.readObject();
			if (userPreferences == null)
				userPreferences ="";
			in.close();
			fin.close();
		}catch (FileNotFoundException e)
		{
			serializePreferences(userPreferences);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}