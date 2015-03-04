/**
* This class represents a long term forecast and its associated methods
*/
import java.util.*;
public class LongTerm extends ADO
{
	private String day;
	private LinkedList<Day>longTerm = new LinkedList<Day>(); //array would work as well
	public LongTerm () //parameter need to be figured out still
	{
		for (int i = 0; i < 5; i++)
		{
			//the long term weather should be able to get the next 4 days and their weather data some how
			Daily day1 = new Daily (day,int air, int wind, double temp, double min, double max, double humid, String windDir, String sky)
			longTerm.addToLast(day1);
		}
	}
	
/**
* Getter method for the starting day
*/
	public String getDay()
	{
		return day;
	}
}
