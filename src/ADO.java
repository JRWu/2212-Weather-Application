@author Team 6
/**
* This class represents the general instances variables and classes shared between the different objects
*/
public class ADO
{
/**
* Instance variables
*/
	private int airPressure;
	private int windSpeed;
	private double temperature;
	private double minTemp;
	private double maxTemp;
	private double humidity;
	private String windDirection;
	private String skyCondition;
	private String userPreferences;
/**
* Constructor for the abstract data object
*/
	public ADO (String user, int air, int wind, double temp, double min, double max,double humid, String windDir, String sky)
	{
		userPreferences = user;
		airPressure = air;
		windSpeed = wind;
		temperature = convertTemp(temp,userPreferences);
		minTemp = convertTemp(min, userPreferences);
		maxTemp = convertTemp(max, userPreferences);
		humidity = convertTemp(max,userPreferences);
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
	public void setAirPressure(String pressure)
	{
		airPressure = pressure;
	}
/**
* Getter and seter methods for the wind speed
*/
	public int getWindSpeed()
	{
		return windSpeed;
	}
	public void setWindSpeed(int wind)
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
	public double getHumidity()
	{
		return humidity;
	}
	public void setHumidity(double humid)
	{
		humidity = convertTemp(humid,userPreferences);
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
	public String setPreferences(String user)
	{
		userPreferences = user;
	}	
	
/**
* Converts the temperature value from kelvin to celsius, kelvin to fahrenheit or leaves it based on user preferences
*/

	private double convertTemp(double temperature, String userPreferences)
	{
		if (userPreferences.equals("fahrenheit")
		{
			temperature = ((temperature -273.15)*1.8) + 32;
		}
		if (userPreferences.equals("celsius")
		{
			temperatures = temperature - 273.15;
		}
		else
		{
			return temperature;
		}
		return temperature;
	}
}
