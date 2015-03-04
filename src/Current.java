/**
* This class represents the current weather
*/
public class Current extends ADO
{
/**
* Instance variables
*/
	private int time;
/**
* Constructor for the current weather object
*/
	public Current (int now, int air, int wind, double temp, double min, double max, double humid, String windDir, String sky)
	{
		time = now;
//		super (air,wind,temp,min,max,humid,windDir,sky);	// UNCOMMENT WHEN IMPLEMENTING
	}
/**
* Getter method for time
*/
	public int getTime()
	{
		return time;
	}
}