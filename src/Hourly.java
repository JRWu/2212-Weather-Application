import java.io.*;
/**
* This class represents the object for weather in 3 hour intervals
*/
public class Hourly extends ADO implements java.io.Serializable
{
	private int hour;
	public Hourly(int time, String user, int air, double wind, double temp, double min, double max, int humid, String windDir, String sky)
	{
		super (user, air,wind,temp,min,max,humid,windDir,sky);
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
