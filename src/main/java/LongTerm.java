import java.io.*;
import javax.swing.ImageIcon;
import org.apache.commons.io.*;
/**
* March 23, 2014
* CS 2212
* @team 6
* This class represents the objects and methods for the long term forecast
*/

public class LongTerm implements java.io.Serializable 
{
/**
* Instance variables 
*/
	private Daily[] longTerm;
/**
* Constructor for the short term forecast
* @param days the array for the long term forecast
*/
	public LongTerm(Daily[] days)
	{
		longTerm = days;
	}
/**
* Setter method for the long term forecast
* @param days the array for the long term forecast
*/
	public void setLongTerm(Daily[] days)
	{
		longTerm = days;
	}
/**
*
*@return the short term foreceast object
*/
	public Daily[] getLongTerm()
	{
		return longTerm;
	}
/**
*
*@return the object representing the correct day based off an integer input (number between 0 and 4 is entered
*/
	public Daily getDaily(int i)
	{
		return longTerm[i];
	}	
}
