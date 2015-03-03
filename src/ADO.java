/**
* This class represents the general instances variables and classes shared between the different objects
* @author Team 6
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
	
	public ADO(){}	// UNCOMMENT WHEN IMPLEMENTING
	
	
/**
* Constructor for the abstract data object
*/
	public ADO (int air, int wind, double temp, double min, double max,double humid, String windDir, String sky)
	{
		airPressure = air;
		windSpeed = wind;
		if (setUnits(userPreferences) == 0)
		{
			temperature = kelvinToCelsius(temp);
			minTemp = kelvinToCelsius(min);
			maxTemp = kelvinToCelsius(max);	
			humidity = kelvinToCelsius (humid);	
		}
		else
		{
			temperature = kelvinToFahrenheit(temp);
			minTemp = kelvinToFahrenheit(min);
			maxTemp = kelvinToFahrenheit(max);
			humidity = kelvinToFahrenheit(humid);
		}
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
//		airPressure = pressure;	// UNCOMMENT WHEN IMPLEMENTING
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
		if (setUnits(userPreferences) == 0)
		{
			temperature = kelvinToCelsius(temp);
		}
		else
		{
			temperature = kelvinToFahrenheit(temp);
		}
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
		if (setUnits(userPreferences) == 0)
		{
			minTemp = kelvinToCelsius(min);
		}
		else
		{
			minTemp = kelvinToFahrenheit(min);
		}
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
		if (setUnits(userPreferences) == 0)
		{
			maxTemp = kelvinToCelsius(max);
		}
		else
		{
			maxTemp = kelvinToFahrenheit(max);
		}
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
		if (setUnits(userPreferences) == 0)
		{
			humidity = kelvinToCelsius(humid);
		}
		else
		{
			humidity = kelvinToFahrenheit(humid);
		}
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
* Receives the user preferences to indicate which type of units are to be used
*/
	private int setUnits (String userPreferences)
	{
		if (userPreferences.equals("fahrenheit"))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	} 
	
	/**
	* Converts the temperature value from kelvin to celsius
	*/
	private double kelvinToCelsius(double temperature)
	{
		temperature = temperature - 273.15;
		return temperature;
	}
	/**
	* Converts the temperature value from kelvin to fahrenheit
	*/
	private double kelvinToFahrenheit(double temperature)
	{
		temperature = ((temperature -273.15)*1.8) + 32;
		return temperature;
	}
	
}