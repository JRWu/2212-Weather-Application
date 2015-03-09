import java.io.*;
/**
* This class represents the general instances variables and classes shared between the different objects
* @author Team 6
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
	private String userPreferences;
/**
* General constructor
*/
	public ADO(){};
/*
* Constructor for the abstract data object
*/
	public ADO (String user, int air, double wind, double temp, double min, double max,int humid, String windDir, String sky)
	{
		userPreferences = user;
		serializePreferences(userPreferences);
		airPressure = air;
		windSpeed = wind;
		temperature = convertTemp(temp,userPreferences);
		minTemp = convertTemp(min, userPreferences);
		maxTemp = convertTemp(max, userPreferences);
		humidity = humid;
		windDirection = windDir;
		skyCondition = sky;
	}
/**
* Getter and setter methods for the air pressure
*/
	public int getAirPressure()
	{
		return airPressure;
	}
	public void setAirPressure(int pressure)
	{
		airPressure = pressure;
	}
/**
* Getter and seter methods for the wind speed
*/
	public double getWindSpeed()
	{
		return windSpeed;
	}
	public void setWindSpeed(double wind)
	{
		windSpeed = wind;
	}
/**
* Getter and setter methods for the temperature
*/
	public double getTemperature()
	{
		return temperature;
	}
	public void setTemperature (double temp)
	{
		temperature = convertTemp(temp,userPreferences);
	}
/**
* Getter and setter methods for the expected minimum temperature
*/
	public double getMinTemp()
	{
		return minTemp;
	}
	public void setMinTemp(double min)
	{
		minTemp = convertTemp(min,userPreferences);
	}
/**
* Getter and setter methods for the expected maximum temperature
*/
	public double getMaxTemp()
	{
		return maxTemp;
	}
	public void setMaxTemp(double max)
	{
		maxTemp = convertTemp(max,userPreferences);
	}
/**
* Getter and setter methods for the humidity
*/
	public int getHumidity()
	{
		return humidity;
	}
	public void setHumidity(int humid)
	{
		humidity = humid;
	}
/**
* Getter and setter methods for the wind direction
*/
	public String getWindDirection()
	{
		return windDirection;
	}
	public void setWindDirection(String direction)
	{
		windDirection = direction;
	}
/**
* Getter and setter methods for the sky condition
*/
	public String getSkyCondition()
	{
		return skyCondition;
	} 
	public void setSkyCondition(String condition)
	{
		skyCondition = condition;
	}

/**
* Getter and setter methods for user preferences
*/
	public String getPreferences()
	{
		return userPreferences;
	}
/**
* Current user preferences are deserialized and new ones are serialized
*/
	public void setPreferences(String user)
	{
		deSerializePreferences(userPreferences);
		userPreferences = user;
		serializePreferences(userPreferences);
	}	
	
/**
* Converts the temperature value from kelvin to celsius, kelvin to fahrenheit or leaves it based on user preferences
*/

	private double convertTemp(double temperature, String userPreferences)
	{
		if (userPreferences.equals("fahrenheit"))
		{
			temperature = ((temperature -273.15)*1.8) + 32;
		}
		if (userPreferences.equals("celsius"))
		{
			temperature = temperature - 273.15;
		}
		return temperature;
	}
/**
* This method saves the user preferences to an external text file
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
	}

/**
* This method deserializes the current user preferences
*/
	public void deSerializePreferences(String preferences)
	{
		userPreferences = null;
		try
		{
			FileInputStream fin = new FileInputStream("preferences.ser");
			ObjectInputStream in = new ObjectInputStream (fin);
			userPreferences = (String)in.readObject();
			in.close();
			fin.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
