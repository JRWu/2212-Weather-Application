/**
* This class must be able to determine whether to create a current, shortterm or longterm object based off of input from
* the JSON parser
*/
public class WeatherDataObject extends ADO
{
	private LongTerm longest;
	private ShortTerm shortest;
	private Current currentWeather;
	public WeatherDataObject() //unsure about parameters
	{
		if (findOutObject() == 1)
		{
			longest = buildLongTerm();
		}
		if (findOutObject() == 2)
		{
			shortest = buildShortTerm();
		}
		if (findOutObject() == 3)
		{
			currentWeather = buildCurrent(int now, int air, int wind, double temp, double min, double max, double humid, String windDir, String sky);
		}
	}
	public LongTerm buildLongTerm()
	{
		LongTerm longer = new LongTerm();
		return longer;
	}
	public ShortTerm buildShortTerm()
	{
		ShortTerm shorter = new ShortTerm();
		return shorter;
	}
	public Current buildCurrent (int now, int air, int wind, double temp, double min, double max, double humid, String windDir, String sky)
	{
		Current currrenter = new Current (int now, int air, int wind, double temp, double min, double max, double humid, String windDir, String sky);
		return currenter;
	}
	//return 1,2,or 3 based off of some sort of input to determine which object to build
	public int findOutObject ()
	{
		return 1;
	}
}
