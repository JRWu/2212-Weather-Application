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
*@return the object representing the first day
*/
	public Daily getDay1()
	{
		return longTerm[0];
	}
/**
*
*@return the object representing the second day
*/
	public Daily getDay2()
	{
		return longTerm[1];
	}
/**
*
*@return the object representing the third day
*/
	public Daily getDay3()
	{
		return longTerm[2];
	}
/**
*
*@return the object representing the fourth day
*/
	public Daily getDay4()
	{
		return longTerm[3];
	}
/**
*
*@return the object representing the fifth day

*/
	public Daily getDay5()
	{
		return longTerm[4];
	}


}
