/**
* This class represents the object for weather in 3 hour intervals
*/
public class Hourly extends ADO
{
	private int hour;
	public Hourly(int time,int air, int wind, double temp, double min, double max, double humid, String windDir, String sky)
	{
		super (air,wind,temp,min,max,humid,windDir,sky);
		hour = time;
	}
/**
* Getter and setter methods for the current hour
*/
	public int getHour()
	{
		return hour;
	}
	public void setHour(int hourly)
	{
		hour = hourly;
	}
}