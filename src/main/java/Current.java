import java.io.*;
import javax.swing.ImageIcon;
import java.util.GregorianCalendar;
import java.util.Calendar;
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
	private int hour;
	private int minute;
	private int second;
	private int milli; 
	private int sunrise;
	private int sunset;
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
	public Current (int rise, int set, int air, double wind, double temp, double min, double max, int humid, String windDir, String sky, ImageIcon state)
	{
		super (air,wind,temp,min,max,humid,windDir,sky,state);
		GregorianCalendar cal = new GregorianCalendar();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
	    	second = cal.get(Calendar.SECOND);
		milli = cal.get(Calendar.MILLISECOND);
		sunrise = rise;
		sunset = set;
	}
/**
* 
* @return the hour of the current weather object
*/
	public int getHour()
	{
		return hour;
	}
/**
* This method sets the hour for the current weather object
* @param hourly the hour to be set
*/
	public void setHour(int hourly)
	{
		hour = hourly;
	}
/**
 * 
 * @return The minute of the current weather object
 */
	public int getMinute()
	{
		return minute;
	}
/**
 * This method sets the minute for the current weather object
 * @param minutes the minute of the current weather object to be 
 */
	public void setMinute(int minutes)
	{
		minute = minutes;
	}
/**
 * 	
 * @return The second of the current weather object
 */
	public int getSecond()
	{
		return second;
	}
/**
 * This method sets the second for the current weather object
 * @param seconds the second to be set
 */
	public void setSecond(int seconds)
	{
		second = seconds;
	}
/**
 * 
 * @return The milliseconds of the current weather object
 */
	public int getMilli()
	{
		return milli;
	}
/**
 * This method sets the current milliseconds in the current weather object
 * @param milli the current milliseconds to be set
 */
	public void setMilli(int millis)
	{
		milli = millis;
	}
/**
*
* @return the projected time of the sunrise for the current weather object
*/
	public int getSunRise()
	{
		return sunrise;
	}
/**
* This method sets the projected sunrise time for the current weather object
* @param the time of the sunrise to be set
*/
	public void setSunRise(int rise)
	{
		sunrise = rise;
	}
/**
*
* @return the projected time of the sunset for the current weather object
*/
	public int getSunSet()
	{
		return sunset;
	}
/**
* This method sets the projected sunset time for the current weather object
* @param the time of the sunset to be set
*/
	public void setSunSet (int set)
	{
		sunset = set;
	}
}
