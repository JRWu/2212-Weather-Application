import java.io.*;
/**
* March 8,2014
* CS 2212
* @author team 6
* This class represents the object for the daily weather
*/
public class Daily extends ADO implements java.io.Serializable
{
/**
* Instance variables
*/
	private String day;
/**
* Constructor for the daily weather object
* @param days the current day that the object with representing
* @param air the air pressure for the daily weather object
* @param wind the wind speed for the daily weather object
* @param temp the current temperature for the we daily ather object
* @param min the minimum temperature for the daily weather object
* @param max the maximum temperature for the daily weather object
* @param humid the humidity for the daily weather object
* @param windDir the wind direction for the daily weather object
* @param sky the sky condition for daily the weather object
*/
	public Daily(String days, int air, double wind, double temp, double min, double max, int humid, String windDir, String sky)
	{
		super (air,wind,temp,min,max,humid,windDir,sky);
		day = days;
	}

/**
* 
* @return the current day that the object is representing
*/
	public String getDay()
	{
		return day;
	}
/**
* This method sets the current day that the object is representing
* @param days the day to be set for the day object
*/
	public void setDay(String days)
	{
		day = days;
	}
}
