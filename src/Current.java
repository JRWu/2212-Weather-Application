import java.io.*;
/**
* March 8, 2015
* CS 2212
* @author Team 6 
* This class represents the current weather for the application
*/
public class Current extends ADO implements java.io.Serializable
{
/**
* Instance variables
*/
	private int time;
/**
* Constructor for the current weather object
* @param now the current time for the weather object
* @param air the air pressure for the weather object
* @param wind the wind speed for the weather object
* @param temp the current temperature for the weather object
* @param min the minimum temperature for the weather object
* @param max the maximum temperature for the weather object
* @param humid the humidity for the weather object
* @param windDir the wind direction for the weather object
* @param sky the sky condition for the weather object
*/
	public Current (int now, int air, double wind, double temp, double min, double max, int humid, String windDir, String sky)
	{
		super (air,wind,temp,min,max,humid,windDir,sky);
		time = now;
	}
/**
* 
* @return the time of the current weather object
*/
	public int getTime()
	{
		return time;
	}
/**
* This method sets the time for the current weather object
* @param timing the time to be set
*/
	public void setTime(int timing)
	{
		time = timing;
	}
}
