/**
* This class represents a short term forecast and its associated methods
*/
import java.util.*;
public class ShortTerm extends ADO
{
	private int beginningTime;
	public void ShortTerm(){}; //parameters need to be figured out still

	private LinkedList<Hourly> shortTerm = new LinkedList<Hourly>();
	public ShortTerm()
	{
		for (int i =0; i <8; i++)
		{
			//The short term weather should be able to get the next 7 3 hour increments some how
//			Hourly hour1 = new (beginningTime,int air, int wind, double temp, double min, double max, double humid, String windDir, String sky);	// UNCOMMENT WHEN IMPLEMENTING
//			shortTerm.addToLast(hour1);// UNCOMMENT WHEN IMPLEMENTING
		}
	}
/**
* Getter method for the beginning time
*/
	public int beginningTime()
	{
		return beginningTime;
	}
}
