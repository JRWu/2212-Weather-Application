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
	public Current (String user,int now, int air, double wind, double temp, double min, double max, int humid, String windDir, String sky)
	{
		super (user,air,wind,temp,min,max,humid,windDir,sky);
		time = now;
	}
/**
* Getter method for time
*/
	public int getTime()
	{
		return time;
	}
	public void setTime(int timing)
	{
		time = timing;
	}
        public String getData()
        {
            String s = this.getTemperature() + "\n" + this.getWindSpeed() + " " + this.getWindDirection() + "\n" + this.getAirPressure() + "\n" + this.getHumidity() + "\n" 
                    + this.getSkyCondition() + "\n" + this.getMinTemp() + " " + this.getMaxTemp();
            return s;
        }
}