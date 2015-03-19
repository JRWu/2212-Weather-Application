import java.io.*;
import javax.swing.ImageIcon;
import java.util.GregorianCalendar;
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
	private GregorianCalendar time;
	private GregorianCalendar sunrise;
	private GregorianCalendar sunset;
/**
* Constructor for the current weather object
* @param now the current time for the current weather object
* @param air the air pressure for the current weather object
* @param wind the wind speed for the current weather object
* @param temp the current temperature for the current weather object
* @param min the minimum temperature for the current weather object
* @param max the maximum temperature for the current weather object
* @param humid the humidity for the current weather object
* @param windDir the wind direction for the current weather object
* @param sky the sky condition for the current weather object
* @param rise the projected sunrise time for the current weather object
* @param set the projected sunset time for the current weather object
* @param state the image that goes along with the associated sky condition
*/
	public Current (GregorianCalendar timing, GregorianCalendar rise, GregorianCalendar set, int air, double wind, double temp, double min, double max, int humid, String windDir, String sky, ImageIcon state)
	{
		super (air,wind,temp,min,max,humid,windDir,sky,state);
		time = timing;
		sunrise = rise;
		sunset = set;
	}
/**
* 
* @return the hour of the current weather object
*/
	public GregorianCalendar getTime()
	{
		return time;
	}
/**
* This method sets the current time for the current weather object
* @param timing the time to be set
*/	

	public void setTime(GregorianCalendar timing)
	{
		time = timing;
	}
/**
*
* @return the projected time of the sunrise for the current weather object
*/
	public GregorianCalendar getSunRise()
	{
		return sunrise;
	}
/**
* This method sets the projected sunrise time for the current weather object
* @param the time of the sunrise to be set
*/
	public void setSunRise(GregorianCalendar rise)
	{
		sunrise = rise;
	}
/**
*
* @return the projected time of the sunset for the current weather object
*/
	public GregorianCalendar getSunSet()
	{
		return sunset;
	}
/**
* This method sets the projected sunset time for the current weather object
* @param the time of the sunset to be set
*/
	public void setSunSet (GregorianCalendar set)
	{
		sunset = set;
	}
}
