/**
* This class represents the object for the daily weather
*/
public class Daily extends ADO
{
	private String day;
	public Daily(String user, String days,int air, double wind, double temp, double min, double max, int humid, String windDir, String sky)
	{
<<<<<<< HEAD

//public ADO (String user, int air, double wind, double temp, double min, double max,int humid, String windDir, String sky)

		
		super (air,wind,temp,min,max,humid,windDir,sky);
=======
		super (user,air,wind,temp,min,max,humid,windDir,sky);
>>>>>>> 74aa2a78bf659aa2c04f9652c8e3327cf9df7527
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
