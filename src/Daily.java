/**
* This class represents the object for the daily weather
*/
public class Daily extends ADO
{
	private String day;
	public Daily(String days,int air, int wind, double temp, double min, double max, double humid, String windDir, String sky)
	{

//public ADO (String user, int air, double wind, double temp, double min, double max,int humid, String windDir, String sky)

		
		super (air,wind,temp,min,max,humid,windDir,sky);
		day = days;
	}
/**
* getter and setter methods for day
*/
	public String getDay()
	{
		return day;
	}
	public void setDay(String days)
	{
		day = days;
	}
}