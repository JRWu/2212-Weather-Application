import java.io.*;
import javax.swing.ImageIcon;
import org.apache.commons.io.*;
/**
* March 23, 2014
* CS 2212
* @team 6
* This class represents the objects and methods for the long term forecast
*/

public class LongTerm extends ADO implements java.io.Serializable 
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
*@return the object representing monday
*/
	public Daily getMonday()
	{
		return longTerm[0];
	}
/**
* This method sets the value for the object representing monday
* @param monday the object representing monday
*/
	public void setMonday(Daily monday)
	{
		longTerm[0] = monday;
	}
/**
*
*@return the object representing tuesday
*/
	public Daily getTuesday()
	{
		return longTerm[1];
	}
/**
* This method sets the value for the object representing tuesday
* @param monday the object representing tuesday
*/
	public void setTuesday(Daily tuesday)
	{
		longTerm[1] = tuesday;
	}
/**
*
*@return the object representing wednesday
*/
	public Daily getWednesday()
	{
		return longTerm[2];
	}
/**
* This method sets the value for the object representing tuesday
* @param monday the object representing tuesday
*/
	public void setWednesday(Daily wednesday)
	{
		longTerm[2] = wednesday;
	}
/**
*
*@return the object representing thursday
*/
	public Daily getThursday()
	{
		return longTerm[3];
	}
/**
* This method sets the value for the object representing thursday
* @param monday the object representing thursday
*/
	public void setThursday(Daily thursday)
	{
		longTerm[3] = thursday;
	}
/**
*
*@return the object representing friday
*/
	public Daily getFriday()
	{
		return longTerm[4];
	}
/**
* This method sets the value for the object representing friday
* @param monday the object representing friday
*/
	public void setFriday(Daily friday)
	{
		longTerm[4] = friday;
	}
}
