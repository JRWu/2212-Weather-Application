import java.io.*;
import javax.swing.ImageIcon;
import org.apache.commons.io.*;
/**
* March 23, 2014
* CS 2212
* @team 6
* This class represents the objects and methods for the short term forecast
*/

public class ShortTerm extends ADO implements java.io.Serializable 
{
/**
* Instance variables 
*/
	private Hourly[] shortTerm;
/**
* Constructor for the short term forecast
* @param hours the array representing the array of hourly objects for the short term forecast
*/
	public ShortTerm(Hourly[] hours)
	{
		shortTerm = hours;
	}
/**
* Setter method for the short term forecast
* @param hours the array representing the array of hourly objects for the short term forecast
*/
	public void setShortTerm(Hourly[] hours)
	{
		shortTerm = hours;
	}
/**
*
*@return the short term foreceast object
*/
	public Hourly[] getShortTerm()
	{
		return shortTerm;
	}
/**
*
*@return the first 3 hours 
*/
	public Hourly getHourly1()
	{
		return shortTerm[0];
	}
/**
* This method sets the first 3 hours of the short term forecast
* @param hour the object representing the first 3 hours
*/
	public void setHourly1(Hourly hour)
	{
		shortTerm[0] = hour;
	}
/**
*
*@return the object for 3 - 6 am
*/
	public Hourly getHourly2()
	{
		return shortTerm[1];
	}
/**
* This method sets the hourly object for 3-6 am
* @param hour the object representing the forecast for 3-6 am
*/
	public void setHourly2(Hourly hour)
	{
		shortTerm[1] = hour;
	}
/**
*
*@return the object for 6 - 9 am
*/
	public Hourly getHourly3()
	{
		return shortTerm[2];
	}
/**
* This method sets the hourly object for 6-9 am
* @param hour the object representing the forecast for 6-9 am
*/
	public void setHourly3(Hourly hour)
	{
		shortTerm[2] = hour;
	}
/**
*
*@return the object for 9am - 12 pm
*/
	public Hourly getHourly4()
	{
		return shortTerm[3];
	}
/**
* This method sets the hourly object for 9am -12pm
* @param hour the object representing the forecast for 9 am -12 pm
*/
	public void setHourly4(Hourly hour)
	{
		shortTerm[3] = hour;
	}
/**
*
*@return the object for 12pm - 3 pm
*/
	public Hourly getHourly5()
	{
		return shortTerm[4];
	}
/**
* This method sets the hourly object for 12 pm -3pm
* @param hour the object representing the forecast for 12 pm -3 pm
*/
	public void setHourly5(Hourly hour)
	{
		shortTerm[4] = hour;
	}
/**
*
*@return the object for 3 pm - 6 pm
*/
	public Hourly getHourly6()
	{
		return shortTerm[5];
	}
/**
* This method sets the hourly object for 3 pm - 6 pm
* @param hour the object representing the forecast for 3 pm -6 pm
*/
	public void setHourly6(Hourly hour)
	{
		shortTerm[5] = hour;
	}
/**
*
*@return the object for 6 pm -9 pm
*/
	public Hourly getHourly7()
	{
		return shortTerm[6];
	}
/**
* This method sets the hourly object for 6 pm - 9 pm
* @param hour the object representing the forecast for 6 pm -9 pm
*/
	public void setHourly7(Hourly hour)
	{
		shortTerm[6] = hour;
	}
/**
*
*@return the object for 9pm - 12 am
*/
	public Hourly getHourly8()
	{
		return shortTerm[7];
	}
/**
* This method sets the hourly object for 9pm -12am
* @param hour the object representing the forecast for 9 pm -12 am
*/
	public void setHourly8(Hourly hour)
	{
		shortTerm[7] = hour;
	}
}
