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
*@return the correct set of hours from short term forecast based off of what is in the short term forecast array (number between 0 and 7 will be entered)
*/
	public Hourly getHourly(int i)
	{
		return shortTerm[i];
	}
}
