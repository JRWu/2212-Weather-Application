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
	private Daily[] shortTerm;
/**
* Constructor for the short term forecast
* @day1 the object representing the monday forecast
* @day2 the object representing the tuesday forecast
* @day3 the object representing the wednesday forecast
* @day4 the object representing the thursday forecast
* @day5 the object representing the friday forecast
*/
	public ShortTerm(Daily day1, Daily day2, Daily day3, Daily day4, Daily day5)
	{
		shortTerm = new Daily[5];
		shortTerm[0] = day1;
		shortTerm[1] = day2;
		shortTerm[2] = day3;
		shortTerm[3] = day4;
		shortTerm[4] = day5;
	}
/**
* Setter method for the short term forecast
* @day1 the object representing the monday forecast
* @day2 the object representing the tuesday forecast
* @day3 the object representing the wednesday forecast
* @day4 the object representing the thursday forecast
* @day5 the object representing the friday forecast
*/
	public void setShortTerm(Daily day1, Daily day2, Daily day3, Daily day4, Daily day5)
	{
		shortTerm[0] = day1;
		shortTerm[1] = day2;
		shortTerm[2] = day3;
		shortTerm[3] = day4;
		shortTerm[4] = day5;
	}
/**
*
*@return the short term foreceast object
*/
	public Daily[] getShortTerm()
	{
		return shortTerm;
	}
}
