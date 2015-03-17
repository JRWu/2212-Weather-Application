import java.io.*;
import javax.swing.ImageIcon;
import org.apache.commons.io.*;
/**
* March 23, 2014
* CS 2212
* @team 6
* This class represents the objects and methods for the short term forecast
*/

public class ShortTerm implements java.io.Serializable 
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
*
*@return the next 3 hours
*/
	public Hourly getHourly2()
	{
		return shortTerm[1];
	}
/**
*
*@return the next 3 hours
*/
	public Hourly getHourly3()
	{
		return shortTerm[2];
	}
/**
*
*@return the next 3 hours
*/
	public Hourly getHourly4()
	{
		return shortTerm[3];
	}
/**
*
*@return the next 3 hours
*/
	public Hourly getHourly5()
	{
		return shortTerm[4];
	}
/**
*
*@return the next 3 hours
*/
	public Hourly getHourly6()
	{
		return shortTerm[5];
	}
/**
*
*@return the next 3 hours
*/
	public Hourly getHourly7()
	{
		return shortTerm[6];
	}
/**
*
*@return the next 3 hours
*/
	public Hourly getHourly8()
	{
		return shortTerm[7];
	}
}
